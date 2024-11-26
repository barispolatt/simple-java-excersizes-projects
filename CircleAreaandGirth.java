import java.util.Scanner;
public class CircleAreaandGirth {
    public static void main(String[] args) {
        double pi, r, a, g; //r = radius, a = area, g = girth
        pi = 3.14;

        System.out.print("Enter the radius of circle: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextDouble();

        a = pi*r*r;
        g = 2*pi*r;

        System.out.print("The area of the circle: "+a+" \nThe girth of the circle is "+g);

    }
}
