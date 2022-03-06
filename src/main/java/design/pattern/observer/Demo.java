package design.pattern.observer;

public class Demo {
    public static void main(String[] args) {
        Nintendo nintendo = new Nintendo();

        NintendoSubscriber normal = new NormalNintendoFan("normal");
        NintendoSubscriber mania = new ManiaNintendoFan("mania");

        nintendo.getPublisher().subscribe("zelda", normal);
        nintendo.getPublisher().subscribe("mario", mania);
        nintendo.getPublisher().subscribe("zelda", mania);

        nintendo.releaseMario();

        nintendo.getPublisher().unsubscribe("mario", mania);

        nintendo.releaseZelda();
    }
}
