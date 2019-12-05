package pl.accenture;

public class Ship extends Vehicle implements Sailing {
    public Ship(String name) { super(name); }

    @Override
    public void dock() {
        System.out.println("Przybycie do portu");
    }

    @Override
    public double getFuelNeeds() { return 2000; }

    @Override
    public double getDistance() { return 5000; }

    @Override
    public void stop() { dock(); }
}
