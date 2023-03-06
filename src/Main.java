import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TaskService task1 = new TaskService();
        TaskService task2 = new TaskService();
        TaskService task3 = new TaskService();
        TaskService task4 = new TaskService();
        TaskService task5 = new TaskService();
        task1.addTask(new DailyTask("школа", Type.WORK, 1, "домашка" ));
        task2.addTask(new OneTimeTask("прогулка", Type.PERSONAL, 2, "в парке"));
        task3.addTask(new WeeklyTask("дом", Type.PERSONAL, 3, "уборка"));
        task4.addTask(new YearlyTask("День рожденье", Type.PERSONAL, 4, "подруги"));
        task5.addTask(new OneTimeTask("Встреча", Type.PERSONAL, 5, "с незнакомцем"));
        task3.removeTask(3);
        task2.getTasksForDay(LocalDate.now());


    }
}