import service.ServiceStation;
import transport.Bicycle;
import transport.Car;
import transport.Truck;

public class Main {
    public static void main(String[] args) {

        ServiceStation serviceStation = new ServiceStation();

        Bicycle bicycle = new Bicycle("Welt", 2);
        serviceStation.check(bicycle);

        Car car = new Car("Chery Tiggo", 4);
        serviceStation.check(car);

        Truck truck = new Truck("Volvo", 10);
        serviceStation.check(truck);
    }
}