// Prototype Interface
abstract class Shape implements Cloneable {
    @Override
    public Shape clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            // This should never happen since we are implementing Cloneable
            return null;
        }
    }
}

// Concrete Prototype 1
class Rectangle extends Shape {
    @Override
    public Shape clone() {
        System.out.println("Cloning Rectangle...");
        return super.clone();
    }
}

// Concrete Prototype 2
class Circle extends Shape {
    @Override
    public Shape clone() {
        System.out.println("Cloning Circle...");
        return super.clone();
    }
}

// Usage
public class Prototype_pattern {
    public static void main(String[] args) {
        Shape rect = new Rectangle();
        Shape clonedRect = rect.clone(); // Output: Cloning Rectangle...

        Shape circle = new Circle();
        Shape clonedCircle = circle.clone(); // Output: Cloning Circle...
    }
}
