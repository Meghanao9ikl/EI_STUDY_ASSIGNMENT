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
# Smart Home System

This project implements a **Smart Home System** simulation, allowing users to control different smart devices such as lights, thermostats, and door locks. The project is implemented using key object-oriented programming principles and several design patterns to ensure scalability and maintainability.

## Features

- **Device Management**: Control devices like lights, thermostats, and door locks.
- **Automation**: Schedule tasks for devices such as turning on/off at specific times.
- **Device Control**: Manage devices through a central hub that coordinates and automates tasks.
- **Device Proxy**: A proxy pattern is used to control access to devices, ensuring controlled access.
  
## Design Patterns Utilized

1. **Factory Pattern**:
   - The `DeviceFactory` class is responsible for creating different types of smart devices, such as lights, thermostats, and door locks. This pattern enables the system to create device instances dynamically based on user input.

2. **Proxy Pattern**:
   - The `DeviceProxy` class controls access to the devices. This pattern ensures that all access to smart devices is mediated, allowing for better control and security.

3. **Observer Pattern** (Suggested):
   - Although not explicitly in the code, future improvements can use this pattern to monitor device state changes, such as thermostat temperature changes, and automate tasks like turning lights off or locking doors.

4. **Singleton Pattern**:
   - The `SmartHomeHub` class could be improved to ensure there is only one instance managing all the devices, ensuring centralized control and coordination.

## Classes Overview

- **Main.java**: The entry point of the application, where the system initializes and runs.
- **SmartDevice.java**: An abstract class representing a smart device with basic operations such as turning on/off.
- **Light.java**, **Thermostat.java**, **DoorLock.java**: Concrete implementations of smart devices.
- **DeviceFactory.java**: A factory class responsible for creating instances of different smart devices.
- **DeviceProxy.java**: A proxy class used to control access to the smart devices.
- **SmartHomeHub.java**: A class managing the devices in the system. It coordinates the device operations and schedules.
- **Automation.java**: Manages task automation for smart devices based on triggers or schedules.
- **ScheduledTask.java**: Represents a task scheduled to operate a device at a specific time.

## Instructions to Run the Projects

## Running the Project

### Prerequisites
- Ensure **Java 8** or a newer version is installed on your system.

### Steps to Run both Exercise 1 and Exercise 2

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/Meghanao9ikl/EI_STUDY_ASSIGNMENT.git
2. **Navigate to project directory**
   ```bash
   cd MarsRoverSimulation
4. **Compile the java files**
   ```bash
   javac *.java
6. **Run the Application**
   ```bash
   java Main
