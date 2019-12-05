package pl.accenture;

public class Plane extends Vehicle implements Flying {
    public Plane(String name) { super(name); }

    @Override
    public double getFuelNeeds() { return 5000; }

    @Override
    public double getDistance() { return 10000; }

    @Override
    public void takeOff() { System.out.println("Take Off"); }

    @Override
    public void land() { System.out.println("Land"); }

    @Override
    public void callAirControl() { System.out.println("Call Air Control"); }

    @Override
    public void go() {
        super.go();
        takeOff();
    }

    @Override
    public void stop() {
        super.stop();
        land();
    }
}
