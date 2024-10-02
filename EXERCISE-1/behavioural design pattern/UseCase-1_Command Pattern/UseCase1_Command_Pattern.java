
// Command Interface
interface Command {
    void execute();
}

// Concrete Command 1
class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}

// Concrete Command 2
class FanOnCommand implements Command {
    private Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.on();
    }
}

// Receiver 1
class Light {
    public void on() {
        System.out.println("Light is On.");
    }
}

// Receiver 2
class Fan {
    public void on() {
        System.out.println("Fan is On.");
    }
}

// Invoker
class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}

public class UseCase1_Command_Pattern {
    public static void main(String[] args) {
        Light light = new Light();
        Fan fan = new Fan();

        Command lightOn = new LightOnCommand(light);
        Command fanOn = new FanOnCommand(fan);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(lightOn);
        remote.pressButton();

        remote.setCommand(fanOn);
        remote.pressButton();
    }
}
