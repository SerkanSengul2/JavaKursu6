package OdevArray;

public class Odev12 {
    public static void main(String[] args) {
//        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
//        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
//        Eğer aitse "true" çevirin.
//                Loops (döngüler) kullanın.

        String[]dizi={"Apple","Orange","Banana","Pineapple"};
        boolean Varmi=false;
        for (int i = 0; i < dizi.length ; i++) {

            if (dizi[i].equals("Apple")){
                Varmi=true;

            }

        }

        System.out.println("Apple var mı?="+Varmi);

    }



}
