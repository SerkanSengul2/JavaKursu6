package Gun31Enum.OrnekSoru;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Siparis {
    public static void main(String[] args) {
        ArrayList<Pizza> PizzaMenu = new ArrayList<>();
        Scanner oku = new Scanner(System.in);
        int secim;
        do {
            System.out.println("Pizza için bir seçenek girin:");
            System.out.println("1 - Small");
            System.out.println("2 - Medium");
            System.out.println("3 - Large");
            System.out.println("4 - Göster");
            System.out.println("0 - Çıkış");

            secim = oku.nextInt();
            switch (secim) {
                case 1:
                    Pizza p1 = new Pizza(PizzaBoy.SMALL);
                    PizzaMenu.add(p1);
                    System.out.println("small boy hazırlanıyor");
                    break;
                case 2:
                    Pizza p2 = new Pizza(PizzaBoy.MEDIUM);
                    PizzaMenu.add(p2);
                    System.out.println("Medıum boy hazırlanıyor");
                    break;
                case 3:
                    Pizza p3 = new Pizza(PizzaBoy.LARGE);
                    PizzaMenu.add(p3);
                    System.out.println("Large boy hazırlanıyor");
                    break;
                case 4:
                    Goster(PizzaMenu);
                    break;
                case 0:
                    System.out.println("İyi günler,Afiyet olsun");
                    break;
                default:
                    System.out.println("hatalı giriş yaptınız");
            }
        } while (secim != 0);

    }

    public static void Goster(ArrayList<Pizza> PizzaMEnu) {
        int kucukboy = 0;
        int ortaboy = 0;
        int buyukboy = 0;
        int toplampizza;
        for (Pizza a : PizzaMEnu) {
            if (PizzaBoy.SMALL == a.pizzaboyut) {
                kucukboy++;
            } else {
            }
            if (PizzaBoy.MEDIUM == a.pizzaboyut) {
                ortaboy++;
            } else {
                if (PizzaBoy.LARGE == a.pizzaboyut) {
                    buyukboy++;
                }
            }
        }
        toplampizza = ortaboy + buyukboy + kucukboy;
        System.out.println("buyukboy = " + buyukboy);
        System.out.println("ortaboy = " + ortaboy);
        System.out.println("kucukboy = " + kucukboy);
        System.out.println("toplampizza = " + toplampizza);

        int toplamucret = 0;
        for (Pizza a : PizzaMEnu) {
            toplamucret = toplamucret + a.pizzaboyut.fiyat;
        }
        System.out.println("toplamucret = " + toplamucret);

    }


}








