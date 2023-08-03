package OdevArrayList;

import java.util.ArrayList;

public class soru1 {
    public static void main(String[] args) {
//        Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
//        Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
        ArrayList<Integer> liste = new ArrayList<>();
        int[][] dizi = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(dizi[i][j] + " ");
                liste.add(dizi[i][j]);
            }
            System.out.println();
        }
        System.out.println("liste = " + liste);
    }
}




