package interview.parking_sytem;

import interview.parking_sytem.strategy.HighParkingFeeStrategy;
import interview.parking_sytem.vehicle.Car;
import interview.parking_sytem.vehicle.Truck;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        var parkingLot = new ParkingLot(new HighParkingFeeStrategy());
        var car = new Car("CAR-12345");
        parkingLot.in(car);
        var truck = new Truck("TRUCK-67890");
        parkingLot.in(truck);

        Thread.sleep(1000);

        parkingLot.out(car);

        Thread.sleep(1000);
        parkingLot.out(truck);
    }
}
