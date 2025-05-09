import java.lang.reflect.Array;
import java.util.Scanner;

public class ToDolistt {
    Scanner sc = new Scanner(System.in);

    static String[] tasklist = new String[5];
    static int index = 0;
    int[] taskno;

    public static void display() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to *** To Do List***\n");
        System.out.println(" " + "1. Add a Task");
        System.out.println(" " + "2. View a Task");
        System.out.println(" " + "3. Delete a Task");
        System.out.println(" " + "4. Update a Task");
        System.out.println(" " + "5. Exit");

        System.out.println(" " + "Enter your choice");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                addTask();
                break;
            case 2:
                ViewTask();
                break;
            case 3:
                deleteTask();
                break;
            case 4:
                System.out.println("Update a task");
                break;
            case 5:
                System.out.println("Exit");
                break;
        }
    }

    public static void addTask() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Task name");
        String task = sc.nextLine();

        if (index < tasklist.length) {
            tasklist[index] = task;
            index++;
            System.out.println("Task is added Successfully");
        }
        ToDolistt.display();
    }

    public static void ViewTask() {
        if (index == 0) {
            System.out.println("Your ToDoList is empty");
            display();
        } else {
            System.out.println("Your Tasks : ");
            for (int i = 0; i < index; i++) {
                System.out.println(tasklist[i]);
            }
            display();
        }
    }

    public static void deleteTask() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the task number you want to delete");
        int deletetaskno = sc.nextInt();
        if (deletetaskno > 0 && deletetaskno < index && tasklist[deletetaskno] != null) {
            tasklist[deletetaskno] = null;
            index--;
        } else {
            System.out.println("ToDoList is empty or invalid task number.");
        }

        for (int i = deletetaskno; i < index; i++) {
            tasklist[deletetaskno] = tasklist[i + 1];
        }

        tasklist[index] = null;
        System.out.println("Task is deleted");
        display();
    }

    public static void main(String[] args) {
        ToDolistt.display();
    }
}
