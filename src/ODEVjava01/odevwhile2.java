package ODEVjava01;

import java.util.Scanner;

public class odevwhile2 {
    public static void main(String[] args) {

// Kullanıcının gireceği 20 sayıdan tek olanlarının toplamını bulunuz
        Scanner oku=new Scanner(System.in);
        int sayac=0;
        int toplam=0;
        
        while (sayac<5){
            System.out.print("sayı giriniz=");
            int sayi=oku.nextInt();
            sayac++;
            if (sayi%2==1){
                toplam=sayi+toplam;
            }
            
            
            
            
        }

        System.out.println("toplam = " + toplam);



    }


}
