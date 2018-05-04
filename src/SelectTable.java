import org.antlr.v4.runtime.misc.Pair;
import types.Column;
import types.Table;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class SelectTable extends Table{
    static int id = 0;
    // The parent of this SELECT statement. If this is the root SELECT statement, this is NULL.
    // Otherwise (inside a CTE or Subquery) this points to the parent SELECT statement.
    SelectTable parent;

    // Contains the list of columns for the SELECT statement
    ArrayList<Column> column_list;

    // A lookup table that maps aliased names to Table instances.
    // A Table can either be a SelectTable (i.e. a CTE or SubQuery) or a
    // Table, which represents a standard table in a FROM list (i.e. SELECT col FROM table).
    HashMap<String, Table> lookup_table;

    // A lookup table that maps aliased columns to their real table names.
    //HashMap<Pair<String,String>, Column> column_lookup;
    HashMap<String, ArrayList<Column>> column_lookup;
    int tid;
    SelectTable(SelectTable par){
        tid = id++;
        parent = par;
        column_list = new ArrayList<>();
        lookup_table = new HashMap<>();
        column_lookup = new HashMap<>();
    }
    @Override public String toString(){
        return "Table ID: " + tid;
    }
    static SelectTable merge(SelectTable t1, SelectTable t2){
        SelectTable t = new SelectTable(t2.parent);
        t.column_list.addAll(t1.column_list);
        t.column_list.addAll(t2.column_list);
        t.lookup_table.putAll(t1.lookup_table);
        t.lookup_table.putAll(t2.lookup_table);
        t.column_lookup.putAll(t1.column_lookup);
        t.column_lookup.putAll(t2.column_lookup);
        return t;
    }
}
