import java.util.Scanner;

// Takes the radius from the user and outputs the area of a circle.

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        double r = sc.nextDouble();
        double area = Math.PI * r * r;

        System.out.println("The area of the circle is " + area);
    }
}

/* https://www.w3schools.in/java/examples/java-program-calculate-area-circle
 * The lesson defines PI instead of using Math.PI. Function is otherwise the same.
 */
