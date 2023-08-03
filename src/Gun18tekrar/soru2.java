package Gun18tekrar;

import java.util.Arrays;
import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        // 10 elemanlı bir diziyi random(10 dahil sayılarla) doldurduktan sonra,
        // kullanıcının  gireceği bir rakamı arattırınız.
        // bu rakam var ise indexini yazıdırnız.

    int[]dizi=new int[10];
        for (int i = 0; i < dizi.length ; i++) {
            dizi[i] = (int) (Math.random() * 11);
        }  System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));

            Scanner oku=new Scanner(System.in);
        System.out.print("Aranacak rakam (0-10)= ");
        int arananrakam= oku.nextInt();
        for (int i = 0; i < dizi.length ; i++) {
            if (dizi[i]==arananrakam)
                System.out.println("var,oda numarası="+i);
        }

            }


        }



