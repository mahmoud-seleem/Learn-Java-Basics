package database;

import java.sql.*;

public class Consumer {

    public static void main(String[] args) {
        final String DATABASE_URL = "jdbc:postgresql://localhost:5432/Test";
        final String USER = "postgres";
        final String PASSWORD = "postgres";
        final String SELECT_QUERY = "SELECT * FROM \"Student\"";
    try(Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD)) {
        System.out.println("Connected to database");
        Statement statement = connection.createStatement(
                ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE
        );
        ResultSet result = statement.executeQuery(SELECT_QUERY);
        ResultSetMetaData  metaData = result.getMetaData();
        int columnCount = metaData.getColumnCount();
        for (int i = 1; i <= columnCount; i++) {
            System.out.print(metaData.getColumnName(i) + "\t");
        }
        System.out.println();
        while (result.next()) {
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(result.getString(i) + "\t");
            }
            System.out.println();
        }
    }
    catch (SQLException e){
        System.out.println("Connection failed");
    }
    }

}
