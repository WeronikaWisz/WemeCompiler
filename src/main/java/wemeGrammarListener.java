// Generated from wemeGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link wemeGrammarParser}.
 */
public interface wemeGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link wemeGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(wemeGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link wemeGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(wemeGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link wemeGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(wemeGrammarParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link wemeGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(wemeGrammarParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link wemeGrammarParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(wemeGrammarParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link wemeGrammarParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(wemeGrammarParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link wemeGrammarParser#funDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunDeclaration(wemeGrammarParser.FunDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link wemeGrammarParser#funDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunDeclaration(wemeGrammarParser.FunDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link wemeGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(wemeGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link wemeGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(wemeGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link wemeGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(wemeGrammarParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link wemeGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(wemeGrammarParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link wemeGrammarParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(wemeGrammarParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link wemeGrammarParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(wemeGrammarParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link wemeGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(wemeGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link wemeGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(wemeGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link wemeGrammarParser#ifSt}.
	 * @param ctx the parse tree
	 */
	void enterIfSt(wemeGrammarParser.IfStContext ctx);
	/**
	 * Exit a parse tree produced by {@link wemeGrammarParser#ifSt}.
	 * @param ctx the parse tree
	 */
	void exitIfSt(wemeGrammarParser.IfStContext ctx);
	/**
	 * Enter a parse tree produced by {@link wemeGrammarParser#ifElseSt}.
	 * @param ctx the parse tree
	 */
	void enterIfElseSt(wemeGrammarParser.IfElseStContext ctx);
	/**
	 * Exit a parse tree produced by {@link wemeGrammarParser#ifElseSt}.
	 * @param ctx the parse tree
	 */
	void exitIfElseSt(wemeGrammarParser.IfElseStContext ctx);
	/**
	 * Enter a parse tree produced by {@link wemeGrammarParser#whileSt}.
	 * @param ctx the parse tree
	 */
	void enterWhileSt(wemeGrammarParser.WhileStContext ctx);
	/**
	 * Exit a parse tree produced by {@link wemeGrammarParser#whileSt}.
	 * @param ctx the parse tree
	 */
	void exitWhileSt(wemeGrammarParser.WhileStContext ctx);
	/**
	 * Enter a parse tree produced by {@link wemeGrammarParser#forSt}.
	 * @param ctx the parse tree
	 */
	void enterForSt(wemeGrammarParser.ForStContext ctx);
	/**
	 * Exit a parse tree produced by {@link wemeGrammarParser#forSt}.
	 * @param ctx the parse tree
	 */
	void exitForSt(wemeGrammarParser.ForStContext ctx);
	/**
	 * Enter a parse tree produced by {@link wemeGrammarParser#printSt}.
	 * @param ctx the parse tree
	 */
	void enterPrintSt(wemeGrammarParser.PrintStContext ctx);
	/**
	 * Exit a parse tree produced by {@link wemeGrammarParser#printSt}.
	 * @param ctx the parse tree
	 */
	void exitPrintSt(wemeGrammarParser.PrintStContext ctx);
	/**
	 * Enter a parse tree produced by {@link wemeGrammarParser#returnSt}.
	 * @param ctx the parse tree
	 */
	void enterReturnSt(wemeGrammarParser.ReturnStContext ctx);
	/**
	 * Exit a parse tree produced by {@link wemeGrammarParser#returnSt}.
	 * @param ctx the parse tree
	 */
	void exitReturnSt(wemeGrammarParser.ReturnStContext ctx);
	/**
	 * Enter a parse tree produced by {@link wemeGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(wemeGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link wemeGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(wemeGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link wemeGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(wemeGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link wemeGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(wemeGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link wemeGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(wemeGrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link wemeGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(wemeGrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link wemeGrammarParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(wemeGrammarParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link wemeGrammarParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(wemeGrammarParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link wemeGrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(wemeGrammarParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link wemeGrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(wemeGrammarParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link wemeGrammarParser#group}.
	 * @param ctx the parse tree
	 */
	void enterGroup(wemeGrammarParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link wemeGrammarParser#group}.
	 * @param ctx the parse tree
	 */
	void exitGroup(wemeGrammarParser.GroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link wemeGrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(wemeGrammarParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link wemeGrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(wemeGrammarParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link wemeGrammarParser#orOperation}.
	 * @param ctx the parse tree
	 */
	void enterOrOperation(wemeGrammarParser.OrOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link wemeGrammarParser#orOperation}.
	 * @param ctx the parse tree
	 */
	void exitOrOperation(wemeGrammarParser.OrOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link wemeGrammarParser#andOperation}.
	 * @param ctx the parse tree
	 */
	void enterAndOperation(wemeGrammarParser.AndOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link wemeGrammarParser#andOperation}.
	 * @param ctx the parse tree
	 */
	void exitAndOperation(wemeGrammarParser.AndOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link wemeGrammarParser#eqOperation}.
	 * @param ctx the parse tree
	 */
	void enterEqOperation(wemeGrammarParser.EqOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link wemeGrammarParser#eqOperation}.
	 * @param ctx the parse tree
	 */
	void exitEqOperation(wemeGrammarParser.EqOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link wemeGrammarParser#compOperation}.
	 * @param ctx the parse tree
	 */
	void enterCompOperation(wemeGrammarParser.CompOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link wemeGrammarParser#compOperation}.
	 * @param ctx the parse tree
	 */
	void exitCompOperation(wemeGrammarParser.CompOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link wemeGrammarParser#sumOperation}.
	 * @param ctx the parse tree
	 */
	void enterSumOperation(wemeGrammarParser.SumOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link wemeGrammarParser#sumOperation}.
	 * @param ctx the parse tree
	 */
	void exitSumOperation(wemeGrammarParser.SumOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link wemeGrammarParser#mulOperation}.
	 * @param ctx the parse tree
	 */
	void enterMulOperation(wemeGrammarParser.MulOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link wemeGrammarParser#mulOperation}.
	 * @param ctx the parse tree
	 */
	void exitMulOperation(wemeGrammarParser.MulOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link wemeGrammarParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(wemeGrammarParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link wemeGrammarParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(wemeGrammarParser.UnaryContext ctx);
}