package Gun18;

import java.util.Scanner;

public class _01_Java2DArrays {
    public static void main(String[] args) {
        int sayi = 0;//1 tane sayı tutar
        int[]dizi =new int[100]; //sayi

        int[] ders1not=new int[50];// 50 kişilik ders1 notları;
        int[] ders2not=new int[50];// 50 kişilik ders2 notları;
        int[] ders3not=new int[50];// 50 kişilik ders3 notları;

        int[][] tumdersnotlari=new int[3][50];//3 tane 50'lik sayı tutabiliyor
        ders1not[0]=80;//tek boyutlu dizinin ilk elemanı

        tumdersnotlari [0][0]=80;// 2 indexe gösterilir.tablonun ilk elemanı
        System.out.println("tumdersnotlari = " + tumdersnotlari);

        Scanner oku=new Scanner(System.in);
        tumdersnotlari[0][0]= oku.nextInt();





    }


}
