package pl.accenture;

public interface IVehicle {
    public abstract double getFuelNeeds();
    public abstract double getDistance();

    default double calculateFuelConsumption() { return getFuelNeeds() / getDistance(); }

    void go();
    void stop();
}
