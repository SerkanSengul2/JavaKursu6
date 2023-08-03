package Gun38._03_Abstract;

public class YemekSepeti {
    public static void main(String[] args) {
        Baklava bak1=new Baklava();
        System.out.println(bak1.getClass().getSimpleName());
        bak1.taste();
        bak1.madeln();
        System.out.println("********************");

        CheeseCake ces=new CheeseCake();
        System.out.println(ces.getClass().getSimpleName());
        ces.madeln();
        ces.taste();
        System.out.println("********************");

        GreekSalad gek1=new GreekSalad();
        System.out.println(gek1.getClass().getSimpleName());
        gek1.madeln();
        gek1.taste();
        System.out.println("*********************");
        SezarSalad sez1=new SezarSalad();
        System.out.println(sez1.getClass().getSimpleName());
        sez1.madeln();
        sez1.taste();
    }
}
