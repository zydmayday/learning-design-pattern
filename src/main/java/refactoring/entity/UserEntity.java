package refactoring.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserEntity implements BaseEntity {
    String username;
    String password;
}
