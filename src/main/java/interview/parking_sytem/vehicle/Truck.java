package interview.parking_sytem.vehicle;

import lombok.Data;

@Data
public class Truck implements Vehicle{

    private String plateNumber;

    public Truck(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public VehicleType getType() {
        return VehicleType.TRUCK;
    }
}
