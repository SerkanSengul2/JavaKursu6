package Gun05;

import java.util.Scanner;

public class _09_ornek09 {
    public static void main(String[] args) {
        // Kullanıcıdan ağırlığını(kg) double, boyunu(m) double olarak alınız.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kitle indexini de bularak yazdırınız   kg/ (boy*boy)

        Scanner oku=new Scanner(System.in);
        System.out.print("kilonuz(kg)");
        double kilo=oku.nextDouble();
        System.out.print("Boyunuz(m)=");
        double boy=oku.nextDouble();
        double vucutkitInd=kilo/(boy*boy);
        System.out.println("Kilonuz="+kilo+"kg, boyunuz="+boy+"m");
        System.out.println("vucutkitle Indeksiniz="+vucutkitInd);








    }



}
