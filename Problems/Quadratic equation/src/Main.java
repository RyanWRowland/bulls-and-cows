import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double sqrt = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        double denominator = 2 * a;
        double r1 = (-b - sqrt) / denominator;
        double r2 = (-b + sqrt) / denominator;

        if (r1 < r2) {
            System.out.printf("%f %f", r1, r2);
        } else {
            System.out.printf("%f %f", r2, r1);
        }
    }
}