import textio.TextIO;

public class SimpleGreeting {
    public static void main(String[] args) {
        String username;
        System.out.println("Please enter your username: ");
        username = TextIO.getln();
        System.out.println("Welcome " + username + ", Nice to see you again.");
    }
}
