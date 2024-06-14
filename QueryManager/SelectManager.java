package QueryManager;

public class SelectManager {
    
    public  static void  selectManager(String output,String... columns){
        output+=("SELECT ");
        for(int i=0;i<columns.length;i++){
            output+=columns[i];
            if(i<columns.length-1){
                output+=", ";
            }
        }
    }

}
