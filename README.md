<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Smart Home System - README</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
        }
        h1, h2, h3 {
            color: #333;
        }
        code {
            background-color: #f4f4f4;
            padding: 2px 4px;
            border-radius: 4px;
        }
        pre {
            background-color: #f4f4f4;
            padding: 10px;
            border-radius: 4px;
            overflow-x: auto;
        }
        .project-structure {
            white-space: pre-wrap;
        }
    </style>
</head>
<body>

    <h1>Smart Home System</h1>
    <p>This project implements a <strong>Smart Home System</strong> simulation, allowing users to control different smart devices such as lights, thermostats, and door locks. The project is implemented using key object-oriented programming principles and several design patterns to ensure scalability and maintainability.</p>

    <h2>Features</h2>
    <ul>
        <li><strong>Device Management</strong>: Control devices like lights, thermostats, and door locks.</li>
        <li><strong>Automation</strong>: Schedule tasks for devices such as turning on/off at specific times.</li>
        <li><strong>Device Control</strong>: Manage devices through a central hub that coordinates and automates tasks.</li>
        <li><strong>Device Proxy</strong>: A proxy pattern is used to control access to devices, ensuring controlled access.</li>
    </ul>

    <h2>Design Patterns Utilized</h2>
    <ol>
        <li><strong>Factory Pattern</strong>: 
            <p>The <code>DeviceFactory</code> class is responsible for creating different types of smart devices, such as lights, thermostats, and door locks. This pattern enables the system to create device instances dynamically based on user input.</p>
        </li>
        <li><strong>Proxy Pattern</strong>: 
            <p>The <code>DeviceProxy</code> class controls access to the devices. This pattern ensures that all access to smart devices is mediated, allowing for better control and security.</p>
        </li>
        <li><strong>Observer Pattern</strong> (Suggested):
            <p>Although not explicitly in the code, future improvements can use this pattern to monitor device state changes, such as thermostat temperature changes, and automate tasks like turning lights off or locking doors.</p>
        </li>
        <li><strong>Singleton Pattern</strong>: 
            <p>The <code>SmartHomeHub</code> class could be improved to ensure there is only one instance managing all the devices, ensuring centralized control and coordination.</p>
        </li>
    </ol>

    <h2>Classes Overview</h2>
    <ul>
        <li><code>Main.java</code>: The entry point of the application, where the system initializes and runs.</li>
        <li><code>SmartDevice.java</code>: An abstract class representing a smart device with basic operations such as turning on/off.</li>
        <li><code>Light.java</code>, <code>Thermostat.java</code>, <code>DoorLock.java</code>: Concrete implementations of smart devices.</li>
        <li><code>DeviceFactory.java</code>: A factory class responsible for creating instances of different smart devices.</li>
        <li><code>DeviceProxy.java</code>: A proxy class used to control access to the smart devices.</li>
        <li><code>SmartHomeHub.java</code>: A class managing the devices in the system. It coordinates the device operations and schedules.</li>
        <li><code>Automation.java</code>: Manages task automation for smart devices based on triggers or schedules.</li>
        <li><code>ScheduledTask.java</code>: Represents a task scheduled to operate a device at a specific time.</li>
    </ul>

    <h2>Running the Project</h2>

    <h3>Prerequisites</h3>
    <p>Ensure <strong>Java 8</strong> or a newer version is installed on your system.</p>

    <h3>Steps to Run</h3>
    <ol>
        <li><strong>Clone the Repository</strong>:
            <pre><code>git clone https://github.com/your-username/SmartHomeSystem.git</code></pre>
        </li>
        <li><strong>Navigate to the project directory</strong>:
            <pre><code>cd SmartHomeSystem</code></pre>
        </li>
        <li><strong>Compile the Java files</strong>:
            <pre><code>javac *.java</code></pre>
        </li>
        <li><strong>Run the application</strong>:
            <pre><code>java Main</code></pre>
        </li>
    </ol>

    <h2>Example Usage</h2>
    <ol>
        <li><strong>Turn on a Light</strong>: 
            <p>The system allows you to turn on a specific light in the home using a command via the central hub.</p>
        </li>
        <li><strong>Set a Thermostat Schedule</strong>: 
            <p>You can schedule a thermostat to adjust its temperature at certain times.</p>
        </li>
        <li><strong>Automate a Door Lock</strong>: 
            <p>The door lock can be set to automatically lock after a certain trigger or at a particular time.</p>
        </li>
    </ol>

    <hr>

    <h2>Future Enhancements</h2>
    <ul>
        <li><strong>Observer Pattern</strong>: Add an observer mechanism to monitor device state changes and trigger corresponding actions.</li>
        <li><strong>Logging Mechanism</strong>: Implement a robust logging system to track device operations and system activities.</li>
        <li><strong>User Authentication</strong>: Add user authentication to control access to device management functionalities.</li>
    </ul>

    <hr>

    <h2>Project Structure</h2>
    <pre class="project-structure">
├── Automation.java       # Manages task automation for devices
├── DeviceFactory.java    # Factory class for creating smart devices
├── DeviceProxy.java      # Proxy class controlling access to smart devices
├── DoorLock.java         # Concrete class representing a smart door lock
├── Light.java            # Concrete class representing a smart light
├── Main.java             # Main class to run the application
├── ScheduledTask.java    # Represents scheduled tasks for device operations
├── SmartDevice.java      # Abstract class for all smart devices
├── SmartHomeHub.java     # Central hub managing the devices
├── Thermostat.java       # Concrete class representing a smart thermostat
    </pre>

    <hr>

    <h2>License</h2>
    <p>This project is licensed under the MIT License.</p>

</body>
</html>
