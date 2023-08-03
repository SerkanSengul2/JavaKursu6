package OdevMethodlar;

public class odev6 {
    public static void main(String[] args) {
        System.out.println(PowerOfThree(27));
        System.out.println(PowerOfThree(15));


    }

    public static boolean PowerOfThree(int sayi) {
        if (sayi <= 0) {
            return false;
        }
        while (sayi % 3 == 0) {
            sayi = sayi / 3;
        }
        return sayi == 1;
    }
}
