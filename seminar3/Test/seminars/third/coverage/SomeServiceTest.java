package seminars.third.coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SomeServiceTest {
   // 3.1. Создайте набор тестов, полностью покрывающих все ветви кода функции fizzBuzz.
   // Эта функция принимает на вход число и возвращает "Fizz", если число делится на 3,
   // "Buzz", если число делится на 5, и "FizzBuzz", если число делится на 15.
   // Если число не делится ни на 3, ни на 5, ни на 15, функция возвращает
   // входное число в виде строки
    SomeService someService;
    int[] ints1 = new int[]{6,4,3,2,5};
    int[] ints2 = new int[]{3,14,5,3,2};
    int[] ints3 = new int[]{5,4,3,2,6};
    @BeforeEach
    void SetUp() {
        someService = new SomeService();
    }

    @Test
    void multipleThreeNotFiveReturnsFizz() {
        assertEquals("Fizz",
                someService.fizzBuzz(3));
    }

    @Test
    void multipleFiveNotThreeReturnsBuzz(){
        assertEquals("Buzz", someService.fizzBuzz(5));
    }

    @Test
    void multipleFifteenReturnsFizzBuzz(){
        assertEquals("FizzBuzz", someService.fizzBuzz(15));
    }

    @ParameterizedTest
    @ValueSource(ints={1,7,11})
    void notFizzBuzz(int i){
        assertEquals(String.valueOf(i), someService.fizzBuzz(i));
    }

//    Разработайте тесты для метода firstLast6, где на вход подается массив чисел, а метод
//    возвращает true, если первое или последнее число в массиве равно 6, иначе false.
    @Test
    void sixAtStart(){
        assertTrue(someService.firstLast6(ints1));
    }
    @Test
    void sixAtEnd(){
        assertTrue(someService.firstLast6(ints3));
    }

    @Test
    void noSixAtStartAndEnd(){
        assertFalse(someService.firstLast6(ints2));
    }

    @ParameterizedTest
    @CsvSource({"2000.0, 50, 1000", "2000.0, 100, 0", "2000.0, 0, 2000"})
    void insufficientCoverageTest(double purchaseAmount, int discountAmount, int expected){
        assertThat(someService.calculatingDiscount(purchaseAmount, discountAmount))
                .isEqualTo(expected); // обычная скидка
    }

    @Test
    void exceptionThrownTest(){
        assertThatThrownBy(() ->
                someService.calculatingDiscount(2000.0, 101))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // процент скидки больше 100%

        assertThatThrownBy(() ->
                someService.calculatingDiscount(2000.0, -10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // процент скидки меньше 0
    }


//    Разработайте метод luckySum и напишите для него тесты.
//    Этот метод принимает на вход три числа и возвращает их сумму.
//    Однако, если одно из чисел равно 13, то оно не учитывается при подсчете суммы.
//    Так, например, если b равно 13, то считается сумма только a и c.
    @Test
    void luckySumIsSumming(){
        assertThat(someService.luckySum(1, 2, 3))
                .isEqualTo(6);
    }
    @ParameterizedTest
    @CsvSource({"13, 2, 4, 6", "2, 5, 13, 7", "13, 5, 13, 5", "13, 13, 13, 0"})
    void luckySumHasThirteen(int firstValue, int secondValue, int thirdValue, int expected) {
        assertThat(someService.luckySum(firstValue, secondValue, thirdValue))
                .isEqualTo(expected);
    }





}