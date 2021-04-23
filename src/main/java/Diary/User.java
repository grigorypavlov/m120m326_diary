package Diary;
import java.util.ArrayList;

public class User {

    String username;
    String password;
    int userId;

    ArrayList<Entry> entry = new ArrayList<>();


    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //Habe addEntry aus der Journalklasse entfernt, es ist eine Userfunktion - 30.12.2020 Alwin
    protected void addEntry(Entry e) {
        entry.add(e);
    }

    protected void addEntryText(EntryText et) {
        entry.add(et);

    }

    protected void addEntryRating(EntryRating er) {
        entry.add(er);

    }

    protected String getUsername() {
        return username;
    }

    protected void setUsername(String username) {
        this.username = username;
    }

    protected int getUserId() {
        return userId;
    }

    protected String getPassword() {
        return password;
    }

    protected void setPassword(String password) {
        this.password = password;
    }

}
