package OdevArray;

public class Odev5 {
    public static void main(String[] args) {
//        String array  oluşturun ve elemanları: "new jersey" , "new york", "boston","California"
//        Array'daki eleman sayısını yazdırınız.
//        Cevap 4 olmalı.

        String sehirler[] = new String[]{"new jersey" , "new york", "boston","California"};
        int eleman=0;
        for (int i = 0; i <sehirler.length ; i++) {
            eleman++;
        }

        System.out.println("eleman = " + eleman);

    }


}
