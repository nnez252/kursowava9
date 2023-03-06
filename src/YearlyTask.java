import java.time.LocalDate;

public class YearlyTask extends Task{

    public YearlyTask(String titel, Type type, int id, String descriprtion) {
        super(titel, type, id, descriprtion);
    }
    public boolean appearsIn(LocalDate date) {
        return true;
    }
}
