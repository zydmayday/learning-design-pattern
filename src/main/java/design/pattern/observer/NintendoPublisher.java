package design.pattern.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NintendoPublisher implements Publisher{

    private final Map<String, List<NintendoSubscriber>> subscribers = new HashMap<>();

    @Override
    public void subscribe(String game, NintendoSubscriber s) {
        subscribers.putIfAbsent(game, new ArrayList<>());
        subscribers.get(game).add(s);
    }

    @Override
    public void unsubscribe(String game, NintendoSubscriber s) {
        if (subscribers.containsKey(game)) {
            subscribers.get(game).remove(s);
        }
    }

    @Override
    public void notify(String game, NintendoGameEvent e) {
        if (subscribers.containsKey(game)) {
            subscribers.get(game).forEach(s -> s.update(e));
        }
    }
}
