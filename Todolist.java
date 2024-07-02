import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private ArrayList<String> tasks;
    private Scanner scanner;

    public ToDoList() {
        tasks = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        ToDoList app = new ToDoList();
        app.run();
    }

    public void run() {
        while (true) {
            showMenu();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    deleteTask();
                    break;
                case 3:
                    viewTasks();
                    break;
                case 4:
                    System.out.println("Exiting the application.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void showMenu() {
        System.out.println("\nTo-Do List Application");
        System.out.println("1. Add Task");
        System.out.println("2. Delete Task");
        System.out.println("3. View Tasks");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
    }

    private void addTask() {
        System.out.print("Enter a new task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added.");
    }

    private void deleteTask() {
        System.out.print("Enter the task number to delete: ");
        int taskNumber = Integer.parseInt(scanner.nextLine());
        if (taskNumber > 0 && taskNumber <= tasks.size()) {
            tasks.remove(taskNumber - 1);
            System.out.println("Task deleted.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    private void viewTasks() {
        System.out.println("\nYour Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }
}
