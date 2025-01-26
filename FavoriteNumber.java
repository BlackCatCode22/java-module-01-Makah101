import java.util.Scanner;

public class FavoriteNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your favorite number: ");
        int num = sc.nextInt();
        System.out.print("Your favorite number is: " + num + ".");
    }
}

// https://www.w3schools.in/java/examples/get-user-input-print-screen
// Program asks for users favorite number and outputs it.