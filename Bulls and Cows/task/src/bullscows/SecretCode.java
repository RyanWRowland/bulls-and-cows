package bullscows;

import java.util.Random;

public class SecretCode {
    private int length;
    private int range;
    private String code;

    public SecretCode(int length, int range) {
        this.length = length;
        this.range = range;
        this.code = this.generateCode();
        printReady();
    }

    private String generateCode() {
        // first create array of unique ints within the given range of the given length
        Random random = new Random();
        int[] secretCode = new int[length];
        int i = 0;
        while (i < length) {
            int symbol = random.nextInt(range);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (secretCode[j] == symbol) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                secretCode[i] = symbol;
                i++;
            }
        }

        // translate array of unique ints into code string where numbers greater than 9
        // are replaced with the appropriate lowercase Latin character
        StringBuilder codeString = new StringBuilder();
        for (int symbol : secretCode) {
            if (symbol < 10) {
                codeString.append(symbol);
            } else {
                codeString.append((char) (symbol + 87));
            }
        }

        return codeString.toString();
    }

    private void printReady() {
        String codeLength = "*".repeat(this.length);
        String codeRange;
        if (this.range < 10) {
            codeRange = String.format("(0-%d)", range);
        } else {
            codeRange = String.format("(0-9, a-%c)", range - 1 + 87);
        }

        System.out.printf("The secret is prepared: %s %s.\n", codeLength, codeRange);
    }

    // Grades input, prints grade.
    // Returns true if code is solved, all bulls.
    // Returns false if code is not solved.
    public boolean gradeInput(String input) {
        int bulls = 0;
        int cows = 0;

        for (int i = 0; i < this.length; i++) {
            int secretIndex = this.code.indexOf(input.charAt(i));

            if (secretIndex == i) {
                bulls++;
            } else if(secretIndex > 0) {
                cows++;
            }
        }

        System.out.print("Grade: ");
        if (bulls > 0 && cows > 0) {
            System.out.printf("%d bull(s) and %d cow(s)\n", bulls, cows);
        } else if (bulls > 0) {
            System.out.printf("%d bull(s)\n", bulls);
        } else if (cows > 0) {
            System.out.printf("%d cow(s)\n", cows);
        } else {
            System.out.print("None\n");
        }

        return bulls == this.length;
    }
}
