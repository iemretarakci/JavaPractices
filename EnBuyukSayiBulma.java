import java.util.Scanner;

public class EnBuyukSayiBulma {
    public static void main(String[] args){
        Scanner klavye = new Scanner(System.in);
        System.out.println("1.Sayıyı Giriniz:");
        Integer sayi1 = klavye.nextInt();
        System.out.println("2.Sayıyı Giriniz:");
        Integer sayi2 = klavye.nextInt();
        System.out.println("3.Sayıyı Giriniz:");
        Integer sayi3 = klavye.nextInt();
        if (sayi1>sayi2)
            if (sayi1>sayi3)
                System.out.println("En Büyük Sayı: "+ sayi1);

            else
                System.out.println("En Büyük Sayı: "+sayi3);

        else if (sayi1>sayi3)
            if (sayi1>sayi2)
                System.out.println("En Büyük Sayı: "+sayi1);

            else
                System.out.println("En Büyük Sayı: "+sayi2);
        else if (sayi2>sayi1) {
            if (sayi2>sayi3)
                System.out.println("En Büyük Sayı: "+sayi2);
            else
                System.out.println("En Büyük Sayı: "+sayi3);
        }
        else if (sayi2>sayi3) {
            if (sayi2>sayi1)
                System.out.println("En Büyük Sayı: "+sayi2);
            else
                System.out.println("En Büyük Sayı: "+sayi1);
        }
        else
            System.out.println("En Büyük Sayı: "+sayi3);
    }


}
