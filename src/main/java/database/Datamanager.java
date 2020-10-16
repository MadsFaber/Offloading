package database;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Datamanager {
    static ResultSet resultSet;

    public static String getAllHomos() throws SQLException {
        resultSet = ConnectionManager.selectSQL(QueryManager.selectAllhomos());
        while (resultSet.next()) {
            String name = resultSet.getString(2);
            return name;
        }
        return "";

    }
}

