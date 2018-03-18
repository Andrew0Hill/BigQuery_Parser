package types;

public class Column {
    public String alias;
    public String real_name;
    public String table_name;

    public Column(String al, String rn, String tn){
        alias = al;
        real_name = rn;
        table_name = tn;
    }
    @Override
    public String toString(){
        return "Alias: " + alias + " Real Name: " + real_name + " Table Name: " + table_name;
    }
}
