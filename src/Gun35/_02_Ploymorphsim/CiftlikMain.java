package Gun35._02_Ploymorphsim;

public class CiftlikMain {
    public static void main(String[] args) {
        Kopek kopek1 = new Kopek("karabaş");
        Kedi kedi1 = new Kedi("Leyli");
//        kopek1.ses();//havladı
//        kopek1.kokladi();//kokladi
//
//
//
//        kedi1.ses();//miyavladı
//        kedi1.tirmaladi();//tırmaladı
//
//        kopekSesi(kopek1);//havladı
//        KediSesi(kedi1);//miyavladı

        Hayvansesi(kopek1);
        Hayvansesi(kedi1);

    }
//  Hayvan classından türettiğimiz-extend yaptığımız için
//  hayvanSesi olarak eklediğimiz methoddan yazdırdığımızda da
//  köpek ve kedi için classlarında Override yaparak yazdığımız
//  özellikleri alarak yazdı.
//  Ama tırmaladı , kokladı gibi kedi, köpek classına özel olarak
//  yazdıklarımızı hayvanSesi methodunda yazdıramayız.

    public static void Hayvansesi(Hayvan hayvan) {
        hayvan.ses();
        if (hayvan instanceof Kopek) {
            ((Kopek) hayvan).kokladi();
        }
        if (hayvan instanceof Kedi) {
            ((Kedi) hayvan).tirmaladi();
        }

        Hayvan hayvan1 = new Hayvan("Ordek");
        Hayvan hayvan2 = new Kopek("Kopek");
        Hayvan hayvan3 = new Kedi("KEdi");

        System.out.println("-----------------------");

        hayvan1.ses();
        hayvan2.ses();
        hayvan3.ses();
        System.out.println("------------------------");
        ((Kopek) hayvan2).kokladi();
        ((Kedi) hayvan3).tirmaladi();

//        Polymorphism -
//                çok formluluk  - Çok çeşitlilik
//        şizofren bir konu
//
//        :  Bir NESNEN istenildiğinde, aynı zamanda extend edildiği tür gibi davranmasına
//        ve bu şekilde kullanılabilmesine Polymorphism denir.

        // öğretmenin okulda "fizik öğretmeniyim" demesi,
        // mahallede "öğretmenim" demesi gibi.

    }





}



