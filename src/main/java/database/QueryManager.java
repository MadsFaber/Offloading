package database;

public class QueryManager {
   public static String connectionString = "jdbc:postgresql://localhost:5432/postgres?user=postgres&password=password";

   public static String selectAllhomos(){
      return "SELECT * FROM test";
   }
}
