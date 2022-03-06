package refactoring;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.function.Function;

@Getter
@AllArgsConstructor
public class RepositoryStrategy<T> {

    private Function<String, List<T>> findEntitiesStrategy;
}
