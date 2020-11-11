import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String inputString = "";
        while (true) {
            try {
                inputString = scanner.nextLine();
                int input = Integer.parseInt(inputString);
                if (input == 0) {
                    break;
                }
                System.out.println(input * 10);
            } catch (Exception e) {
                System.out.printf("Invalid user input: %s\n", inputString);
            }
        }
    }
}