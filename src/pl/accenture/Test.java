package pl.accenture;

public class Test {

    public static void main(String[] args) {
        // write your code here
        Vehicle [] vehicles = {new Car("Car"), new Ship("Ship"), new Plane("Plane"),
                               new Truck("Truck"), new SuperCar("SuperCar")};

        for (Vehicle ve : vehicles) {
            ve.go();
            ve.stop();
            System.out.println("FUEL CONSUMPION : " + ve.calculateFuelConsumption());

            if(ve instanceof Flying) {
                ((Flying) ve).callAirControl();
            }

            System.out.println("##########");

            //TEEEEST
        }
    }
}

