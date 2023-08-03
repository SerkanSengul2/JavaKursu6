package Gun27._01.Ornek;

public class Utility {

    public String getString(int sayi) {
        return String.valueOf(sayi);
        //string'e cevır ver

    }

    //eğer bir metod nesenin özelliklerini kullanıyorsa
    //nese oluşturulmadan kullanılamaz
    //Dolasıyla STATİC olamaz(NESNE ŞART)

    public static String getString2(int sayi) {

        return String.valueOf(sayi);



    }
    //bagımsız metodlar yani STATİC metodlar
    //herhangi bir nesneye bağlı çalışması gerekmeyen metodlar

}
