import java.util.Scanner;

public class Temp_Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Tempeture to calculate");
        int temp = sc.nextInt();

        //Celsius to Fahrenheit

        int far = temp * 9/5 + 32;
        System.out.println(far);

    }
}
