package refactoring.pattern1;

import refactoring.entity.BaseEntity;
import refactoring.entity.MovieEntity;
import refactoring.entity.UserEntity;

import java.util.Arrays;
import java.util.List;

public enum StrategyWithEnum {
    USER {
        @Override
        public List<UserEntity> findEntities(String key) {
            return Arrays.asList(new UserEntity("user1", "pass1"),
                                 new UserEntity("user2", "pass2"));
        }
    }, MOVIE {
        @Override
        public List<MovieEntity> findEntities(String key) {
            return Arrays.asList(new MovieEntity("movie1", "descp1"),
                                 new MovieEntity("movie2", "descp2"));
        }
    };

    public abstract List<? extends BaseEntity> findEntities(String key);

}
