package Gun29.Orneksoru;

public class Banka {
    public static void main(String[] args) {
        Musteri mst1 = new Musteri();
        mst1.MusteriNo = 1;
        mst1.adi = "Serkan";
        mst1.soyad = "Sengul";
        System.out.println(mst1.MusteriNo + mst1.adi + mst1.soyad);
        mst1.Musterihesap.ParaYatir(100);
        mst1.Musterihesap.ParaYatir(200);
        mst1.Musterihesap.paraCek(50);

        System.out.println("mst1.Musterihesap = " + mst1.Musterihesap);
        //mst1.Musterihesap.bakiye=100000;

    }


}
