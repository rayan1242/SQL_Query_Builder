package database;

public interface queryBuilder {
    queryBuilder select(String... columns);

    queryBuilder from(String table);

    public queryBuilder where(String logicalOperator, String... condition);

    public queryBuilder where(String condition);

    queryBuilder innerJoin(String table, String onCondition);

    queryBuilder leftJoin(String table, String onCondition);

    queryBuilder orderBy(String... columns);

    queryBuilder orderBy(String order, String column);

    queryBuilder groupBy(String... columns);

    public String build();
}