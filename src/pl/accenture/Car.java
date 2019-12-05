package pl.accenture;

public class Car extends Vehicle {
    public Car(String name) { super(name); }

    @Override
    public double getFuelNeeds() { return 100; }

    @Override
    final public double getDistance() { return 2000; }
}
