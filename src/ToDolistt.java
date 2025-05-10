import java.lang.reflect.Array;
import java.util.Scanner;

public class ToDolistt {
    static Scanner sc = new Scanner(System.in);

    static String[] tasklist = new String[5]; // String Array for storing tasknames with the size of 5
    static int index = 0; // for tracking the tasks in arrays
    int[] taskno; // have not used this

    public static void display() { // options i will be having in my list
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to *** To Do List***\n");
        System.out.println(" " + "1. Add a Task");
        System.out.println(" " + "2. View a Task");
        System.out.println(" " + "3. Delete a Task");
        System.out.println(" " + "4. Update a Task");
        System.out.println(" " + "5. Exit");

        System.out.println(" " + "Enter your choice");
        int choice = sc.nextInt();
//

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
                updateTask();
                break;
            case 5:
                exit();
                break;
        }
    }

    public static void addTask() {  // adding a task in my todolist
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Task name");
        String task = sc.nextLine();

        if (index < tasklist.length) { // checking if tasklist is not full
            tasklist[index] = task; // this would add task at a specific available position
            index++; // that available position is not free anymore and goes by 1
            System.out.println("Task is added Successfully");
        }
        ToDolistt.display(); // it would again put choices of todolist
    }

    public static void ViewTask() { // viewing all the tasks
        if (index == 0) {  // checking if my list is empty or not
            System.out.println("Your ToDoList is empty");
            display(); // if it is empty this will again give choices of todolist
        } else {
            System.out.println("Your Tasks : ");
            for (int i = 0; i < index; i++) { // this would go through from index 0
                System.out.println(tasklist[i]); // it would print each task
            }
            display(); // choices would be given agan after viewing
        }
    }

    public static void deleteTask() { // deleting a task from the todolist
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the task number you want to delete");
        int deletetaskno = sc.nextInt(); // which task you want to delete
        if (deletetaskno > 0 && deletetaskno < index && tasklist[deletetaskno] != null) {
            tasklist[deletetaskno] = null; // task in deleted
            index--; // would decrease the index too
        } else {
            System.out.println("ToDoList is empty or invalid task number.");
        }

        for (int i = deletetaskno; i < index; i++) { // it starts from the deletetaskno so we can move
            tasklist[deletetaskno] = tasklist[i + 1]; // moving the deleted task forward
        }

        tasklist[index] = null; // deleting the duplicate
        System.out.println("Task is deleted");
        display(); // choices will be given again
    }


    public static void updateTask() {  // updating a task
        System.out.println("Enter the task no you want to update : ");
        int updatedtaskno = sc.nextInt();
        sc.nextLine();
        if((updatedtaskno > 0) && (updatedtaskno <= index) && (tasklist[updatedtaskno-1] != null)) {  // in order to update a task, it must satisfy this coniditon
            System.out.println("Enter your updated task");
            String updatedtaskname = sc.nextLine();
            tasklist[updatedtaskno-1] = updatedtaskname; // the task is updated
            System.out.println("Task is updated successfully");
            display();

        }
        else {
            System.out.println("ToDolist is empty");
            display();
        }


    }


    public static void exit() {
        System.out.println("Thankyou for using ToDoList");
        System.exit(0);
    }





    public static void main(String[] args) {
        ToDolistt.display();
    }
}



