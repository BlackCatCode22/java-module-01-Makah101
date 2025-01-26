import java.util.Scanner;

public class CharDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single character: "); //Asks for a character and lets the user do an input.
        String input = scanner.nextLine();

        if (input.length() != 1) {  //Checks that a single character was used.
            System.out.println("Please enter a single character.");
            return;
        }

        char character = input.charAt(0);
        int unicodeValue = (int) character;

        System.out.println("Unicode value: " + unicodeValue); //outputs the character as its unicode value

        if (Character.isLetter(character)) {
            System.out.println("It is a letter."); //checks if it was a letter.
        } else if (Character.isDigit(character)) {
            System.out.println("It is a digit.");  // checks if it was a number.
        } else {
            System.out.println("It is neither a letter nor a digit."); // if neither then says its neither.
        }
    }
}

// https://www.w3schools.in/java/examples/find-ascii-value-of-a-character
// Takes a character and makes it an int showing its unicode value. Then checks if it was a letter or number or neither.