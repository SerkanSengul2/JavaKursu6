package _0_tekrarlar;

import java.util.Scanner;

public class Javasamet02 {
    public static void main(String[] args) {
        // A sandwich is two pieces of bread with something in between.
        //       Print the string that is between the first and last appearance of "bread" in the given string,
        //or return string "nothing" if there are not two pieces of bread.

        //input: breadjambread
        //output: jam

        Scanner oku = new Scanner(System.in);
        System.out.print("cümle giriniz= ");
        String cumle=oku.nextLine();
        int b=cumle.indexOf("bread");
        int b2=cumle.lastIndexOf("bread");
        if (b==b2){
            System.out.println("nothing");
        }
        else
            System.out.println(cumle.substring(b+5,b2));


    }


}
