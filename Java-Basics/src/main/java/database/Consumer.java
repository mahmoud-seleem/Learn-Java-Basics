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
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(SELECT_QUERY);
    }
    catch (SQLException e){
        System.out.println("Connection failed");
    }
    }

}
