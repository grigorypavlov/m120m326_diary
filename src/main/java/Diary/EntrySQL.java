package Diary;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class EntrySQL {
    static void addEntry(Entry e) throws SQLException {

        try {
            PreparedStatement statement = Database.getConnection().prepareStatement("INSERT INTO journalentry (userid, date) VALUES(?,?)");
            statement.setString(1, "1");
            statement.setString(2, e.getDate());

            int i = statement.executeUpdate();
            System.out.println("Rows updated = " + i);
        } catch (SQLException q) {
            throw new SQLException("Adding Entry to Database", q);
        }
    }

}
