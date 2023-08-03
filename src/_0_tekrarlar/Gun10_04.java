package _0_tekrarlar;

import java.util.Scanner;

public class Gun10_04 {
    public static void main(String[] args) {
        //girilen bir string uzunlugu 10 dan büyükse ve string içinde
        //"study" kelimesi geçiyrsa evet yazdırın
        //degılse hayır yazdırınız

        Scanner oku = new Scanner(System.in);
        System.out.print("kelime girin= ");
        String kelime = oku.nextLine();
        int a = kelime.length();
        if (kelime.length() > 10 && kelime.contains("study")){
            System.out.println("evet");
        }
else
            System.out.println("hayır");
    }


}
