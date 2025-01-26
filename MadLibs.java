import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a name"); //commands to collect the words
        String name = sc.nextLine();
        System.out.println("Enter a verb");
        String verb = sc.nextLine();
        System.out.println("Enter a noun");
        String noun = sc.nextLine();
        System.out.println("Enter a color");
        String color = sc.nextLine();
        System.out.println("Enter another noun");
        String noun2 = sc.nextLine();

        System.out.println("My name is " + name + " I like to " + verb + " whenever I see a " + noun + " or a " + color + " " +noun2 + ".");
    }
}

// https://stackoverflow.com/questions/42007402/making-a-madlib-in-java-user-input-erroring
// while this was actually a link to someone troubleshooting their project. It was informative in how this should be set up.
// The idea is to get a few words and then insert them in a sentence. Im not that creative but I did my best.