package lang.wrapper.test;

import java.util.Random;

public class LottoGenerator {

    private final Random random = new Random();
    private int[] lottonumbers;
    private int count;

    public int[] generate() {
        lottonumbers = new int[6];
        count = 0;

        while (count < 6) {
            int number = random.nextInt(45)+1;
            if(isUnique(number)){
                lottonumbers[count] = number;
                count++;
            }
        }
        return lottonumbers;
    }

    private boolean isUnique(int number) {
        for ( int i = 0; i < count; i++ ) {
            if (lottonumbers[i] == number) {
                return false;
            }
        }
        return true;
    }
}
