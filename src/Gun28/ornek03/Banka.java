package Gun28.ornek03;

public class Banka {
    public static void main(String[] args) {
        sube sube1 = new sube();
        sube1.adi = "izmir";
        sube1.subeSayisi = 10;
        sube1.kurulusYili = 1999;

        sube sube2 = new sube("istanbul", 20, 2002);
        sube sube3 = new sube("bursa", 5, 2005);


        System.out.println("sube1 = " + sube1);
        System.out.println("sube2 = " + sube2);
        System.out.println("sube3 = " + sube3);

        }

}

