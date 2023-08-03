package Gun16;

import java.util.Random;
import java.util.Scanner;

public class _06_JavaArraysoru3 {
    public static void main(String[] args) {
        // 5 tv kanalı ismini bir diziye doldurunuz. trtr, kanald,atv,fox,habertürk
        // Daha sonra random olarak bir tanesini seçip ekrana seçileni yazıdırnız.

        String[] kanallar = {"trt", "kanald", "atv", "show", "fox"};

        int rndindex = (int) (Math.random() * kanallar.length);


            System.out.println("Secilen kanal=" + kanallar[rndindex]);

            }

        }






