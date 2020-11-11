import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        long k = scanner.nextLong();
        int n = scanner.nextInt();
        double m = scanner.nextDouble();

        long seed = k;
        boolean foundSeed = false;
        while (!foundSeed) {
            foundSeed = true;
            Random random = new Random(seed);
            for (int i = 0; i < n; i++) {
                if (random.nextGaussian() > m) {
                    foundSeed = false;
                    seed++;
                    break;
                }
            }
        }

        System.out.println(seed);
    }
}