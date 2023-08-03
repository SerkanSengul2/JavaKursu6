package Gun04;

public class _04_NarrowingCasting {
    public static void main(String[] args) {

        int toplam = 6700;
        byte sayi = 5;

        sayi = (byte) toplam;//narrowingcasting deniyor veri kaybı olmasa bile dikkatli yapılmalıdır.
        System.out.println("sayi = " + sayi);//veri kaybı

        double oran=3.7;//ben tam sayı kısmını almak istiyorum
        toplam=(int)oran;//bilerek sadece tam sayıyı aldım
        sayi=(byte)oran;
        System.out.println("toplam = " + toplam);





    }


}
