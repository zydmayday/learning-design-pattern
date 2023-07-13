package interview.parking_sytem;

import interview.parking_sytem.strategy.ParkingFeeStrategy;
import interview.parking_sytem.vehicle.Vehicle;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class ParkingLot {

    private List<ParkedVehicleInfo> parkedVehicleInfoList = new ArrayList<>();

    private ParkingFeeStrategy strategy;

    public ParkingLot(ParkingFeeStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 汽车进入停车场。
     *
     * @param vehicle 入库的汽车
     * @return 入库的汽车的停车信息
     */
    public ParkedVehicleInfo in(Vehicle vehicle) {
        log.info("{} drive into the parking lot", vehicle);
        var parkedVehicleInfo = new ParkedVehicleInfo();
        parkedVehicleInfo.setVehicle(vehicle);
        parkedVehicleInfo.setStart(LocalDateTime.now());
        parkedVehicleInfoList.add(parkedVehicleInfo);
        return parkedVehicleInfo;
    }

    /**
     * 汽车出库，我们计算汽车的停车费并将汽车移除。
     *
     * @param vehicle 出库的汽车
     * @return 出库的汽车
     */
    public Vehicle out(Vehicle vehicle) {
        log.info("{} drive out of the parking lot", vehicle);
        var parkedVehicleInfo = parkedVehicleInfoList.stream()
                                                     .filter(v -> v.getVehicle().equals(vehicle))
                                                     .findFirst()
                                                     .orElseThrow();
        parkedVehicleInfo.setEnd(LocalDateTime.now());
        var fee = strategy.calculateFee(parkedVehicleInfo);
        log.info("The parking fee is {} ", fee);
        this.parkedVehicleInfoList.remove(parkedVehicleInfo);
        return parkedVehicleInfo.getVehicle();
    }
}
