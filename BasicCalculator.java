import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        System.out.println("Enter first number: ");
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();

        System.out.println("Enter second number: ");
        Scanner input2 = new Scanner(System.in);
        float b = input2.nextFloat();

        System.out.println("The sum is: " + (a+b));
        System.out.println("The difference is: " + (a-b));
        System.out.println("The multiplication is: " + (a*b));
        System.out.println("The division is: " + (a/b));
        System.out.println("The mode is: " + (a%b));





    }
}
