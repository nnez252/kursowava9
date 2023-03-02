import java.time.LocalDateTime;
import java.util.Objects;

public class Task {
    private static int counter = 0;

    private int IdGenerator;
    private String titel;
    private Type type;
    private int id;
    private LocalDateTime dateTime;
    private String descriprtion;
    private RepeatFrequency repeatFrequency;
    private boolean isRepeatable;

    public Task(String titel, Type type, int id, String descriprtion, RepeatFrequency repeatFrequency,boolean isRepeatable) {
        this.titel = titel;
        this.type = type;
        this.id = ++counter;
        this.descriprtion = descriprtion;
        this.repeatFrequency = repeatFrequency;
        this.isRepeatable = isRepeatable;
    }

    public int getIdGenerator() {
        return IdGenerator;
    }

    public void setIdGenerator(int idGenerator) {
        IdGenerator = idGenerator;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public Type getType() {
        return type;
    }


    public int getId() {
        return id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }


    public String getDescriprtion() {
        return descriprtion;
    }

    public void setDescriprtion(String descriprtion) {
        this.descriprtion = descriprtion;
    }

    public RepeatFrequency getRepeatFrequency() {
        return repeatFrequency;
    }

    public void setRepeatFrequency(RepeatFrequency repeatFrequency) {
        this.repeatFrequency = repeatFrequency;
    }


    public LocalDateTime getNextExecutionTime() {
        LocalDateTime current = LocalDateTime.now();
        LocalDateTime next = current;
        switch (repeatFrequency) {
            case DAILY:
                next = current.plusDays(1);
                break;
            case WEEKLY:
                next = current.plusWeeks(1);
                break;
            case MONTHLY:
                next = current.plusMonths(1);
                break;
            case YEARLY:
                next = current.plusYears(1);
                break;
        }
        return next;
    }
    public boolean isRepeatable() {
        return isRepeatable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return IdGenerator == task.IdGenerator && id == task.id && isRepeatable == task.isRepeatable && Objects.equals(titel, task.titel) && type == task.type && Objects.equals(dateTime, task.dateTime) && Objects.equals(descriprtion, task.descriprtion) && repeatFrequency == task.repeatFrequency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(IdGenerator, titel, type, id, dateTime, descriprtion, repeatFrequency, isRepeatable);
    }

    @Override
    public String toString() {
        return "Task{" +
                "IdGenerator=" + IdGenerator +
                ", titel='" + titel + '\'' +
                ", type=" + type +
                ", id=" + id +
                ", dateTime=" + dateTime +
                ", descriprtion='" + descriprtion + '\'' +
                ", repeatFrequency=" + repeatFrequency +
                ", isRepeatable=" + isRepeatable +
                '}';
    }
}
