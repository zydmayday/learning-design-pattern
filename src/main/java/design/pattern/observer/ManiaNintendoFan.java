package design.pattern.observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@AllArgsConstructor
public class ManiaNintendoFan implements NintendoSubscriber {

    private String name;

    @Override
    public void update(NintendoGameEvent event) {
        log.info("{} is buying new game, {}", name, event.getGame());
    }
}
