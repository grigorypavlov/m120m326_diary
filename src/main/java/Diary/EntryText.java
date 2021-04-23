package Diary;
public class EntryText extends Entry {

    String thoughts;

    public EntryText(String date, String thoughts) {
        super(date);
        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }

    public void setThoughts(String thoughts) {
        this.thoughts = thoughts;
    }
}
