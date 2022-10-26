package aufgabe9;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.StringJoiner;

public class ToDo implements Comparable<ToDo> {

    private String title;
    private LocalDate createDate;
    private boolean state;


    public ToDo() {
        createDate = LocalDate.now();
        state = false;
    }

    public ToDo(String title) {
        this.title = title;
        createDate = LocalDate.now();
        state = false;
    }




    public void setTitle(String title) {
        this.title = title;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public boolean isState() {
        return state;
    }


    @Override
    public String toString() {


        return String.format("%-20s | %-30s | " + (state  ? "erledigt" : "nicht erledigt"), createDate, title);
    }
    @Override
    public int compareTo(ToDo o) {
        return title.compareTo(o.title);
    }
}
