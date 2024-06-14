package QueryManager;

public class WhereManager {
    public static void whereManager(String output,String... conditions){
        output+=" WHERE ";
        output+=conditions[0];
        for(int i=1;i<conditions.length;i++){
            if(i<conditions.length-2);
                output+=", ";
            if(i==conditions.length-1){
                output+=" AND ";
            }
            output+=conditions[i];
        }

    }
}
