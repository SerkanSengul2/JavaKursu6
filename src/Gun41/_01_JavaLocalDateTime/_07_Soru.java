package Gun41._01_JavaLocalDateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        Scanner okuint = new Scanner(System.in);
        Scanner okustr = new Scanner(System.in);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.print("taksit başlangıç tarihi(01.05.2023)=");
        String strTarih = okustr.nextLine();
        LocalDate basTarih = LocalDate.parse(strTarih, f);

        System.out.print("Taksitlendirlecek mik= ");
        int toplampara = okuint.nextInt();

        System.out.print("Taksit sayısı= ");
        int taksay = okuint.nextInt();

        int taksitmik = toplampara / taksay;

        for (int i = 1; i <=taksay ; i++) {

            System.out.print(i);
            System.out.print(" "+basTarih.plusMonths(i-1).format(f));
            System.out.println(" "+taksitmik+"₺");





        }


    }
}
