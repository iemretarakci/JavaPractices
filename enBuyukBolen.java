import java.util.Scanner;

public class enBuyukBolen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir tamsayi giriniz: ");
        int sayi = scanner.nextInt();
        System.out.println("En büyük bölen: " + enBuyukBolenBul(sayi));
    }
    public static int enBuyukBolenBul(int sayi) {
        for (int i = sayi / 2; i >= 2; i--) {
            if (sayi % i == 0)
                return i;
        }
        return 1;
    }
}