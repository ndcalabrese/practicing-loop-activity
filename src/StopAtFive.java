import java.util.Scanner;

public class StopAtFive {

    public static void main(String[] args) {
        queryUser();
    }

    public static void queryUser () {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Give a number: ");
        } while (Double.parseDouble(scanner.nextLine()) != 5);
    }

}

