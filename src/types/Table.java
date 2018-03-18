package types;

import java.util.HashMap;

public class Table {
    public String table_name;
    public String table_alias;

    @Override
    public String toString() {
        return "Table Alias: " + table_alias + " Table Name: " + table_name;
    }
}
