package design.pattern.factory_method.starcraft.unit;

public class ReaperBuilder implements UnitBuilder{
    @Override
    public Unit build() {
        return new Reaper();
    }

    @Override
    public int buildTime() {
        return 45;
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
        return 50;
    }
}
