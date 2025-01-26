import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " degrees fahrenheit is " + celsius + " degrees celcius.");
    }
}

// https://www.w3schools.in/java/examples/get-user-input-print-screen
// getting user input was the hardest part besides a quick google search for the conversion formula