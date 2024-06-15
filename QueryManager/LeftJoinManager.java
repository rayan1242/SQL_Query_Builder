package QueryManager;

public class LeftJoinManager {
    public static void leftJoinManager(String output,String table,String condition){
        output+=" LEFT JOIN "+table;
        output+=" ON "+condition;
    }
}
