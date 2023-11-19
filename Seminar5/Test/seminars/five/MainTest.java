package seminars.five;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminars.five.number.MaxNumberModule;
import seminars.five.number.RandomNumberModule;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class MainTest {
    List<Integer> result;

    @BeforeEach
    void setUp() {
        result = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            result.add(i + 1);
        }
    }

//    Создайте два модуля. Первый модуль генерирует список случайных чисел. Второй модуль находит
//    максимальное число в этом списке.
//    Вам нужно сначала написать юнит-тесты для каждого модуля, затем написать интеграционный
//    тест, который проверяет, что оба модуля работают вместе правильно


    //5.1.
    @Test
    void testRandomNumberModule() {
        RandomNumberModule randomNumberModule = mock(RandomNumberModule.class);
        when(randomNumberModule.generate(anyInt())).thenReturn(result);
        assertThat(randomNumberModule.generate(6)).isEqualTo(result);
    }

    @Test
    void generate_ShouldReturnListWithSpecifiedLength() {
        // Arrange
        RandomNumberModule randomNumberModule = new RandomNumberModule();
        int length = 10;

        // Act
        List<Integer> result = randomNumberModule.generate(length);

        // Assert
        assertThat(result).hasSize(length);
    }

    @Test
    void generate_ShouldReturnListWithValuesInRange() {
        // Arrange
        RandomNumberModule randomNumberModule = new RandomNumberModule();
        int length = 10;

        // Act
        List<Integer> result = randomNumberModule.generate(length);

        // Assert
        assertThat(result).allMatch(number -> number >= 0 && number < 100);
    }

    @Test
    void generate_ShouldProduceRandomValues() {
        // Arrange
        RandomNumberModule randomNumberModule = new RandomNumberModule();
        int length = 10;

        // Act
        List<Integer> firstResult = randomNumberModule.generate(length);
        List<Integer> secondResult = randomNumberModule.generate(length);

        // Assert
        assertThat(firstResult).isNotEqualTo(secondResult);
    }

    //5.2.
    @Test
    void testMaxNumberModule() {
        MaxNumberModule maxNumberModule = new MaxNumberModule();
        assertThat(maxNumberModule.findMax(result)).isEqualTo(6);
    }

    //5.3.
    @Test
    void integrationTest() {
        RandomNumberModule randomNumberModule = mock(RandomNumberModule.class);
        when(randomNumberModule.generate(anyInt())).thenReturn(result);
        MaxNumberModule maxNumberModule = new MaxNumberModule();
        assertThat(maxNumberModule.findMax(randomNumberModule.generate(6))).isEqualTo(6);
    }

}