package FractionCode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numerator of first fraction: ");
        int num1 = sc.nextInt();

        System.out.print("Enter denominator of first fraction: ");
        int den1 = sc.nextInt();

        System.out.print("Enter numerator of second fraction: ");
        int num2 = sc.nextInt();

        System.out.print("Enter denominator of second fraction: ");
        int den2 = sc.nextInt();

        int numerator = (num1 * den2) + (num2 * den1);
        int denominator = den1 * den2;

        System.out.println("Sum = " + numerator + "/" + denominator);

        sc.close();
    }

    
}