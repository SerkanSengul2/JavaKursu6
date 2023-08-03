package Gun14;

public class _07_forsoru3 {
    public static void main(String[] args) {

//0 dan 100 e kadar olan cift sayıların toplamnı bulunuz
// 50'yi geçtiğinde mesaj yazınız
        int toplam = 0;
        boolean sinir = false;
        for (int i = 0; i <= 100; i += 2) {

            toplam = i + toplam;



            if (i >= 50 && sinir == false){
                System.out.println("50yi geçtiniz");

                System.out.println("i = " + i);

                sinir=true;}

            }

        System.out.println("toplam = " + toplam);
        }



    }






