package Diary;
import javax.xml.crypto.Data;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserSQL {

    static void addUser(Diary.User u) throws SQLException {
        try {
            PreparedStatement statement = Database.getConnection().prepareStatement("INSERT INTO user (username, password) VALUES(?,?)");
            statement.setString(1, u.getUsername());
            statement.setString(2, u.getPassword());

            int i = statement.executeUpdate();
            System.out.println("Rows updated = " + i);
        } catch (SQLException e) {
            throw new SQLException("Adding user to database failed", e);
        }
    }

    static void removeUser(Diary.User u) throws SQLException {
        try {
            PreparedStatement statement = Database.getConnection().prepareStatement("DELETE FROM user WHERE username=?");
            statement.setString(1, u.getUsername());

            int i = statement.executeUpdate();
            System.out.println("Rows updated = " + i);
        } catch (SQLException e) {
            throw new SQLException("Removing user from database failed", e);
        }
    }


}
