package Diary;
public class EntryRating extends Entry {

    byte rating;

    public EntryRating(String date, byte rating) {
        super(date);
        this.rating = rating;
    }

    public byte getRating() {
        return rating;
    }

    public void setRating(byte rating) {
        this.rating = rating;
    }
}
