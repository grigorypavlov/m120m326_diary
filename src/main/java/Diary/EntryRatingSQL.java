package Diary;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class EntryRatingSQL {
    static void addEntryRating(EntryRating e) throws SQLException {

        try {
            PreparedStatement statement = Database.getConnection().prepareStatement("INSERT INTO journalentry (userid, date, entryRating) VALUES(?,?,?)");
            statement.setString(1, "1");
            statement.setString(2, e.getDate());
            statement.setByte(3, e.getRating());

            int i = statement.executeUpdate();
            System.out.println("Rows updated = " + i);
        } catch (SQLException q) {
            throw new SQLException("Adding EntryRating to Database failed", q);
        }
    }

}