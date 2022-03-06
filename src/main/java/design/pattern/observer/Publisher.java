package design.pattern.observer;

/**
 * 发布者
 * 发布者当有新的内容需要发布时，会发送内容给所有的相关订阅者
 */
public interface Publisher {

    /**
     * 追加订阅者
     * @param s 订阅者
     */
    void subscribe(String game, NintendoSubscriber s);

    /**
     * 取消订阅
     * @param s 待取消的订阅者
     */
    void unsubscribe(String game, NintendoSubscriber s);

    /**
     * 发布事件
     */
    void notify(String game, NintendoGameEvent event);

}
