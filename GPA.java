import java.util.Scanner;

public class GPA {
    public static void main(String[] args) {
        float matematik, fizik, kimya, turkce, tarih, muzik;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz: ");
        matematik = input.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextFloat();
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextFloat();
        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextFloat();
        System.out.print("Tarih notunuzu giriniz: ");
        tarih = input.nextFloat();
        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextFloat();

        float toplam = (matematik+fizik+kimya+turkce+tarih+muzik);
        double GPA = toplam/6;
        System.out.println("Ortalama Geçme Notu : " + GPA);
        boolean kosul = GPA<60;
        String str = kosul ? "Sınıfta Kaldı." : "Sınıfı Geçti";
        System.out.println(str);


    }
}
