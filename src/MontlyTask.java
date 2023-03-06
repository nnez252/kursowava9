import java.time.LocalDate;

public abstract class MontlyTask extends Task{

    public MontlyTask(String titel, Type type, int id, String descriprtion) {
        super(titel, type, id, descriprtion);
    }
    public boolean appearsIn(LocalDate date) {
        return true;
    }
}
