import java.util.Scanner;
public class Taximeter {
    public static void main(String[] args) {
        double min,perm,opfee;
        min = 20; //minimum price
        opfee = 10; //opening fee
        perm = 2.20; // price per KM
        Scanner input = new Scanner(System.in);
        System.out.print("How long is distance (kilometers): ");
        double dist = input.nextDouble(); //distance

        double t_price = opfee + (perm*dist); //total price
        boolean minfee = t_price >= min;
        String str = minfee ? "Total Price Is: "+t_price : "Total Price Is: "+min;
        System.out.print(str);
    }
}
