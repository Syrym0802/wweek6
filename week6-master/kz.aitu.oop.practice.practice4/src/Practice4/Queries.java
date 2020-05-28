package Practice4;

public class Queries {

    public static String delete(String table , int id){
        return "DELETE FROM '"+table+"' WHERE id = '" + id + "'";
    } // delete from table where 'table_columnt called id' = id;

    public static String select(String table){
        return "SELECT * FROM "+table;
    }

}
