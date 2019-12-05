package pl.accenture;

public abstract class Vehicle {
    private String name;

    public Vehicle(String name) { this.name = name; }

    @Override
    public String toString() { return name; }

    public abstract double getFuelNeeds();
    public abstract double getDistance();

    final public double calculateFuelConsumption() { return getFuelNeeds() / getDistance(); }

    public void go() { System.out.println("GO: " + this.getClass().getSimpleName() + " NAME: " + name); }

    public void stop() { System.out.println("STOP: " + this.getClass().getSimpleName() + " NAME: " + name); }
}
