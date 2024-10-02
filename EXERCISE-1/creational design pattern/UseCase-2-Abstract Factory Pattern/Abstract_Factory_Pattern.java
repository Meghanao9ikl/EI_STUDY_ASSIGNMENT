// Abstract Factory
interface FurnitureFactory {
    Chair createChair();

    Sofa createSofa();
}

// Abstract Products
interface Chair {
    void sitOn();
}

interface Sofa {
    void sitOn();
}

// Concrete Factory 1
class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}

// Concrete Factory 2
class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}

// Concrete Products for Victorian Furniture
class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on Victorian Chair.");
    }
}

class VictorianSofa implements Sofa {
    @Override
    public void sitOn() {
        System.out.println("Sitting on Victorian Sofa.");
    }
}

// Concrete Products for Modern Furniture
class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on Modern Chair.");
    }
}

class ModernSofa implements Sofa {
    @Override
    public void sitOn() {
        System.out.println("Sitting on Modern Sofa.");
    }
}

// Usage
public class Abstract_Factory_Pattern {
    public static void main(String[] args) {
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        victorianChair.sitOn();

        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Sofa modernSofa = modernFactory.createSofa();
        modernSofa.sitOn();
    }
}
