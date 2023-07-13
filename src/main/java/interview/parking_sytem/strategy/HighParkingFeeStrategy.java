package interview.parking_sytem.strategy;

import interview.parking_sytem.ParkedVehicleInfo;

public class HighParkingFeeStrategy implements ParkingFeeStrategy {
    @Override
    public long calculateFee(ParkedVehicleInfo parkedVehicleInfo) {
        var parkingHours = parkedVehicleInfo.getParkingHours();
        switch (parkedVehicleInfo.getVehicle().getType()) {
            case CAR -> {
                return 100 * parkingHours;
            }
            case TRUCK -> {
                return 200 * parkingHours;
            }
            default -> throw new NotSupportedVehicleTypeException();
        }
    }
}
