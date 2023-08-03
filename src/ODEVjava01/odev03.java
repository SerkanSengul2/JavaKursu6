package ODEVjava01;


import java.util.Scanner;

public class odev03 {
    public static void main(String[] args) {


       //Write a program that will print out information about user based on email. Print first name, last name, and domain.
        //First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

        //serkan_sengul@apple.com
        //Serkan
        //Sengul
        //Apple


        Scanner oku=new Scanner(System.in);
        System.out.print("mail adresi giriniz= ");
        String mail=oku.nextLine();
        int cizgi=mail.indexOf("_");
        int et=mail.indexOf("@");
        int nokta=mail.indexOf(".");
        char ad=mail.toUpperCase().charAt(0);
        String ad1=mail.substring(1,cizgi);
        char surname=mail.toUpperCase().charAt(cizgi+1);
        String surname2=mail.substring(cizgi+2,et);
        char dom=mail.toUpperCase().charAt(et+1);
        String dom2=mail.substring(et+2,nokta);
        System.out.println(ad+ad1);
        System.out.println(surname+surname2);
        System.out.println(dom+dom2);

///tekrar









    }




}



