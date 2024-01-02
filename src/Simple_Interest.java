import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal Amount");
        double principal_amount = sc.nextDouble();

        System.out.println("Enter the Rate of Interest");
        double rate_of_interest = sc.nextDouble();

        System.out.println("Enter the Duration in Months");
        double time = sc.nextDouble();

        double simple_interest = (principal_amount*rate_of_interest*time)/100;

        System.out.println("The Simple Interest is "+simple_interest);
    }
}
