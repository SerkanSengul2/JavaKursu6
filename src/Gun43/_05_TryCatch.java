package Gun43;

import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.time.Month;

public class _05_TryCatch {
    public static void main(String[] args) {
        System.out.println("Program çalışmaya başladı");
        try {
            LocalDate tarih = LocalDate.of(2023, Month.FEBRUARY, 30);//runtime error

        }catch (Exception ex)//hata oldugunda programı kımra
                //ex isimli değişkende oluşan hataları bilgisi atanıyor
                //hata oldugunda yapılması istenenler buraya yazılıyor.
        {
            System.out.println("hata olustu= "+ex);
            System.out.println("hata mesajı= "+ex.getMessage());
        }

        System.out.println("program bitti");

        //kursdakı hata durum yonetımı
        try {
            //Java ve Toolları çalışmaya devam et
            //Konuları grupla çalışmaya devam
            //anlamadığın yerler mi oldu,runtime error
        }catch (Exception ex){
            //hatanın sebebini anla
            //derse daha fazla odaklan
            //anlamadığın yerleri grubuna sor
            //videoları tekrar izle
            //grup çalışmasına devam et

        }

    }
}
