import java.util.Scanner;
public class OgrenciNot {
   private String ogrenciIsim;
   private String ogrenciSoyisim;
   private Integer notOdev;
   private Integer notVize;
   private Integer notFinal;

   public void OgrenciOlustur(String ogrenciIsim, String ogrenciSoyisim){
       this.ogrenciIsim = ogrenciIsim;
       this.ogrenciSoyisim = ogrenciSoyisim;
   }
   public String getIsim(){
       return ogrenciIsim;
   }
   public String getSoyisim(){
       return ogrenciSoyisim;
   }
   
   public void notOrtalamaHesaplama(Integer not1, Integer not2, Integer not3){
       Scanner klavye = new Scanner(System.in);
       System.out.println("Ödev notu giriniz:");
       Double notOdev = klavye.nextDouble();
       System.out.println("Vize notu giriniz:");
       Double notVize = klavye.nextDouble();
       System.out.println("Final notu giriniz:");
       Double notFinal = klavye.nextDouble();
       Double notOrtalama = (notOdev * 0.15) + (notVize * 0.35) + (notFinal * 0.5);
       System.out.println("Not ortalamanız: " + notOrtalama);
   }




   public static void main(String[] args) {

   }
}
