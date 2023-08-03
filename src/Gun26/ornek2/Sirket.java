package Gun26.ornek2;

public class Sirket {
    public static void main(String[] args) {

        Person pers1 = new Person();

        pers1.name = "Serkan";
        pers1.surname = "Sengul";
        pers1.age = 33;
        pers1.birthday = 1990;
        Person pers2 = new Person();
        pers2.name = "Kerem";
        pers2.surname = "Dizdar";
        pers2.age = 33;
        pers2.birthday=1990;

        BilgiYazdir(pers1);
        BilgiYazdir(pers2);

        pers1.GetBirthDay();
        pers2.GetBirthDay();

        //3. yol class'da method dan yazdır
        pers1.BilgiYazdir();
        System.out.println("pers1 = " + pers1);
        System.out.println("pers2 = " + pers2);
    }

    public static void BilgiYazdir(Person cal) {
        System.out.println("calısan ısım= " + cal.name);
        System.out.println("calısan surname= " + cal.surname);
        System.out.println("calısan yaşı= " + cal.age);

    }

}

