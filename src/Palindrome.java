import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name");
        String str = sc.nextLine();
        String s1 = "";
        for(int i=str.length()-1; i>=0;i--)
        {
            s1 = s1 + str.charAt(i);
        }
        if(str.equals(s1))
        {
            System.out.println("The String is Palindrome");
        }
        else
        {
            System.out.println("The String is not a Palindrome");
        }
    }
}
