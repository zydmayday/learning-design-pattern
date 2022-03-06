package refactoring.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MovieEntity implements BaseEntity {
    String title;
    String description;
}
