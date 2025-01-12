import java.util.Scanner;
public class bilgiYarismasi {
    public static void main(String[] args){
        String gercekCevap = "Ankara";
        int cevaphakki = 3;
        System.out.println("Türkiye'nin Başkenti Neresidir ?");
        Scanner klavye = new Scanner(System.in);
        do {
            String girilenCevap = klavye.nextLine();
            if (girilenCevap.equals(gercekCevap))
                System.out.println("Tebrikler, doğru cevap!");
            else
                cevaphakki-=1;
                System.out.println("Yanlış cevap. "+cevaphakki+" hakkınız kaldı.");
        }while(cevaphakki > 0);
        if (cevaphakki == 0)
            System.out.println("Hakkınız kalmadı. Soruyu bilemediniz.");
    }

}
