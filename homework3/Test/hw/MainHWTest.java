package hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import seminars.third.hw.MainHW;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class MainHWTest {
    MainHW mainHW;

    @BeforeEach
    void SetUp() {
        mainHW = new MainHW();
    }

    // HW 3.1. Нужно покрыть тестами метод на 100%
    // Метод проверяет, является ли целое число записанное в переменную n,
    // чётным (true) либо нечётным (false).

    @Test
    void testEven() {
        assertTrue(mainHW.evenOddNumber(2));
    }

    @Test
    void testOdd() {
        assertFalse(mainHW.evenOddNumber(3));
    }

    // HW 3.2. Нужно написать метод numberInInterval, который проверяет,
    // попадает ли переданное число в интервал (25;100) и возвращает true,
    // если попадает и false - если нет,
    // покрыть тестами метод на 100%

    @ParameterizedTest
    @ValueSource(ints = {25,26,27,98,99,100})
    void intervalTrueTest(int i){
        assertTrue(mainHW.numberInInterval(i));
    }
    @ParameterizedTest
    @ValueSource(ints = {0,2,1111,3345,101,1011})
    void intervalFalseTest(int i){
        assertFalse(mainHW.numberInInterval(i));
    }


}
