import java.util.Scanner;

public class UcgeninAlaniniHesaplama {
    public static void main(String[] args) {
        /*
         *
         *  Kullanıcıdan üçgenin üç kenarının da uzunluğunu al.
         *
         *  Üçgenin alanını hesapla.
         *
         *  Üçgenin Çevresi = 2u
         *
         *  u = (a+b+c) / 2
         *
         *  Alan = sqrt(u * (u - a) * (u-b) * (u-c))
         *
         * */
        Scanner input = new Scanner(System.in);
        double a, b, c, u, area;
        System.out.print("a kenarının uzunluğunu giriniz: ");
        a = input.nextDouble();
        System.out.print("b kenarının uzunluğunu giriniz: ");
        b = input.nextDouble();
        System.out.print("c kenarının uzunluğunu giriniz: ");
        c= input.nextDouble();
        u = (a + b + c) / 2;
        area = Math.sqrt((u * (u - a) * (u - b) * (u - c)));
        System.out.print("Üçgenin Alanı: " + area);
    }
}
