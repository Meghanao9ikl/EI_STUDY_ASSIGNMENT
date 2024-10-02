# Ei.study_Assignment
## Exercise - 1: Java Design Patterns Implementation

This project demonstrates the implementation of six different design patterns across three categories: **Behavioral**, **Creational**, and **Structural**. Each pattern is showcased using distinct real-world use cases to highlight its practical functionality.

### Design Patterns Included

#### 1. **Behavioral Patterns**
- **Command Pattern**: Implements a remote control system that switches on devices like lights and fans.
- **State Pattern**: Models a vending machine that exhibits different behaviors based on its current state (Idle, Dispensing).

#### 2. **Creational Patterns**
- **Prototype Pattern**: Demonstrates cloning of objects, such as shapes like rectangles and circles, to create new instances.
- **Abstract Factory Pattern**: Implements a furniture store system where different styles of furniture (Victorian, Modern) are created by their respective factories.

#### 3. **Structural Patterns**
- **Facade Pattern**: Simplifies interactions with a complex home theater system, including components like a projector, speakers, and a media player.
- **Composite Pattern**: Models a company structure where managers assign tasks to their subordinates and manage team operations.

---

## Exercise - 2: Astronaut Daily Schedule Organizer

This is a console-based application designed to help astronauts manage and organize their daily schedules efficiently. The application allows users to add, remove, and view tasks. It incorporates key design patterns like Singleton, Factory, and Observer to ensure maintainability and scalability.

### Features

- Add tasks, including details like description, start time, end time, and priority.
- Remove an existing task.
- View all tasks, sorted by start time.
- Ensure no overlapping between tasks.
- Edit tasks, mark tasks as complete, and filter by priority (optional).
- The system includes robust exception handling and is optimized for performance.

### Design Patterns Utilized

1. **Singleton Pattern**: 
   - The `ScheduleManager` class ensures there is only one instance of the schedule manager for managing all tasks.
   
2. **Factory Pattern**: 
   - The `TaskFactory` class creates different types of tasks dynamically, based on the user's input.

3. **Observer Pattern**: 
   - The `TaskObserver` class notifies the user whenever a conflict is detected, such as overlapping task schedules.

---

## Instructions to Run the Projects

### Prerequisites

- Java 8 or a more recent version should be installed.

### Steps to Execute

1. **Clone this repository** to your local system.
2. **Navigate to the project directory** where the files are stored.
3. **Compile the Java files** using `javac`.
4. **Run the application** using the `java` command.

---
