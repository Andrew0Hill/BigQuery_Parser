public class Column {
    String table;
    String column;
    String alias;
    Column(String t, String c, String a){
        table = t;
        column = c;
        alias = a;
    }

    @Override
    public String toString(){
        return "Table: " + table + "\nColumn: " + column + "\nAlias: " + alias +"\n";
    }
}

