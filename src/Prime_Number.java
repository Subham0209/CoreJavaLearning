import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check");
        int num = sc.nextInt();
        int flag = 0;
        if ((num == 0) || (num == 1) || (num == 2)) {
            System.out.println("The Number is Prime");
        } else if (num % 2 == 0) {
            System.out.println("The Number is Non-Prime");
        } else {
            System.out.println("The Number is Prime");
        }


    }


}
