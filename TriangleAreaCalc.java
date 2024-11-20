import java.util.Scanner;
public class TriangleAreaCalc {
    public static void main(String[] args) {
        double a,b,c,u,area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the first side: ");
        a = input.nextDouble();
        System.out.print("Enter the length of the second side: ");
        b = input.nextDouble();
        System.out.print("Enter the length of the third side: ");
        c = input.nextDouble();

        u = (a+b+c)/2;

        area = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        System.out.print("The area of the triangle is "+area);

    }
}
