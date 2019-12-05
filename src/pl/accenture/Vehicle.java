package pl.accenture;

public abstract class Vehicle implements IVehicle{
    String name;

    Vehicle(String name) { this.name = name; }

    @Override
    public String toString() { return name; }

    @Override
    public void go() { System.out.println("GO: " + this.getClass().getSimpleName() + " NAME: " + name); }

    @Override
    public void stop(){ System.out.println("STOP: " + this.getClass().getSimpleName() + " NAME: " + name); }
}
