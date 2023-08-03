package Gun41._01_JavaLocalDateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _06_StringToLocalDateAndTimeParse {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Tarih giriniz (25 01 2023)=");
        String strtarih= oku.nextLine();

        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate tarih=LocalDate.parse(strtarih,f);
        System.out.println("tarih = " + tarih.format(f));
        
        
    }
}
