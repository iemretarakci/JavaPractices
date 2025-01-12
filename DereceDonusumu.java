import java.util.Scanner;

public class DereceDonusumu {
    public static void main(String[] args){
        Scanner klavye = new Scanner(System.in);

        System.out.println("Sıcaklık değeri (F cinsinden) giriniz: ");
        double giris = klavye.nextDouble();
        double doubleDerece = (5/9)*(giris-32);
        int derece = (int) doubleDerece;
        System.out.println("Sıcaklık değeri (C cinsinden): " + derece);
    }
}
