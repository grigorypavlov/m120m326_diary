package Diary;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Database database = new Database("localhost", "journaldb",  "root", "root");
        //Datenbank Tests
        Journal j = new Journal();
        User TheCodingSnake = new User("TheCodingSnake", "passwort1234");
        User TestSQLremove = new User("TestSQLremove", "testpassword");
        EntryText et = new EntryText("23.04.2021", "Heute war ein guter Tag");
        EntryRating er = new EntryRating("23.04.2021", (byte) 1);

        j.addUser(TheCodingSnake);

        j.addUser(TestSQLremove);
        j.removeUser(TestSQLremove);
        TheCodingSnake.addEntryText(et);
        TheCodingSnake.addEntryRating(er);
    }
}
