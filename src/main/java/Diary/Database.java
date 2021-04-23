package Diary;
import java.sql.*;

public class Database {
    private static Connection connection;
    private Statement statement;

    public static Connection getConnection() {
        return connection;
    }

    public Statement getStatement() {
        return statement;
    }

    public Database(String ip, String db, String username, String password) {
        String url = "jdbc:mysql://" + ip + "/" + db + "?serverTimezone=UTC ";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet doQuery(String query) {
        ResultSet resultSet;
        try {
            resultSet = statement.executeQuery(query);
            return resultSet;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
