import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;

public class ParsedQuery {
    ArrayList<Column> select;
    ArrayList<String> from;
    ArrayList<String> group_by;

    ParsedQuery(){
        select = new ArrayList<>();
        from = new ArrayList<>();
        group_by = new ArrayList<>();
    }
}
