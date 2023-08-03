package _0_tekrarlar;

import java.util.Scanner;

public class Proje2 {
    public static void main(String[] args) {
        String[] urunIsmi = {"muz", "tuvalet kağıdı", "yağ", "kedi maması"};
        double[] urunFiyat = {12.50, 150.50, 200.0, 80.99};
        int[] urunStok = {8, 2, 15, 65};

        Scanner oku = new Scanner(System.in);
        Scanner okuint = new Scanner(System.in);

        String cevap;
        String urun;
        boolean stokVarMi = false;
        double toplamTutar = 0;
        double urunToplami;
        int eksikadet=0;

        System.out.println("-ürünlerimiz-");

        for (int i = 0; i < urunIsmi.length; i++) {


            System.out.println(i + 1 + "-> " + urunIsmi[i] + " = " + urunFiyat[i] + "tl" + " \n" + "stokta kalan" + "=" + urunStok[i]);

            System.out.println();

        }


        do {


            while (true) {
                System.out.print("bir ürün giriniz(işleminiz bittiyse z ye basınız)=");
                urun = oku.nextLine();
                if (urun.equalsIgnoreCase("z")) {
                    break;
                }
                System.out.print("kaç adet istersiniz=");
                int adet = okuint.nextInt();
                for (int i = 0; i < urunIsmi.length; i++) {

                    if (urunIsmi[i].equalsIgnoreCase(urun)) {
                        if (urunStok[i] >= adet) {
                            stokVarMi = true;

                            urunToplami = urunFiyat[i] * adet;

                            toplamTutar += urunToplami;

                            urunStok[i] -= adet;
                            break;
                        } else stokVarMi = false;
                        eksikadet = adet - urunStok[i];
                        break;

                    }
                }
                if (!stokVarMi) {
                    System.out.println("stoktakinden" + " " + eksikadet + " " + "adet fazla giridiniz. yeni bir adet giriniz.");

                }

            }

            System.out.println("Toplam Tutar = " + toplamTutar + "tl");
            System.out.println("Alışverişe devam etmek istiyor musunuz?(EVET/HAYIR)");
            cevap = oku.nextLine();

            if (cevap.equalsIgnoreCase("hayır")) {
                System.out.println("Alışverişiniz bitti.\n" + "toplam tutarınız= " + toplamTutar + "tl. İyi günler dileriz.");
            }

        }while (cevap.equalsIgnoreCase("evet"));









    }
}