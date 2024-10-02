public class Automation {
    private String condition;
    private String operator;
    private int value;
    private String action;

    public Automation(String condition, String operator, int value, String action) {
        this.condition = condition;
        this.operator = operator;
        this.value = value;
        this.action = action;
    }

    @Override
    public String toString() {
        return "Trigger: If " + condition + " " + operator + " " + value + " then " + action;
    }
}
