package Gun40._01_DateTime1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class Soru {
    public static void main(String[] args) throws InterruptedException {
        //Canlı Digital saat yapınız

       DateTimeFormatter d=DateTimeFormatter.ofPattern("kk:mm:ss");
       while (true){

           LocalTime saat=LocalTime.now();
           System.out.print("\rsaat = " + saat.format(d));
           Thread.sleep(1000);

       }

        }
    }


    

