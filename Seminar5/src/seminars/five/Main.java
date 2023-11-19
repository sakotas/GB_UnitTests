package seminars.five;

import seminars.five.number.MaxNumberModule;
import seminars.five.number.RandomNumberModule;

import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        RandomNumberModule randList = new RandomNumberModule();
        List<Integer> result = randList.generate(6);

        MaxNumberModule maxNumberModule = new MaxNumberModule();
        Integer max = maxNumberModule.findMax(result);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
        System.out.println(max);
    }

}
