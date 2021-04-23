package Diary;
import javax.xml.crypto.Data;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class EntryTextSQL {
    static void addEntryText(EntryText e) throws SQLException {

        try {
            PreparedStatement statement = Database.getConnection().prepareStatement("INSERT INTO journalentry (userid, date, entryText) VALUES(?,?,?)");
            statement.setString(1, "1");
            statement.setString(2, e.getDate());
            statement.setString(3, e.getThoughts());

            int i = statement.executeUpdate();
            System.out.println("Rows updated = " + i);
        } catch (SQLException q) {
            throw new SQLException("Adding EntryText to Database failed", q);
        }
    }

}