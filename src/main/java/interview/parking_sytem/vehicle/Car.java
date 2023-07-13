package interview.parking_sytem.vehicle;

import lombok.Data;

@Data
public class Car implements Vehicle{

    private String plateNumber;

    public Car(String plateNumber) {
        this.plateNumber = plateNumber;
    }
    @Override
    public VehicleType getType() {
        return VehicleType.CAR;
    }
}
