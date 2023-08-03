package _0_tekrarlar;

public class Gun1501 {
    public static void main(String[] args) {
        // 0 dan 100 e kadar olan çift sayıların toplamını bulunuz.
        // toplam 50 yi geçtiğinde , mesaj yazınız.(50 geçildi şeklinde)
        // ve döngüden çıksın

        int toplam=0;
        for (int i = 0; i <=100 ; i+=2) {
            toplam=i+toplam;
            System.out.println("i = " + i);
            if (i>50){
                System.out.println("geçtiniz");
                        break;
            }
        }
        System.out.println("toplam = " + toplam);

    }
}
