package interview.parking_sytem;

import interview.parking_sytem.vehicle.Vehicle;
import lombok.Data;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * 保存了停车场的单个车子的信息，比如车子本身的信息，进出停车场的时间等。
 */
@Data
public class ParkedVehicleInfo {

    private Vehicle vehicle;
    private LocalDateTime start;
    private LocalDateTime end;

    public long getParkingHours() {
        // for testing purpose, change unit to seconds
        return ChronoUnit.SECONDS.between(start, end);
    }
}
