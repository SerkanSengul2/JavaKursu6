package OdevMethodlar;

public class odev1 {
    public static void main(String[] args) {
//        Ismi **randomNum** olan bir method oluşturun.
//        Parametre olarak **int max** almalı.
//        Bu method, 0 ile max arasında random bir değer döndürmelidir.
//       Random numarayı döndürünüz
//
        randomNum(5);
        System.out.println("rasgele sayı yaz=" + randomNum(5));

    }


    public static int randomNum(int maxsayi) {

        int rndsayi = (int) (Math.random() * maxsayi);
        return rndsayi;


    }


}
