package Diary;
import java.sql.SQLException;
import java.util.ArrayList;

public class Journal {
    ArrayList<User> user = new ArrayList<>();


    public void addUser(User u) throws SQLException {
        user.add(u);
        UserSQL.addUser(u);
    }

    public void removeUser(User u) throws SQLException {
        user.remove(u);
        UserSQL.removeUser(u);
    }


}


