package design.pattern.factory_method.starcraft.unit;

/**
 * 建造单位所需要的配置
 */
public interface UnitBuilder {

    /**
     * @return 建造单位
     */
    Unit build();

    /**
     * @return 所需建造时间
     */
    int buildTime();

    /**
     *
     * @return 所需建造人口
     */
    int supply();

    /**
     *
     * @return 所需矿物
     */
    int costMinerals();

    /**
     *
     * @return 所需气体
     */
    int costGas();
}
