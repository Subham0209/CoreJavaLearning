import java.util.Scanner;

public class Multiplication_Table
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Table you want to print the Multiplication Table for : ");
        int table_num = sc.nextInt();
        int num = table_num;

        for(int i=1;i<=10;i++)
        {
            System.out.println(num+" * "+" = "+num*i);
        }
    }
}
