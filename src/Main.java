import classes.Bus;
import classes.Taxi;
import classes.TransportType;
import classes.Truck;

public class Main {
    public static void main(String[] args) {

        TransportType[] transportType = {
                new Taxi(enums.TransportType.CAR, 1.12),
                new Bus(enums.TransportType.BUS,0.6),
                new Truck(enums.TransportType.TRUCK,3.3)
        };
        for (TransportType type : transportType) {
            System.out.println();

            System.out.println(type);
            System.out.println(enums.TransportType.CAR.calculateTravelCost(type.getFare())+" $");
        }
    }
}