import java.util.Scanner;

public class GirisPortal {
    public static void GirisPortal(String girilenIsim, String girilenParola){


        if (girilenIsim.equals("Admin")) {
            if (girilenParola.equals("123")){
                System.out.println("Başarılı Giriş.");
            }
            else{
                System.out.println("Hatalı Giriş !\nParola Yanlış");
            }
        }
        else{
            System.out.println("Hatalı Giriş !\nKullanıcı Adı Yanlış");
        }
    }
    public static void main(String[] args) {
        Scanner ScannerIsim = new Scanner(System.in);
        System.out.println("Kullanıcı Adı Giriniz:");
        String girilenIsim = ScannerIsim.nextLine();
        Scanner ScannerParola = new Scanner(System.in);
        System.out.println("Parola:");
        String girilenParola = ScannerParola.nextLine();
        GirisPortal(girilenIsim,girilenParola);

    }
}

