import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Triple;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class wemeListener extends wemeGrammarBaseListener{

    private BufferedWriter writer;
    private int indents = 0;
    private List<String> globalVariablesNames = new ArrayList<String>();
    private List<String> localVariablesNames = new ArrayList<String>();
    private List<Triple<String, String, Integer>> functionNames = new ArrayList<>();
    private Map<String, String> classesNames = new HashMap<>();
    private List<String> localParameters = new ArrayList<>();
    private boolean insideFunction = false;
    private String insideClassName = "nil";

    public wemeListener(BufferedWriter bufferedWriter) {
        this.writer = bufferedWriter;
    }

    private void putIndents() {
        try {
            for (int i=0;i<indents;i++) {
                writer.write("\t");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void enterProgram(wemeGrammarParser.ProgramContext ctx) {
        super.enterProgram(ctx);
        try {
            writer.write("//Source code compiled from Weme language\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exitProgram(wemeGrammarParser.ProgramContext ctx) {
        super.exitProgram(ctx);
    }

    @Override
    public void enterDeclaration(wemeGrammarParser.DeclarationContext ctx) {
        super.enterDeclaration(ctx);
    }

    @Override
    public void exitDeclaration(wemeGrammarParser.DeclarationContext ctx) {
        super.exitDeclaration(ctx);
    }

    @Override
    public void enterVarDeclaration(wemeGrammarParser.VarDeclarationContext ctx) {
        super.enterVarDeclaration(ctx);
        if(insideFunction){
            if(localVariablesNames.stream().anyMatch(name -> ctx.IDENT().toString().equals(name)) || localParameters.stream().anyMatch(name -> ctx.IDENT().toString().equals(name))){
                if(localParameters.stream().anyMatch(name -> ctx.IDENT().toString().equals(name))){
                    System.out.println("line "+ ctx.start.getLine()+ ": variable \"" + ctx.IDENT().toString() + "\" overshadows function parameter");
                }else{
                    System.out.println("line "+ ctx.start.getLine()+ ": variable \"" + ctx.IDENT().toString() + "\" already exist");
                }
            }else{
                localVariablesNames.add(ctx.IDENT().toString());
            }
        }else{
            if(globalVariablesNames.stream().anyMatch(name -> ctx.IDENT().toString().equals(name))){
                System.out.println("line "+ ctx.start.getLine()+ ": variable \"" + ctx.IDENT().toString() + "\" already exist");
            }else {
                globalVariablesNames.add(ctx.IDENT().toString());
            }
        }
        try {
            if(ctx.getParent().getRuleIndex() != 11){
                putIndents();
            }
            writer.write("var " + ctx.IDENT());
            if(ctx.getChild(2) == ctx.EQUAL()){
                writer.write(" = ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exitVarDeclaration(wemeGrammarParser.VarDeclarationContext ctx) {
        super.exitVarDeclaration(ctx);
        try {
            writer.write("; ");
            if(ctx.getParent().getRuleIndex() != 11){
                writer.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void enterFunDeclaration(wemeGrammarParser.FunDeclarationContext ctx) {
        super.enterFunDeclaration(ctx);
    }

    @Override
    public void exitFunDeclaration(wemeGrammarParser.FunDeclarationContext ctx) {
        super.exitFunDeclaration(ctx);
    }

    @Override
    public void enterClassDeclaration(wemeGrammarParser.ClassDeclarationContext ctx) {
        super.enterClassDeclaration(ctx);
        insideClassName = ctx.IDENT().get(0).toString();
        if(classesNames.containsKey(ctx.IDENT().get(0).toString())){
            System.out.println("line "+ ctx.start.getLine()+ ": class \"" + ctx.IDENT().get(0).toString() + "\" already exist");
        } else if(ctx.getChild(2) == ctx.INHERIT()) {
            if(classesNames.containsKey(ctx.IDENT().get(1).toString())){
                classesNames.put(ctx.IDENT().get(0).toString(),ctx.IDENT().get(1).toString());
            }else{
                System.out.println("line "+ ctx.start.getLine()+ ": cannot inherit not existing class \"" + ctx.IDENT().get(1).toString() + "\"");
            }
        } else{
            classesNames.put(ctx.IDENT().get(0).toString(), "nil");
        }
        try {
            writer.write("class ");
            writer.write(ctx.IDENT().get(0).toString());
            if(ctx.getChild(2) == ctx.INHERIT()) {
                writer.write(" extends " + ctx.IDENT().get(1).toString());
            }
            writer.write(" {\n");

            putIndents();
            indents++;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exitClassDeclaration(wemeGrammarParser.ClassDeclarationContext ctx) {
        super.exitClassDeclaration(ctx);
        insideClassName = "nil";
        try {
            indents--;
            writer.write("}\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void enterFunction(wemeGrammarParser.FunctionContext ctx) {
        super.enterFunction(ctx);
        int parametersCount = 0;
        if(!ctx.getChild(2).toString().equals(")")){
            int parameters = ctx.getChild(2).getChildCount();
            parametersCount = parameters;
            for(int i=0; i<parameters; i++){
                if(!ctx.getChild(2).getChild(i).toString().equals(",")){
                    localParameters.add(ctx.getChild(2).getChild(i).toString());
                }
            }
        }
        if(ctx.getParent().getRuleIndex() == 4){
            if(functionNames.stream().anyMatch(fun -> fun.a.equals(ctx.IDENT().toString()) && fun.b.equals(ctx.parent.getChild(1).toString()))){
                System.out.println("line "+ ctx.start.getLine()+ ": function named \"" + ctx.IDENT().toString() + "\" already exists in class \""+ insideClassName + "\"");
            }else{
                functionNames.add(new Triple<String,String,Integer>(ctx.IDENT().toString(), ctx.parent.getChild(1).toString(), parametersCount));
            }
        }else{
            if(functionNames.stream().anyMatch(fun -> fun.a.equals(ctx.IDENT().toString()) && fun.b.equals("global"))){
                System.out.println("line "+ ctx.start.getLine()+ ": function named \"" + ctx.IDENT().toString() + "\" already exists");
            }else{
                functionNames.add(new Triple<String,String,Integer>(ctx.IDENT().toString(), "global", parametersCount));
            }
        }
        insideFunction = true;
        try {
            putIndents();

            if(ctx.parent.getRuleIndex() != 4) {
                writer.write("function ");
            }

            writer.write(ctx.IDENT().toString());
            if(ctx.getChild(3) != ctx.RBRACKET()){
                writer.write("(");
                writer.write(")");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitFunction(wemeGrammarParser.FunctionContext ctx) {
        super.exitFunction(ctx);
        localVariablesNames.clear();
        localParameters.clear();
        insideFunction = false;
        try {
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void enterParameters(wemeGrammarParser.ParametersContext ctx) {
        super.enterParameters(ctx);
        try {
            writer.write("(");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exitParameters(wemeGrammarParser.ParametersContext ctx) {
        super.exitParameters(ctx);
        try {
            for(int i=0; i< ctx.getChildCount(); i++){
                writer.write(ctx.getChild(i).toString());
            }
            writer.write(")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void enterStatement(wemeGrammarParser.StatementContext ctx) {
        super.enterStatement(ctx);
        try {
            if(ctx.getParent().getRuleIndex() == 11){
                writer.write(") ");
            } else if (ctx.getParent().getRuleIndex() == 9 && ctx == ctx.getParent().getChild(6)){
                writer.write("else ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exitStatement(wemeGrammarParser.StatementContext ctx) {
        super.exitStatement(ctx);
    }

    @Override
    public void enterIfSt(wemeGrammarParser.IfStContext ctx) {
        super.enterIfSt(ctx);
        try {
            putIndents();
            writer.write("if ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exitIfSt(wemeGrammarParser.IfStContext ctx) {
        super.exitIfSt(ctx);
        try {
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void enterIfElseSt(wemeGrammarParser.IfElseStContext ctx) {
        super.enterIfElseSt(ctx);
        try {
            putIndents();
            writer.write("if ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exitIfElseSt(wemeGrammarParser.IfElseStContext ctx) {
        super.exitIfElseSt(ctx);
        try {
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void enterWhileSt(wemeGrammarParser.WhileStContext ctx) {
        super.enterWhileSt(ctx);
        try {
            putIndents();
            writer.write("while ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exitWhileSt(wemeGrammarParser.WhileStContext ctx) {
        super.exitWhileSt(ctx);
        try {
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void enterForSt(wemeGrammarParser.ForStContext ctx) {
        super.enterForSt(ctx);
        try {
            putIndents();
            writer.write("for (");
            if(ctx.getChild(2).toString().equals(";") && ctx.getChild(3).toString().equals(";")){
                writer.write(";;");
            } else if(ctx.getChild(2).toString().equals(";")){
                writer.write("; ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exitForSt(wemeGrammarParser.ForStContext ctx) {
        super.exitForSt(ctx);
        try {
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void enterPrintSt(wemeGrammarParser.PrintStContext ctx) {
        super.enterPrintSt(ctx);
        try {
            putIndents();
            writer.write("console.log");
        } catch (IOException e) {

        }
    }

    @Override
    public void exitPrintSt(wemeGrammarParser.PrintStContext ctx) {
        super.exitPrintSt(ctx);
        try {
            writer.write(";\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void enterReturnSt(wemeGrammarParser.ReturnStContext ctx) {
        super.enterReturnSt(ctx);
        try {
            putIndents();
            writer.write("return ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exitReturnSt(wemeGrammarParser.ReturnStContext ctx) {
        super.exitReturnSt(ctx);
        try {
            writer.write(";\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void enterBlock(wemeGrammarParser.BlockContext ctx) {
        super.enterBlock(ctx);
        try {
            writer.write("{");
            indents++;
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exitBlock(wemeGrammarParser.BlockContext ctx) {
        super.exitBlock(ctx);
        try {
            indents--;
            putIndents();
            writer.write("}");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void enterExpression(wemeGrammarParser.ExpressionContext ctx) {
        super.enterExpression(ctx);
        try {
            int indexOfCurrentChildNode = ctx.getParent().children.indexOf(ctx);
            int parentRuleIndex = ctx.getParent().getRuleIndex();
            if(indexOfCurrentChildNode == 0 && parentRuleIndex != 20){
                putIndents();
            }
            if (parentRuleIndex > 7 && parentRuleIndex < 13 && parentRuleIndex != 11) {
                writer.write("(");
            } else if(indexOfCurrentChildNode > 0 && parentRuleIndex == 20 && ctx.parent.getChild(indexOfCurrentChildNode - 1).toString().equals(",")){
                writer.write(", ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exitExpression(wemeGrammarParser.ExpressionContext ctx) {
        super.exitExpression(ctx);
        try {
            int parentRuleIndex = ctx.getParent().getRuleIndex();
            if (parentRuleIndex > 7 && parentRuleIndex < 13 && parentRuleIndex != 11) {
                writer.write(")");
            }else if(parentRuleIndex == 11 && ctx.getParent().getChild(2) == ctx){
                writer.write("; ");
            }else if(parentRuleIndex == 11 && ctx.getParent().getChild(3) == ctx){
                writer.write("; ");
            }else if(parentRuleIndex == 11 && ctx.getParent().getChild(4) == ctx && (!ctx.getParent().getChild(2).toString().equals(";") || !ctx.getParent().getChild(3).toString().equals(";"))){
                writer.write("; ");
            }else if(parentRuleIndex == 7){
                writer.write(";\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void enterAssignment(wemeGrammarParser.AssignmentContext ctx) {
        super.enterAssignment(ctx);
        if(insideFunction){
            if(ctx.getChild(0) == ctx.IDENT()){
                if(localVariablesNames.stream().noneMatch(name -> ctx.IDENT().toString().equals(name)) && localParameters.stream().noneMatch(name -> ctx.IDENT().toString().equals(name))) {
                    if (globalVariablesNames.stream().noneMatch(name -> ctx.IDENT().toString().equals(name))) {
                        System.out.println("line "+ ctx.start.getLine()+ ": there is no variable or parameter named \"" + ctx.IDENT().toString() + "\"");
                    }
                }
            }
        }else{
            if(ctx.getChild(0) == ctx.IDENT()){
                if(globalVariablesNames.stream().noneMatch(name -> ctx.IDENT().toString().equals(name))){
                    System.out.println("line "+ ctx.start.getLine()+ ": there is no global variable named \"" + ctx.IDENT().toString() + "\"");
                }
            }
        }
        try {
            if(ctx.call() != null) {
                writer.write(ctx.IDENT().toString());
                writer.write(" = ");
            } else if(ctx.IDENT() != null){
                writer.write(ctx.IDENT().toString());
                writer.write(" = ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exitAssignment(wemeGrammarParser.AssignmentContext ctx) {
        super.exitAssignment(ctx);
    }

    @Override
    public void enterCall(wemeGrammarParser.CallContext ctx) {
        super.enterCall(ctx);
        if(ctx.getChildCount()>1){
            if(!insideClassName.equals("nil")){
                if(ctx.getChild(0).getChild(0).toString().equals("this") ){
                    if(ctx.getChild(1).toString().equals(".")){
                       if(functionNames.stream().noneMatch(fun -> fun.a.equals(ctx.getChild(2).toString()) && fun.b.equals(insideClassName))){
                           System.out.println("line "+ ctx.start.getLine()+ ": there is no \"" + ctx.getChild(2).toString() + "\" function in class \"" + insideClassName + "\"");
                       }
                    }else{
                        System.out.println("line "+ ctx.start.getLine()+ ": \"this\" keyword can only be used with class function name");
                    }
                } else if (ctx.getChild(0).getChild(0).toString().equals("super") ){
                    if(ctx.getChild(1).toString().equals(".")){
                        System.out.println("line "+ ctx.start.getLine()+ ": cannot use dot operator, classes have only functions");
                    } else{
                        String supername = classesNames.get(insideClassName);
                        if(classesNames.containsKey(supername)){
                            if (!supername.equals("nil")){
                                if(functionNames.stream().noneMatch(fun -> fun.a.equals(ctx.getChild(0).getChild(2).toString()) && fun.b.equals(supername))){
                                    System.out.println("line "+ ctx.start.getLine()+ ": there is no \"" + ctx.getChild(0).getChild(2).toString() + "\" function in super class");
                                }
                            }
                        }else{
                            System.out.println("line "+ ctx.start.getLine()+ ": class \"" + insideClassName + "\" does not inherit, cannot use \"super\" keyword");
                        }

                    }
                } else if(localVariablesNames.stream().noneMatch(name -> ctx.getChild(0).getChild(0).toString().equals(name)) && globalVariablesNames.stream().noneMatch(name -> ctx.getChild(0).getChild(0).toString().equals(name)) && localParameters.stream().noneMatch(name -> ctx.getChild(0).getChild(0).toString().equals(name)) && functionNames.stream().noneMatch(name -> ctx.getChild(0).getChild(0).toString().equals(name.a) && (insideClassName.equals(name.b) || name.b.equals("global"))) && !classesNames.containsKey(ctx.getChild(0).getChild(0).toString())){
                    System.out.println("line "+ ctx.start.getLine()+ ": cannot use dot operator after \"" +ctx.getChild(0).getChild(0).toString() + "\"");
                }
            } else{
                if(insideFunction){
                    if(localVariablesNames.stream().noneMatch(name -> ctx.getChild(0).getChild(0).toString().equals(name)) && globalVariablesNames.stream().noneMatch(name -> ctx.getChild(0).getChild(0).toString().equals(name)) && localParameters.stream().noneMatch(name -> ctx.getChild(0).getChild(0).toString().equals(name)) && functionNames.stream().noneMatch(name -> ctx.getChild(0).getChild(0).toString().equals(name.a) && (insideClassName.equals(name.b) || name.b.equals("global")))){
                        System.out.println("line "+ ctx.start.getLine()+ ": cannot use dot operator after \"" +ctx.getChild(0).getChild(0).toString() + "\"");
                    }
                }else{
                    if(globalVariablesNames.stream().noneMatch(name -> ctx.getChild(0).getChild(0).toString().equals(name)) && functionNames.stream().noneMatch(name -> ctx.getChild(0).getChild(0).toString().equals(name.a) && name.b.equals("global")) && !classesNames.containsKey( ctx.getChild(0).getChild(0).toString())){
                        System.out.println("line "+ ctx.start.getLine()+ ": cannot use dot operator after \"" +ctx.getChild(0).getChild(0).toString() + "\"");
                    }
                }
            }
        }else {
            if (insideClassName.equals("nil")) {
                if (ctx.getChild(0).getChild(0).toString().equals("super") || ctx.getChild(0).getChild(0).toString().equals("this")) {
                    if(ctx.getChild(0).getChild(0).toString().equals("super")){
                        System.out.println("line "+ ctx.start.getLine() + ": cannot use \"super\" keyword outside class");
                    }else{
                        System.out.println("line "+ ctx.start.getLine() + ": cannot use \"this\" keyword outside class");
                    }

                }
            }
        }
    }

    @Override
    public void exitCall(wemeGrammarParser.CallContext ctx) {
        super.exitCall(ctx);
    }

    @Override
    public void enterPrimary(wemeGrammarParser.PrimaryContext ctx) {
        super.enterPrimary(ctx);

            try {
                if(ctx.getChild(0) == ctx.IDENT() && ctx.getParent().getChildCount() > 1 && ctx.getParent().getChild(1).getChildCount() > 0 && ctx.getParent().getChild(1).getChild(0).toString().equals("(")){
                    writer.write("new ");
                }
                if(ctx.getChild(0) != ctx.LBRACKET()){
                    writer.write(ctx.getChild(0).toString());
                    if(ctx.getChild(0) == ctx.SUPER()){
                        writer.write(ctx.getChild(1).toString());
                        writer.write(ctx.getChild(2).toString());
                    }
                } else {
                    writer.write("(");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    @Override
    public void exitPrimary(wemeGrammarParser.PrimaryContext ctx) {
        super.exitPrimary(ctx);
        try {
            if(ctx.getChild(0) == ctx.LBRACKET()){
                writer.write(")");
            }
            int indexOfCurrentChildNode = ctx.getParent().children.indexOf(ctx);
            if (indexOfCurrentChildNode + 1 < ctx.getParent().getChildCount() && ctx.parent.getChild(indexOfCurrentChildNode + 1).toString().equals(".")){
                writer.write(".");
                writer.write(ctx.parent.getChild(indexOfCurrentChildNode + 2).toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void enterGroup(wemeGrammarParser.GroupContext ctx) {
        super.enterGroup(ctx);
        int indexOfCurrentChildNode = ctx.getParent().children.indexOf(ctx);
        if(functionNames.stream().anyMatch(fun -> fun.a.equals(ctx.parent.getChild(indexOfCurrentChildNode - 1).toString()))){
            if(ctx.getChildCount()>2 && functionNames.stream().noneMatch(fun -> fun.a.equals(ctx.parent.getChild(indexOfCurrentChildNode - 1).toString()) && fun.c == ctx.getChild(1).getChildCount())){
                System.out.println("line "+ ctx.start.getLine() + ": wrong number of parameters in function \"" + ctx.parent.getChild(indexOfCurrentChildNode - 1).toString() + "\"");
            }
        }
        try {
            writer.write("(");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exitGroup(wemeGrammarParser.GroupContext ctx) {
        super.exitGroup(ctx);
        try {
            writer.write(")");
            int indexOfCurrentChildNode = ctx.getParent().children.indexOf(ctx);
            if (indexOfCurrentChildNode + 1 < ctx.getParent().getChildCount() && ctx.parent.getChild(indexOfCurrentChildNode + 1).toString().equals(".")){
                writer.write(".");
                writer.write(ctx.parent.getChild(indexOfCurrentChildNode + 2).toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void enterArguments(wemeGrammarParser.ArgumentsContext ctx) {
        super.enterArguments(ctx);
    }

    @Override
    public void exitArguments(wemeGrammarParser.ArgumentsContext ctx) {
        super.exitArguments(ctx);
    }

    @Override
    public void enterOrOperation(wemeGrammarParser.OrOperationContext ctx) {
        super.enterOrOperation(ctx);
    }

    @Override
    public void exitOrOperation(wemeGrammarParser.OrOperationContext ctx) {
        super.exitOrOperation(ctx);
    }

    @Override
    public void enterAndOperation(wemeGrammarParser.AndOperationContext ctx) {
        super.enterAndOperation(ctx);
        try {
            int indexOfCurrentChildNode = ctx.getParent().children.indexOf(ctx);
            if (indexOfCurrentChildNode > 0 && ctx.parent.getChild(indexOfCurrentChildNode - 1).toString().equals("or")){
                writer.write(" || ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exitAndOperation(wemeGrammarParser.AndOperationContext ctx) {
        super.exitAndOperation(ctx);
    }

    @Override
    public void enterEqOperation(wemeGrammarParser.EqOperationContext ctx) {
        super.enterEqOperation(ctx);
        try {
            int indexOfCurrentChildNode = ctx.getParent().children.indexOf(ctx);
            if (indexOfCurrentChildNode > 0 && ctx.parent.getChild(indexOfCurrentChildNode - 1).toString().equals("and")){
                writer.write(" && ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exitEqOperation(wemeGrammarParser.EqOperationContext ctx) {
        super.exitEqOperation(ctx);
    }

    @Override
    public void enterCompOperation(wemeGrammarParser.CompOperationContext ctx) {
        super.enterCompOperation(ctx);
        try {
            int indexOfCurrentChildNode = ctx.getParent().children.indexOf(ctx);
            if (indexOfCurrentChildNode > 0 && ctx.parent.getChild(indexOfCurrentChildNode - 1).toString().equals("==")){
                writer.write(" === ");
            } else if (indexOfCurrentChildNode > 0 && ctx.parent.getChild(indexOfCurrentChildNode - 1).toString().equals("!=")){
                writer.write(" !== ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exitCompOperation(wemeGrammarParser.CompOperationContext ctx) {
        super.exitCompOperation(ctx);
    }

    @Override
    public void enterSumOperation(wemeGrammarParser.SumOperationContext ctx) {
        super.enterSumOperation(ctx);
        try {
            int indexOfCurrentChildNode = ctx.getParent().children.indexOf(ctx);
            if (indexOfCurrentChildNode > 0 && ctx.parent.getChild(indexOfCurrentChildNode - 1).toString().equals("<")){
                writer.write(" < ");
            } else if (indexOfCurrentChildNode > 0 && ctx.parent.getChild(indexOfCurrentChildNode - 1).toString().equals(">")){
                writer.write(" > ");
            } else if (indexOfCurrentChildNode > 0 && ctx.parent.getChild(indexOfCurrentChildNode - 1).toString().equals(">=")){
                writer.write(" >= ");
            } else if (indexOfCurrentChildNode > 0 && ctx.parent.getChild(indexOfCurrentChildNode - 1).toString().equals("<=")){
                writer.write(" <= ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exitSumOperation(wemeGrammarParser.SumOperationContext ctx) {
        super.exitSumOperation(ctx);
    }

    @Override
    public void enterMulOperation(wemeGrammarParser.MulOperationContext ctx) {
        super.enterMulOperation(ctx);
        try {
            int indexOfCurrentChildNode = ctx.getParent().children.indexOf(ctx);
            if (indexOfCurrentChildNode > 0 && ctx.parent.getChild(indexOfCurrentChildNode - 1).toString().equals("+")) {
                writer.write(" + ");
            } else if (indexOfCurrentChildNode > 0 && ctx.parent.getChild(indexOfCurrentChildNode - 1).toString().equals("-")) {
                writer.write(" - ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exitMulOperation(wemeGrammarParser.MulOperationContext ctx) {
        super.exitMulOperation(ctx);
    }

    @Override
    public void enterUnary(wemeGrammarParser.UnaryContext ctx) {
        super.enterUnary(ctx);
        try {
            int indexOfCurrentChildNode = ctx.getParent().children.indexOf(ctx);
            if (indexOfCurrentChildNode > 0 && ctx.parent.getChild(indexOfCurrentChildNode - 1).toString().equals("*")) {
                writer.write(" * ");
            } else if (indexOfCurrentChildNode > 0 && ctx.parent.getChild(indexOfCurrentChildNode - 1).toString().equals("/")) {
                writer.write(" / ");
            }

            if(ctx.getChild(0) == ctx.MINUS()){
                writer.write("-");
            } else if(ctx.getChild(0) == ctx.NOT()){
                writer.write("!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exitUnary(wemeGrammarParser.UnaryContext ctx) {
        super.exitUnary(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }

}