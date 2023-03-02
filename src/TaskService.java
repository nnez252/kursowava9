import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TaskService {
    private List<Task> tasks;

    public TaskService() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(int id) {
        Task taskToRemove = null;
        for (Task task : tasks) {
            if (task.getId() == id) {
                taskToRemove = task;
                break;
            }
        }
        if (taskToRemove != null) {
            tasks.remove(taskToRemove);
        }
    }

    public List<Task> getTasksForDay(LocalDate date) {
        List<Task> tasksForDay = new ArrayList<>();
        for (Task task : tasks) {
            if (task.isRepeatable()) {
                LocalDateTime nextExecutionTime = task.getNextExecutionTime();
                if (nextExecutionTime != null && nextExecutionTime.toLocalDate().equals(date)) {
                    tasksForDay.add(task);
                }
            } else {
                LocalDateTime dateTime = task.getDateTime();
                if (date.equals(dateTime.toLocalDate())) {
                    tasksForDay.add(task);
                }
            }
        }
        return tasksForDay;
    }
}
