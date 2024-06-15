
import database.MySqlQueryBuilder;

public class Main {
    public static void main(String[] args) {
        MySqlQueryBuilder sqlQuery=new MySqlQueryBuilder();
        sqlQuery.select("name","age")
        .from("user")
        .where("age>18","name=ray")
        .innerJoin("userAddress", "userAddress.userId = users.userId")
        .leftJoin("transaction", "transaction.userId = users.userId")
        .orderBy("asc", "name")
        .orderBy("age")
        .orderBy("desc", "phone")
        .groupBy("gender")
        .groupBy("age");
        System.out.println(sqlQuery.build());
    }

/**
 * -- EXAMPLE --
 * sqlQuery.select("name", "age")
 *                 .from("users")
 *                 .where("age > 18")
 *                 .where("and", "name = ray")
 *                 .innerJoin("userAddress", "userAddress.userId = users.userId")
 *                 .leftJoin("transaction", "transaction.userId = users.userId")
 *                 .orderBy("asc", "name")
 *                 .orderBy("age")
 *                 .orderBy("desc", "phone")
 *                 .groupBy("gender")
 *                 .groupBy("age");
 *  --- OUTPUT ---
 *  SELECT name, age
 *  FROM users
 *  INNER JOIN userAddress ON userAddress.userId = users.userId
 *  LEFT JOIN transaction ON transaction.userId = users.userId
 *  WHERE age > 18 AND name = 'ray'
 *  GROUP BY gender, age
 *  ORDER BY name asc, age, phone desc
 */
}
