package Gun15;

public class _01_forloop {
    public static void main(String[] args) {


        //0 dan 100 e kadar olan cift sayıların toplamnı bulunuz
// 50'yi geçtiğinde mesaj yazınız
        int toplam = 0;
        for (int i = 0; i <= 100; i += 2) {
            toplam = i + toplam;
            System.out.println("i = " + i);
            if (toplam >= 50 ){
                System.out.println("50yi geçtiniz");
                break;
            }
        }
        System.out.println("toplam = " + toplam);


        }


    }
