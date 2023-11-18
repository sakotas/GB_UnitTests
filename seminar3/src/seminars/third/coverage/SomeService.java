package seminars.third.coverage;

public class SomeService {

    /**
     * 3.1. Метод возвращает Fizz для чисел кратных 3, Buzz для кратных 5, и FizzBuzz для кратных 3 и 5 одновременно
     */
    public String fizzBuzz(Integer i) {
        if (i % 15 == 0) {
            return "FizzBuzz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else {
            return i.toString();
        }
    }

    /**
     * 3.2. Метод возвращает true для массивов, которые начинаются или заканчиваются 6, и false - если 6 нет ни в начале ни в конце массива
     */
    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * 3.3. Метод подсчета скидки
     */
    public double calculatingDiscount(double purchaseAmount, int discountAmount) {
        if (discountAmount < 0 || discountAmount > 100) {
            throw new ArithmeticException("Скидка должна быть в диапазоне от 0 до 100%");
        } else {
            return switch (discountAmount) {
                case 100 -> 0;
                case 0 -> purchaseAmount;
                default -> purchaseAmount * discountAmount / 100;
            };
        }
//        if (discountAmount >= 100) {
//            return 0;
//        } else if (discountAmount <= 0) {
//            return purchaseAmount;
//        } else {
//            return purchaseAmount * discountAmount / 100;
//        }
    }




    /**
     * 3.4. Метод принимает на вход 3 числа (int a, b, c).
     * Нужно вернуть их сумму. Однако, если одно из значений равно 13,
     * то оно не учитывается в сумме. Так, например, если b равно 13,
     * то считается сумма только a и c.
     */

    public int luckySum(int a, int b, int c) {
        int sum = 0;
        if (a != 13) {
            sum += a;
        }
        if (b != 13) {
            sum += b;
        }
        if (c != 13) {
            sum += c;
        }
        return sum;
    }
}