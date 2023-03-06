import java.time.LocalDate;

public class OneTimeTask extends Task{

    public OneTimeTask(String titel, Type type, int id, String descriprtion) {
        super(titel, type, id, descriprtion);
    }
    public boolean appearsIn(LocalDate date) {
        return false;
    }
}
