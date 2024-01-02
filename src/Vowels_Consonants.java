import java.util.Scanner;

public class Vowels_Consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Word");
        String word = sc.nextLine();
        int count = 0, ccount=0;


        for(int i=0;i<word.length();i++) {

            if ((word.charAt(i) == 'A') || (word.charAt(i) == 'a') || (word.charAt(i) == 'E') || (word.charAt(i) == 'e')
            || (word.charAt(i) == 'I') || (word.charAt(i) == 'i') || (word.charAt(i) == 'O') || (word.charAt(i) == 'o')
            || (word.charAt(i) == 'U') || (word.charAt(i) == 'u'))
            {
                count++;
            }
            else if((word.charAt(i)>='a') && (word.charAt(i)<='z') || (word.charAt(i)>='A') && (word.charAt(i)<='Z') )
            {
                ccount++;
            }

        }
        System.out.println("Number of Consonants are :"+ccount);
        System.out.println("Number of Vowels are : "+count);
    }
}
