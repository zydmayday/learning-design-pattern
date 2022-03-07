package design.pattern.factory_method.starcraft;

import design.pattern.factory_method.starcraft.unit.Unit;
import design.pattern.factory_method.starcraft.unit.UnitType;

public class Game {
    public static void main(String[] args) {
        Barrack barrack = new Barrack();
        Unit marine = barrack.build(UnitType.MARINE);
        Unit reaper = barrack.build(UnitType.REAPER);
        System.out.println(marine);
        System.out.println(reaper);
    }
}
