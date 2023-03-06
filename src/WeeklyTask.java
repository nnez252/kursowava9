import java.time.LocalDate;
import java.time.LocalDateTime;

public class WeeklyTask extends Task{

    public WeeklyTask(String titel, Type type, int id, String descriprtion) {
        super(titel, type, id, descriprtion);
    }
    public boolean appearsIn(LocalDate date) {
        return true;
    }
}
