import java.util.Scanner;

public class PositiveNumbers {

    public static void main(String[] args) {
        checkNumber();
    }

    public static void checkNumber () {
        Scanner scanner = new Scanner(System.in);
        String outputMessage;
        double userInput = -1;

        while (userInput != 0) {
            System.out.print("Enter a number (0 to exit): ");
            userInput = Double.parseDouble(scanner.nextLine());
            // signum method checks the sign of a value and returns 1.0 if
            // it's a postiive value
            outputMessage = (userInput > 0)
                    ? userInput == (int)userInput
                        ? ("Number is " + String.format("%,d", (int)userInput))
                        : ("Number is " + userInput)
                    : ("Number must be a positive number");
            System.out.println(outputMessage);

        }
        System.out.println("Process finished with exit code 0");

    }

}
