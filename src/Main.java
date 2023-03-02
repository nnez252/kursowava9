import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskService task1 = new TaskService();
        TaskService task2 = new TaskService();
        TaskService task3 = new TaskService();
        task1.addTask(new Task("школа", Type.WORK, 1, "домашка", RepeatFrequency.DAILY, true));
        task2.addTask(new Task("прогулка", Type.PERSONAL, 2, "в парке", RepeatFrequency.ONCE, false));
        task3.addTask(new Task("дом", Type.PERSONAL, 3, "уборка", RepeatFrequency.WEEKLY, true));
        task3.removeTask(3);
        task2.getTasksForDay(LocalDate.now());


    }
}