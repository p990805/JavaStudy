package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        //Random random = new Random();
        Random random = new Random(1); // 시드 값이 같으면 Random의 결과가 같다.

        int randomInt = random.nextInt();
        System.out.println("randomInt: " + randomInt);

        double randomDouble = random.nextDouble();
        System.out.println("randomDouble: " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean: " + randomBoolean);

        //범위 조회
        // 0 ~ 9 까지 출력
        int randomRange1 = random.nextInt(10);
        System.out.println("0~9: " + randomRange1);

        // 1 ~ 10 까지 출력
        int randomRange2 = random.nextInt(10)+1;
        System.out.println("1~10: " + randomRange2);
    }
}
