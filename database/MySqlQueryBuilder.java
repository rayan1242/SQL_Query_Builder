package database;

import QueryManager.*; 

public class MySqlQueryBuilder implements queryBuilder {
    String output;

    @Override
    public queryBuilder select(String... columns){
        SelectManager.selectManager(output,columns);
        return this;
    }

    @Override
    public queryBuilder from(String table){
        FromManager.fromManager(output,table);
        return this;
    }
    
    @Override
    public queryBuilder where(String... condition){
        WhereManager.whereManager(output,condition);
        return this;
    }
    
    @Override
    public String build(){
        return output;
    }
}
