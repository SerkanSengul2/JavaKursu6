package Gun19;

public class _04_JavaMethod {
    public static void main(String[] args) {//ana method,diğer metodlar buranın içinden cagırılacak

        int endb = Math.max(5, 6);//max metodu değer/ler almış.geriye büyük olanı vermiş
        double rndSayi = Math.random();//hiçbirşey almıyor,istemiyor.sadece veriyor

        System.out.println("merhaba dünya");//veri alıyor,götürüp ekrana yazıyor.
        System.out.println("merhaba dünya");
        System.out.println("merhaba dünya");


        merhabaYaz();//kullanımı kolay,çağırması kolay,tekrar tekrar kullanbilirsin
        merhabaYaz();// mainin daha kolay anlaşılabilir olur.temiz kod
        merhabaYaz();//fonksiyonu çağırma şekli
    }


    public static void merhabaYaz(){
        System.out.println("merhaba dünya:metoddan");


    }





}
