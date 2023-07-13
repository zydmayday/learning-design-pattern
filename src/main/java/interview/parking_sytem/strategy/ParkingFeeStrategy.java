package interview.parking_sytem.strategy;

import interview.parking_sytem.ParkedVehicleInfo;

import java.time.temporal.ChronoUnit;

public interface ParkingFeeStrategy {
    long calculateFee(ParkedVehicleInfo parkedVehicleInfo);
}
