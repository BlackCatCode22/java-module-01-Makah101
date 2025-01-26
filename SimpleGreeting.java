import textio.TextIO;

public class SimpleGreeting {
    public static void main(String[] args) {
        String username;
        System.out.println("Please enter your username: ");
        username = TextIO.getln(); /* calls the TextIO program to capture the users name */
        System.out.println("Welcome " + username + ", Nice to see you again.");
    }
}

// https://www.w3schools.in/java/examples/get-user-input-print-screen
// The lesson uses the scanner class to get the user input. I opted to try the TextIO for this project.