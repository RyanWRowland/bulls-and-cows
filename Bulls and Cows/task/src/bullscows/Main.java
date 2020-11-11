package bullscows;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        System.out.println("Input the length of the secret code:");
        int length;
        try {
            input = scanner.nextLine();
            length = Integer.parseInt(input);
            if (length <= 0) {
                System.out.println("Error: Code length can't be less than or equal to 0.");
                return;
            }
            if (length > 36) {
                System.out.println("Error: maximum number of possible symbols in the code is 36 (0-9, a-z).");
                return;
            }
        } catch (Exception e) {
            System.out.printf("Error: \"%s\" isn't a valid number.\n", input);
            return;
        }


        System.out.println("Input the number of possible symbols in the code:");
        int range;
        try {
            input = scanner.nextLine();
            range = Integer.parseInt(input);
            if (length <= 0) {
                System.out.println("Error: Code range can't be less than or equal to 0.");
                return;
            }
            if (range < length) {
                System.out.printf("Error: it's not possible to generate a code with a length of %d with %d unique symbols.\n", length, range);
                return;
            }
            if (range > 36) {
                System.out.println("Error: maximum number of possible symbols in the code is 36 (0-9, a-z).");
                return;
            }
        } catch (Exception e) {
            System.out.printf("Error: \"%s\" isn't a valid number.\n", input);
            return;
        }

        SecretCode secretCode = new SecretCode(length, range);
        System.out.println("Okay, let's start a game!");
        int turnCount = 0;
        do {
            turnCount++;
            System.out.printf("Turn %d:\n", turnCount);
            input = scanner.nextLine();
        } while (!secretCode.gradeInput(input));

        System.out.println("Congratulations! You guessed the secret code.");
    }
}
