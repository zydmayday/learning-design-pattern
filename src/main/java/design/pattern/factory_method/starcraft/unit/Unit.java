package design.pattern.factory_method.starcraft.unit;

public interface Unit {

    /**
     * @return 血量
     */
    int life();

    /**
     * @return 攻击力
     */
    int attackValue();

    /**
     * @return 兵种
     */
    UnitType type();

}
