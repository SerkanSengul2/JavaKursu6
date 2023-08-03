package Gun17;

import java.util.Scanner;

public class JavaSplit {
    public static void main(String[] args) {
//kullacının gireceği bir cümleden kac kelime oldugunu bulunuz
        //bugun hava cok guzel>5

        Scanner oku=new Scanner(System.in);
        System.out.print("cumle=");
        String cumle=oku.nextLine();
        
        String[] kelimeler=cumle.split(" ");
        System.out.println("kelimeler = " + kelimeler.length);
        
    }


}
