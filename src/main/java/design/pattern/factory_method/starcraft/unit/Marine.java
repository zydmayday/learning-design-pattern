package design.pattern.factory_method.starcraft.unit;

public class Marine implements Unit {
    @Override
    public int life() {
        return 45;
    }

    @Override
    public int attackValue() {
        return 6;
    }

    @Override
    public UnitType type() {
        return UnitType.MARINE;
    }
}
