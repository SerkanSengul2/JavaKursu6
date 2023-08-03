package _0_tekrarlar;

import java.util.Scanner;

public class Javasamet03 {
    public static void main(String[] args) {


        // Swap first name with last name in the email (Seperated by an underscore).
        //If the email doesn't contain an underscore print the given input email.

        //serkan_sengul@gmail.com

        Scanner oku = new Scanner(System.in);
        System.out.print("mail adresinizi yazınız= ");
        String mail = oku.nextLine();
        int cizgi = mail.indexOf("_");
        int et = mail.indexOf("@");

        if (!mail.contains("_")) {
            System.out.println(mail);
        } else {
            String name = mail.substring(0, cizgi);
            String surname = mail.substring(cizgi + 1, et);
            System.out.println(surname + mail.charAt(cizgi) + name + mail.substring(et));

        }
    }


}
