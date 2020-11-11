import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(compress(input));
    }

    public static String compress(String input) {
        char[] sequence = input.toCharArray();
        String output = "";

        int charCount = 0;
        char countingChar = sequence[0];
        for (char character : sequence) {
//            System.out.printf("%c %d\n",character, charCount);
            if (character == countingChar) {
                charCount++;
            }
            else {
                output = String.format("%s%c%d", output, countingChar, charCount);
                countingChar = character;
                charCount = 1;
            }
        }
        output = String.format("%s%c%d", output, countingChar, charCount);

        return output;
    }
}