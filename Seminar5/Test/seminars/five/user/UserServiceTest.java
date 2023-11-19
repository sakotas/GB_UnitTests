package seminars.five.user;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.verify;

public class UserServiceTest {

//    У вас есть два класса - UserService и UserRepository. UserService использует UserRepository для
//    получения информации о пользователе. Ваша задача - написать интеграционный тест, который
//    проверяет, что UserService и UserRepository работают вместе должным образом.
    @Test
    void integrationTest() {
        // Arrange
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);
        int userId = 10; // Пример идентификатора пользователя

        // Act
        String userName = userService.getUserName(userId);

        // Assert
        assertThat(userName).isEqualTo("User " + userId);
    }
}
