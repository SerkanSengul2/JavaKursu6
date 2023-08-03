package Gun11;

import java.util.Scanner;

public class _08_JavaMath01 {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("a değeri");
        int a= oku.nextInt();
        System.out.println("b değeri");
        int b= oku.nextInt();
        System.out.print("c değeri");
        int c= oku.nextInt();



        System.out.println("büyük olanı yaz= "+Math.max(a,Math.max(b,c)));





    }



}
