package design.pattern.factory_method.starcraft;

import design.pattern.factory_method.starcraft.unit.*;

public class Barrack {

    private void innerProcess(UnitBuilder unitBuilder) {
        // check and plus supply
        System.out.println("增加人口: " + unitBuilder.supply());
        // check minerals
        System.out.println("减少矿物: " + unitBuilder.costMinerals());
        // check gas
        System.out.println("减少气体: " + unitBuilder.costGas());
    }

    public Unit build(UnitType type) {
        System.out.println("开始建造: " + type);
        UnitBuilder unitBuilder;
        if (type == UnitType.MARINE) {
            unitBuilder = new MarineBuilder();
        } else if (type == UnitType.REAPER) {
            unitBuilder = new ReaperBuilder();
        } else {
            throw new RuntimeException("Unknown unit type");
        }
        innerProcess(unitBuilder);
        // wait for building
        System.out.println("建造等待时间: " + unitBuilder.buildTime());
        return unitBuilder.build();
    }
}
