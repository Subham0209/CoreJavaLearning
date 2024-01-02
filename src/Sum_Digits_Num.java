import java.util.Scanner;

public class Sum_Digits_Num
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Digit");
        int a =  sc.nextInt();
        int sum = 0, digit = 0;

            // 123 -> 1+2+3
            /*
            Read or initialize an integer N.
            Declare a variable (sum) to store the sum of numbers and initialize it to 0.
            Find the remainder by using the modulo (%) operator. It gives the last digit of the number (N).
            Add the last dig1it to the variable sum.
            Divide the number (N) by 10. It removes the last digit of the number.
            Repeat the above steps (3 to 5) until the number (N) becomes 0.
            */
        while(a>0)
        {
            digit = a%10;
            sum=sum+digit;
            a=a/10;
        }
        System.out.println(sum);

    }
}
