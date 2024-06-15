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
    public queryBuilder where(String logicalOperator,String... condition){
        WhereManager.whereManager(output,condition);
        return this;
    }
    
    @Override
    public String build(){
        return output;
    }

    @Override
    public queryBuilder where(String condition){
        return this;
    }
    @Override
    public queryBuilder innerJoin(String table, String condition){
        InnerJoinManager.innerJoinManager(output, table, condition);
        return this;
    }

    @Override
    public queryBuilder leftJoin(String table,String condition){
        LeftJoinManager.leftJoinManager(output, table, condition);
        return this;
    }

    @Override
    public queryBuilder orderBy(String... columns){
        return this;
    }

    @Override
    public queryBuilder orderBy(String order, String column){
        return this;
    }

    @Override
    public queryBuilder groupBy(String... columns){
        return this;
    }



}
