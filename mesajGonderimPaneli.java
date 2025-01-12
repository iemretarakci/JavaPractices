import java.util.Scanner;

public class mesajGonderimPaneli {
    public static void main(String[] args){
        Scanner mesaj = new Scanner(System.in);
        String ileti = null;
        do {
            System.out.println("Göndermek istediğiniz mesaj: ");
            ileti = mesaj.nextLine();
        }while (!ileti.equals("Son"));
    }
}
