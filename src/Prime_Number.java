import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check");
        int num = sc.nextInt();

            if ((num == 0) || (num == 1)) {
                System.out.println("The Number is Non Prime");
            }

            for(int i=2;i<=num;i++){
            if(i%2==0)
            {
                System.out.println("The Number is Prime");
                break;
            }
            else
            {
                System.out.println("The Number is Non-Prime");
            }

        }



    }


}
