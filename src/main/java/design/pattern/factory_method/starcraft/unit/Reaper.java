package design.pattern.factory_method.starcraft.unit;

public class Reaper implements Unit {
    @Override
    public int life() {
        return 50;
    }

    @Override
    public int attackValue() {
        return 10;
    }

    @Override
    public UnitType type() {
        return UnitType.REAPER;
    }
}
