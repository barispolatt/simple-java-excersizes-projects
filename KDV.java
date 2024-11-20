import java.util.Scanner;
public class KDV {
    public static void main(String[] args) {

        double kdv1, kdvoran1,kdvoran2, sonfiyat1, sonfiyat2, fiyat, kdv2;

        kdvoran1 = 0.18; // Fiyatı 1000 TL altı olan ürünlerin KDV oranı
        kdvoran2 = 0.08; // Fiyatı 1000 TL üstü olan ürünlerin KDV oranı

        Scanner input = new Scanner(System.in);
        System.out.print("Ürünün Fiyatını Giriniz: ");
        fiyat = input.nextDouble();

        sonfiyat1 = fiyat+(fiyat * kdvoran1); // Fiyatı 1000 TL altı olan ürünün kdvsi eklenmiş fiyatı
        sonfiyat2 = fiyat+(fiyat * kdvoran2); // Fiyatı 1000 TL üstü olan ürünün kdvsi eklenmiş fiyatı

        kdv1 = fiyat*kdvoran1;
        kdv2 = fiyat*kdvoran2;
        System.out.println("Ürünün Fiyatı:" + fiyat);

        boolean kosul = fiyat > 1000;
        String str1 = kosul ? "KDV Oranı: "+kdvoran2 : "KDV Oranı: "+kdvoran1;
        System.out.println(str1);

        String str2 = kosul ? "KDV'li Fiyat: "+sonfiyat2 : "KDV'li Fiyat: "+sonfiyat1;
        System.out.println(str2);

        String str3 = kosul ? "KDV Tutarı: "+kdv2 : "KDV Tutarı: "+kdv1;
        System.out.println(str3);

    }
}
