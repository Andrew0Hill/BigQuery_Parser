package types;

import java.util.Stack;
public class Column {
    public String alias;
    public String real_name;
    public String table_name;
    public Stack<QueryPart> context;
    public Column(String al, String rn, String tn, Stack<QueryPart> ctxt){
        alias = al;
        real_name = rn;
        table_name = tn;
        context = ctxt;
    }
    @Override
    public String toString(){
        return "Alias: " + alias + "\nReal Name: " + real_name + "\nTable Name: " + table_name + "\nContext: " + context;
    }
}
