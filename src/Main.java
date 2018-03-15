import org.antlr.runtime.ANTLRStringStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        String test_query = "WITH cte_1 AS (SELECT column1 AS cte_col_1, column2 AS cte_col_2, column3 FROM table1) SELECT cte_col_1, column3 FROM cte_1 GROUP BY cte_col_2";
        ColumnExtractor ce = new ColumnExtractor();
        CharStream stream = CharStreams.fromString(test_query);
        bigqueryLexer lexer = new bigqueryLexer(stream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        bigqueryParser parser = new bigqueryParser(tokenStream);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(ce,parser.query_statement());

        ce.getParsedQuery().select.forEach(e -> System.out.println(e));
    }
}
