package design.pattern.observer;

public interface NintendoSubscriber {

    /**
     * 订阅者收到任天堂发来的活动信息，进行处理
     * @param event 具体的活动信息
     */
    void update(NintendoGameEvent event);
}
