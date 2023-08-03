package _0_tekrarlar;

import java.util.Scanner;

public class gun0903 {
    public static void main(String[] args) {

        //girilen bir cümlede a harfinin geçip geçmediğini
        //bulunuz geçiyor ise evet geçmiyor ise hayır yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("cümle giriniz= ");
        String kelime=oku.nextLine();
        boolean varmI=kelime.contains("a");
        if (kelime.contains("a")){
            System.out.println("dogru");
        }
       else
            System.out.println("yok");







    }



}
