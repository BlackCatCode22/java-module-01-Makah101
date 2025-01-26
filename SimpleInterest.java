import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        double pr, rate, t, interest;
        Scanner sc=new Scanner (System. in);
        System.out.println("Enter the Principle amount:");
        pr=sc.nextDouble();
        System. out. println("Enter the Number of years:");
        t=sc.nextDouble();
        System. out. println("Enter the Rate of interest");
        rate=sc.nextDouble();
        interest =(pr * t * rate)/100;

        System.out.println("Interest = "+interest);
    }
}

// https://www.w3schools.in/java/examples/java-program-calculate-simple-compound-interest
// while the formula looks correct, im not sure that I understand the rate. Would it be a percentage like 20 percent?
// 1000 principle, over 2 years, at 1.2 (20%) is 24. is that 24% as in 240 dollars in interest after 2 years?