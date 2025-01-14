package Lecture6.Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args){
        toDoList();
    }
    public static void toDoList(){

        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add a new task.");
            System.out.println("2. Mark a task as completed.");
            System.out.println("3. Remove completed tasks.");
            System.out.println("4. Display the task list.");
            System.out.println("5. Exit");
            System.out.print("Enter your choice here: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println(" ");
                    System.out.print("Enter the new task: ");
                    String newTask = scanner.nextLine();
                    tasks.add(newTask);
                    System.out.println("Task added.");
                    System.out.println(" ");
                    break;

                case 2:
                    System.out.println(" ");
                    System.out.println("Select a task to mark as completed:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                    System.out.print("Enter the task number: ");
                    int completedIndex = scanner.nextInt() - 1;
                    scanner.nextLine();
                    if (completedIndex >= 0 && completedIndex < tasks.size()) {
                        tasks.set(completedIndex, tasks.get(completedIndex) + " (completed)");
                        System.out.println("Task marked as completed.");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    System.out.println(" ");
                    break;

                case 3:
                    System.out.println(" ");
                    tasks.removeIf(task -> task.endsWith("(completed)"));
                    System.out.println("Completed tasks removed.");
                    System.out.println(" ");
                    break;

                case 4:
                    System.out.println(" ");
                    System.out.println("Current Tasks:");
                    System.out.println(" ");
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks in the list.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    System.out.println(" ");
                    break;

                case 5:
                    System.out.println(" ");
                    System.out.println("To-Do- List closed!");
                    scanner.close();
                    System.out.println(" ");
                    return;

                default:
                    System.out.println(" ");
                    System.out.println("Invalid choice. Please try again.");
                    System.out.println(" ");

            }
            scanner.close();
        }
    }
}
