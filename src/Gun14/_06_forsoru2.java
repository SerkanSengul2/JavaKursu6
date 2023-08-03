package Gun14;

import java.util.Scanner;

public class _06_forsoru2 {
    public static void main(String[] args) {
// kullanıcının gireceği bir rakama(dahil) kadar
        // olan sayıların toplamını bulunuz.
        Scanner oku=new Scanner(System.in);
        System.out.print("sayı giriniz=");
        int sayi= oku.nextInt();
        int toplam=0;
        for (int i = 0; i <=sayi ; i++) {
            toplam=toplam+i;

        }

        System.out.println("toplam = " + toplam);


    }



}
