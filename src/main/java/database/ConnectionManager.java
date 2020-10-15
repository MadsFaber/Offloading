package database;

import java.sql.*;

public class ConnectionManager {


    public static void updateSql(String query) {
        try  {
            Connection conn = DriverManager.getConnection(QueryManager.connectionString);
            Statement statement = conn.createStatement();
            statement.executeUpdate(query);
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static ResultSet selectSQL(String query) throws SQLException {
        Connection conn = DriverManager.getConnection(QueryManager.connectionString);
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery(query);
        return rs;
    }
}
