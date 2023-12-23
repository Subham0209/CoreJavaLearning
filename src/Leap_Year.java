import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        // Leap Year is a year which is divisible by 4

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year you want to check");
        int year = sc.nextInt();

        if(year%4==0)
        {
            System.out.println("The Year "+year+" entered is a leap year");
        }
        else
        {
            System.out.println("the Year "+year+ "entered is not a leap year");
        }
    }
}
