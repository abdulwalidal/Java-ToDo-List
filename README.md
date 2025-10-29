# Java To-Do List

A simple **To-Do List** program in **Java** to manage tasks. This console-based application allows users to add, view, delete, and update tasks.

## Features

- ✅ **Add a Task**: Adds a task to the list
- 📋 **View Tasks**: Displays all tasks in the list
- ❌ **Delete a Task**: Removes a task by its number
- ✏️ **Update a Task**: Updates the description of a specific task
- 🚪 **Exit**: Exits the application

## Requirements

- **Java 8+** (or any higher version)

## Installation and Usage

### 1. Clone the repository

```bash
git clone https://github.com/abdulwalidal/Java-ToDo-List.git
```

### 2. Navigate to the project folder

```bash
cd Java-ToDo-List
```

### 3. Compile the program

```bash
cd src
javac ToDolistt.java
```

### 4. Run the program

```bash
java ToDolistt
```

## How to Use

When you run the program, you'll see a menu with the following options:

```
Welcome to *** To Do List***

 1. Add a Task
 2. View Tasks
 3. Delete a Task
 4. Update a Task
 5. Exit
```

### Menu Options:

1. **Add a Task**: Enter the task name to add it to your list
2. **View Tasks**: View all tasks currently in your To-Do list
3. **Delete a Task**: Specify a task number to delete it from the list
4. **Update a Task**: Choose a task number and enter the new task description to update it
5. **Exit**: Close the program with a thank you message

## Technical Details

### Code Structure

- **Add Task**: Uses an array (`tasklist[]`) to store task names. The `index` variable tracks the current task count.
- **View Tasks**: Loops through `tasklist[]` to display all tasks.
- **Delete Task**: Removes a task and shifts remaining tasks up in the array.
- **Update Task**: Allows modification of a task based on its number.
- **Exit**: Exits the program using `System.exit(0)`.

### Current Limitations

- Maximum of 5 tasks can be stored (array size limitation)
- Tasks are stored in memory only (not persisted to disk)

## Contributing

Feel free to fork this repository and submit pull requests for any improvements!

## License

This project is open source and available for educational purposes.
