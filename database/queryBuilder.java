package database;

public interface queryBuilder {
    queryBuilder select(String... columns);

    queryBuilder from(String table);

    queryBuilder where(String... conditions);

    public String build();
}