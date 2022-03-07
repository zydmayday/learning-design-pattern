package design.pattern.factory_method.starcraft.unit;

public class MarineBuilder implements UnitBuilder{
    @Override
    public Unit build() {
        return new Marine();
    }

    @Override
    public int buildTime() {
        return 25;
    }

    @Override
    public int supply() {
        return 1;
    }

    @Override
    public int costMinerals() {
        return 50;
    }

    @Override
    public int costGas() {
        return 0;
    }
}
