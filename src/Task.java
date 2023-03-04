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


    public Task(String titel, Type type, int id, String descriprtion) {
        this.titel = titel;
        this.type = type;
        this.id = ++counter;
        this.descriprtion = descriprtion;
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



    public LocalDateTime getNextExecutionTime() {
        return LocalDateTime.now();
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return IdGenerator == task.IdGenerator && id == task.id && Objects.equals(titel, task.titel) && type == task.type && Objects.equals(dateTime, task.dateTime) && Objects.equals(descriprtion, task.descriprtion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IdGenerator, titel, type, id, dateTime, descriprtion);
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
                '}';
    }
}

