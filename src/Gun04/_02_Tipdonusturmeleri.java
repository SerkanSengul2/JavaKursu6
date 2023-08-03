package Gun04;

public class _02_Tipdonusturmeleri {
    public static void main(String[] args) {

        byte ogrNot1 = 98;
        byte ogrNot2 = 97;
        byte ogrNot3 = 99;
        byte ogrNot4 = 100;

        //int    //byte

        int toplamnot = ogrNot1 + ogrNot2 + ogrNot3 + ogrNot4;
        System.out.println("toplamnot = " + toplamnot);
        // int hafızadki alnı daha büyük;

        byte toplam2= (byte)toplamnot;//394'ü byte alana atıyorum
        System.out.println("ogrNot2 = " + ogrNot2);


        //ondalıklı bir sayının sadece tam sayı kısmı gerekebilir
        //10/3= ikisde tam sayıysa 3 veririm diyor.10/(double)3 = o zaman 3.33 veririm diyor.

    }


}
