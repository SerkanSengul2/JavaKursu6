package Gun13;

import java.util.Scanner;

public class _06_WhileLoop {
    public static void main(String[] args) {
//girilen 5 sayıdan sadece pozitif olanların toplanı bulunuz

        Scanner oku=new Scanner(System.in);
        int sayac=1;
        int toplam=0;
        System.out.print("sayi giriniz=");
        int sayi = oku.nextInt();
        while (sayac<=6) {


            if (sayi > 0) {
                toplam=toplam+sayi;
                sayac=sayac+1;
            }

        }
        System.out.println("toplam = " + toplam);





    }


}
