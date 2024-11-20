import java.util.Scanner;

public class EEE301GradeCalculation {
    public static void main(String[] args) {

        float midterm, quiz;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the midterm grade : ");
        midterm = sc.nextFloat();

        System.out.print("Enter the average quiz grade : ");
        quiz = sc.nextFloat();

        float needed=(45-(((30*midterm)/100)+((20*quiz)/100)))*2;

        //Final should be above 35 no matter how high your grade in midterm or quizzes.
        boolean condition = needed < 35;
        String str = (condition) ? "Final grade should at least 35" : "Final grade should at least "+needed;
        System.out.println(str);

        float finall;
        System.out.print("Enter the final grade : ");
        finall = sc.nextFloat();

        float avrg = (((20*quiz)/100)+((30*midterm)/100)+((50*finall)/100));
        System.out.println("The average grade is " + avrg);

    }
}
