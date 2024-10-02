// State Interface
interface VendingMachineState {
    void handle();
}

// Concrete State 1: Idle State
class IdleState implements VendingMachineState {
    @Override
    public void handle() {
        System.out.println("Vending Machine is Idle. Insert coins to select an item.");
    }
}

// Concrete State 2: Dispensing State
class DispensingState implements VendingMachineState {
    @Override
    public void handle() {
        System.out.println("Dispensing the selected item...");
    }
}

// Context
class VendingMachine {
    private VendingMachineState state;

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public void process() {
        state.handle();
    }
}

// Usage
public class UseCase2_State_Pattern {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        machine.setState(new IdleState());
        machine.process();

        machine.setState(new DispensingState());
        machine.process();
    }
}
