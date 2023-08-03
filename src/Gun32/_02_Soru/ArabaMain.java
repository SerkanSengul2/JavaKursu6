package Gun32._02_Soru;

public class ArabaMain {
    public static void main(String[] args) {
        Araba arb1=new Araba();

        arb1.setRenk("kirmizi");
        arb1.setModel(2023);
        arb1.setKapisayisi(4);
        arb1.setMotorHacmi(1900);

        System.out.print("arb1 = " + arb1);
        //Kural: genel yazılım kuralıdır.
        //bütün değişkenler private yapılır
        //yani kapsulleme ile kullanılır
        //eğer gerekiyorsa private kaldırılır.

    }
}
