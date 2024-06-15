package QueryManager;

public class InnerJoinManager {
    public static void innerJoinManager(String output,String table,String condition){
        output+=" INNER JOIN "+table;
        output+=" ON "+condition;
    }
}
