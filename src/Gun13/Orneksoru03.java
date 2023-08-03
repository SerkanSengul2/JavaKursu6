package Gun13;

import java.util.Scanner;

public class Orneksoru03 {
    public static void main(String[] args) {
//girilen bir ay numarasına bir ayın kac gun surdugunu bulunuz

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir ay numarası giriniz= ");
        int aynumarasi=oku.nextInt();

        switch (aynumarasi) {
            case 1:
                System.out.println("ocak");
            case 3:
                System.out.println("mart");
            case 5:
                System.out.println("mayıs");
            case 7:
                System.out.println("temmuz");
            case 8:
                System.out.println("ağustos");
            case 10:
                System.out.println("ekim");
            case 12:
                System.out.println("aralık");
                aynumarasi = 31;
                break;
            case 4:
                System.out.println("nisan");
            case 6:
                System.out.println("haziran");
            case 9:
                System.out.println("eylül");
            case 11:
                System.out.println("kasım");
                aynumarasi = 30;
                break;
            case 2:
                System.out.println("şubat");
                aynumarasi = 27;

            default:
                System.out.println("hatalı ay girdiniz");


        }



    }


}
