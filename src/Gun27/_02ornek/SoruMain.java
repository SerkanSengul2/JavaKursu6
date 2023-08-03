package Gun27._02ornek;

public class SoruMain {
    public static void main(String[] args) {

        int max = MyMath.GetMax(5, 6);
        int min = MyMath.GetMin(4, 5);
        double us = MyMath.GetPow(5, 4);
        double Karekok = MyMath.GetPow(4, 2);
        int rndsayi=MyMath.Getrandom(10);
        System.out.println("rndsayi = " + rndsayi);
        System.out.println("Karekok = " + Karekok);
        System.out.println("us = " + us);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }

}

