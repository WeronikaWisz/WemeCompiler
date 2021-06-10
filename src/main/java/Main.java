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
                inputStream = new FileInputStream(new File("src/main/resources/example2.txt"));
            }else{
                inputFile = args[0];
                File initialFile = new File(inputFile);
                inputStream = new FileInputStream(initialFile);
            }

            String outputFile;
            if (args.length < 2) {
                bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/result.js"));
            }else{
                outputFile = args[1];
                bufferedWriter = new BufferedWriter(new FileWriter(outputFile));
            }

            Lexer lexer = new wemeGrammarLexer(CharStreams.fromStream(inputStream));

            TokenStream tokenStream = new CommonTokenStream(lexer);

            wemeGrammarParser parser = new wemeGrammarParser(tokenStream);

            ParseTree tree = parser.program();
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk( new wemeListener(bufferedWriter), tree );
            bufferedWriter.close();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
