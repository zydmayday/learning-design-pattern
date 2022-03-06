package design.pattern.observer;

import lombok.Getter;

@Getter
public class Nintendo {

    private final Publisher publisher;

    public Nintendo() {
        this.publisher = new NintendoPublisher();
    }

    public void releaseZelda() {
        this.publisher.notify("zelda", new NintendoGameEvent("zelda"));
    }

    public void releaseMario() {
        this.publisher.notify("mario", new NintendoGameEvent("mario"));
    }

}
