package Gun13;

import java.util.Scanner;

public class _05_WhileLoop {
    public static void main(String[] args) {
    //girilen 5 sayının toplam sayının sonucnu yazdırınız

        Scanner oku=new Scanner(System.in);
        int sayac=1;
        int toplam=0;
        while (sayac<=5){
            System.out.print("sayi giriniz= ");
            sayac++;
            int sayi= oku.nextInt();
            toplam=toplam+sayi;

        }
        System.out.println("toplam = " + toplam);

//


    }




}
