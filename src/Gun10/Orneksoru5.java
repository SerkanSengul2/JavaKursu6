package Gun10;

import java.util.Scanner;

public class Orneksoru5 {
    public static void main(String[] args) {

//girilen bir string uzunlugu 10 dan büyükse ve string içinde
//"study" kelimesi geçiyrsa evet yazdırın
//degılse hayır yazdırınız

        Scanner oku = new Scanner(System.in);
        System.out.print("cümle giriniz= ");
        String cumle = oku.nextLine();
        if (cumle.length() > 10 && cumle.toLowerCase().contains("study"))
            System.out.println("evet");
        else
            System.out.println("hayır");

    }


}
