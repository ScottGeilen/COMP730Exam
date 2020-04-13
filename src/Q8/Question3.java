import java.util.Random;

public class Question3 {
        int sum = 0;
        Random rand = new Random();
        int rand_int = rand.nextInt(10000);

        for (int i=rand_int; i<9; i++) {
            sum+=i;
            System.out.print(sum);
        }
        return sum;
}