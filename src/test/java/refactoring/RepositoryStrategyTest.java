package refactoring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import refactoring.entity.BaseEntity;
import refactoring.entity.MovieEntity;
import refactoring.entity.UserEntity;
import refactoring.pattern1.StrategyWithEnum;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepositoryStrategyTest {

    EnumMap<DbName, RepositoryStrategy<? extends BaseEntity>> strategyEnumMap;

    @BeforeEach
    void initStrategies() {
        strategyEnumMap = new EnumMap<>(DbName.class);
        strategyEnumMap.put(DbName.USER,
                            new RepositoryStrategy<>(str -> Arrays.asList(new UserEntity("user1", "pass1"),
                                                                          new UserEntity("user2", "pass2"))));
        strategyEnumMap.put(DbName.MOVIE,
                            new RepositoryStrategy<>(str -> Arrays.asList(new MovieEntity("movie1", "descp1"),
                                                                          new MovieEntity("movie2", "descp2"))));
    }

    @Test
    void test() {
        List<BaseEntity> entities = (List<BaseEntity>) strategyEnumMap.get(DbName.MOVIE).getFindEntitiesStrategy().apply("any");
        assertEquals(2, entities.size());
    }

    @Test
    void test_switch() throws Exception {
        DbName type = DbName.MOVIE;
        switch (type) {
            case MOVIE: {
                List<MovieEntity> entities = (List<MovieEntity>) strategyEnumMap.get(type).getFindEntitiesStrategy().apply("any");
                break;
            }
            case USER: {
                List<UserEntity> entities = (List<UserEntity>) strategyEnumMap.get(type).getFindEntitiesStrategy().apply("any");
                break;
            }
            default: {
                throw new Exception("Invalid type");
            }
        }
    }

    @Test
    void test_swith_replaced_with_enum() {
        StrategyWithEnum type = StrategyWithEnum.MOVIE;
        // Still need cast
        List<MovieEntity> entities = (List<MovieEntity>) type.findEntities("any");
        assertEquals(2, entities.size());
    }
}
