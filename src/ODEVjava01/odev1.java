package ODEVjava01;

import java.util.Scanner;

public class odev1 {
    public static void main(String[] args) {


        // Swap first name with last name in the email (Seperated by an underscore).
        //If the email doesn't contain an underscore print the given input email.

        Scanner oku = new Scanner(System.in);
        System.out.print("mail giriniz= ");
        String mail = oku.nextLine();
        int cizgi = mail.indexOf("_");
        int et = mail.indexOf("@");
        String name = mail.substring(0, cizgi);
        String surname = mail.substring(cizgi + 1, et);
        if (!mail.contains("_")) {
            System.out.println(mail);
        }
else
            System.out.println(surname+mail.charAt(cizgi)+name+mail.substring(et));
    }

///tekrar yap
}
