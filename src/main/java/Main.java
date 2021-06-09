import java.io.*;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void main(String[] args) {
        System.out.println("Weme Compiler");
        try {
            String inputFile;
            InputStream inputStream;
            BufferedWriter bufferedWriter;
            if (args.length == 0){
                inputStream = new FileInputStream(new File("/Users/Weronika/IdeaProjects/Weme/src/main/resources/exampleError2.txt"));
            }else{
                inputFile = args[0];
                File initialFile = new File(inputFile);
                inputStream = new FileInputStream(initialFile);
            }

            String outputFile;
            if (args.length < 2) {
                bufferedWriter = new BufferedWriter(new FileWriter("/Users/Weronika/IdeaProjects/Weme/src/main/resources/result.js"));
            }else{
                outputFile = args[1];
                bufferedWriter = new BufferedWriter(new FileWriter(outputFile));
            }
            /*
             * get the input file as an InputStream
             */
//            InputStream inputStream = Main.class.getResourceAsStream("/example1.txt");
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile));
            /*
             * make Lexer
             */
            Lexer lexer = new wemeGrammarLexer(CharStreams.fromStream(inputStream));
            /*
             * get a TokenStream on the Lexer
             */
            TokenStream tokenStream = new CommonTokenStream(lexer);
            /*
             * make a Parser on the token stream
             */
            wemeGrammarParser parser = new wemeGrammarParser(tokenStream);
            /*
             * get the top node of the AST. This corresponds to the topmost rule of equation.q4, "equation"
             */
            ParseTree tree = parser.program();
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk( new wemeListener(bufferedWriter), tree );
            bufferedWriter.close();
//            @SuppressWarnings("unused")
//            wemeGrammarParser.ProgramContext startRuleContext = parser.program();
        } catch (IOException e) {

            e.printStackTrace();
        }
//        } catch (Throwable e){
//            e.getMessage();
//        }
    }
}
