import java.util.Scanner;

public class TakeABreak {

    public static void main(String[] args) {
        queryUser();
    }

    public static void queryUser () {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Do you want to take a break? ");
        } while (!scanner.nextLine().equalsIgnoreCase("yes"));
    }

}

