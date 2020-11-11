import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int firstSum = 0;
        int lastSum = 0;
        for (int i = 0; i < input.length() / 2; i++) {
            firstSum += Integer.parseInt(input.substring(i, i + 1));
            lastSum += Integer.parseInt(input.substring(input.length() / 2 + i, input.length() / 2 + i + 1));
        }

        if (firstSum == lastSum) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}