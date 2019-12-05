package pl.accenture;

public class SuperCar extends Car {
    public SuperCar(String name) {
        super(name);
    }

    @Override
    public double getFuelNeeds() { return super.getFuelNeeds() * 2; }
}
