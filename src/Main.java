import base.bigqueryLexer;
import base.bigqueryParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void main(String[] args){
        String test_query = "SELECT sq.sq1, sq.sq2, rt.sq3\n" +
                "FROM (\n" +
                "    SELECT sq1, sq2 \n" +
                "    FROM real_table) as sq, rt";
        String test_query_1 = "SELECT column1 FROM (SELECT col2 AS column1 FROM real_table)";
        String test_query_2 = "WITH cte_1 AS (SELECT cte_col1, cte_col2 FROM table1) SELECT sq.column1, a1.column2, a2.column3 FROM (SELECT col2 AS column1 FROM (SELECT column3 AS col2 FROM nested_table)) AS sq, t1 AS a1,t2 AS a2 ";
        String test_query_3 = "SELECT t1.col1, t2.col1 FROM t1, t2 WHERE t1.col1 = t2.col1 GROUP BY col2";
        LookupBuilder builder = new LookupBuilder();
        CharStream stream = CharStreams.fromString(test_query_2);
        bigqueryLexer lexer = new bigqueryLexer(stream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        bigqueryParser parser = new bigqueryParser(tokenStream);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(builder, parser.parse());
    }
}
