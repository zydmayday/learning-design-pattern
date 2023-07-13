package interview.parking_sytem.strategy;

import interview.parking_sytem.ParkedVehicleInfo;

public class LowParkingFeeStrategy implements ParkingFeeStrategy {
    @Override
    public long calculateFee(ParkedVehicleInfo parkedVehicleInfo) {
        var parkingHours = parkedVehicleInfo.getParkingHours();
        switch (parkedVehicleInfo.getVehicle().getType()) {
            case CAR -> {
                return 10 * parkingHours;
            }
            case TRUCK -> {
                return 20 * parkingHours;
            }
            default -> throw new NotSupportedVehicleTypeException();
        }
    }
}
