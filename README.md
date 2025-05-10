## Description
A simple **To-Do List** program in **Java** to manage tasks. This console-based application allows users to add, view, delete, and update tasks.

## Features
- **Add a Task**: Adds a task to the list.
- **View Tasks**: Displays all tasks in the list.
- **Delete a Task**: Removes a task by its number.
- **Update a Task**: Updates the description of a specific task.
- **Exit**: Exits the application.

## Requirements
- **Java 8+** (or any higher version).

## How to Run

1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/todolist-java.git
````

2. **Navigate to the project folder**:

   ```bash
   cd todolist-java
   ```

3. **Compile the program**:

   ```bash
   javac ToDolistt.java
   ```

4. **Run the program**:

   ```bash
   java ToDolistt
   ```

## Usage

### Menu Options:

1. **Add a Task**: Enter the task name to add it to the list.
2. **View Tasks**: View all tasks currently in your To-Do list.
3. **Delete a Task**: Specify a task number to delete it.
4. **Update a Task**: Choose a task number and enter the new task description to update.
5. **Exit**: Close the program with a thank you message.

## Code Overview

* **Add Task**: Uses an array (`tasklist[]`) to store task names. The `index` variable tracks the current task count.
* **View Tasks**: Loops through `tasklist[]` to display tasks.
* **Delete Task**: Removes a task and shifts remaining tasks up in the array.
* **Update Task**: Allows modification of a task based on its number.
* **Exit**: Exits the program using `System.exit(0)`.
