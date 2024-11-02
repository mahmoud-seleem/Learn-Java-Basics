package database;

import java.sql.*;

public class Consumer {

    public static void main(String[] args) {
        final String DATABASE_URL = "jdbc:postgresql://localhost:5432/Test";
        final String USER = "postgres";
        final String PASSWORD = "postgres";
        final String SELECT_QUERY = "SELECT * FROM \"Student\" order by \"ID\"";
    try(Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD)) {
        DatabaseMetaData metaData0 = connection.getMetaData();
        boolean scrollSensitiveUpdatable = metaData0.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE) &&
                metaData0.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        boolean scrollSensitiveReadOnly = metaData0.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE) &&
                metaData0.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        System.out.println("Connected to database");
        System.out.println(scrollSensitiveUpdatable);
        System.out.println(scrollSensitiveReadOnly);
        return;
//        connection.setAutoCommit(false);
//        Statement statement = connection.createStatement(
//                ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE
//        );
//        ResultSet result = statement.executeQuery(SELECT_QUERY);
//        ResultSetMetaData  metaData = result.getMetaData();
//        int columnCount = metaData.getColumnCount();
//        for (int i = 1; i <= columnCount; i++) {
//            System.out.print(metaData.getColumnName(i) + "\t");
//        }
//        System.out.println();
//        while (result.next()) {
//            for (int i = 1; i <= columnCount; i++) {
//                System.out.print(result.getString(i) + "\t");
//            }
//            System.out.println();
//        }
//        System.out.println("here update begins");
//        result.absolute(1);
//        result.updateString("Name","mohamed");
//        result.updateRow();
//        result.absolute(0);
//        connection.commit();
//        connection.setAutoCommit(true);
//        //result = statement.executeQuery(SELECT_QUERY);
//        System.out.println(result.getMetaData().getColumnCount());
//        for (int i = 1; i <= columnCount; i++) {
//            System.out.print(metaData.getColumnName(i) + "\t");
//        }
//        System.out.println();
//        while (result.next()) {
//            for (int i = 1; i <= columnCount; i++) {
//                System.out.print(result.getString(i) + "\t");
//            }
//            System.out.println();
//        }
    }
    catch (SQLException e){
        System.out.println("Connection failed");
    }
    }

}
