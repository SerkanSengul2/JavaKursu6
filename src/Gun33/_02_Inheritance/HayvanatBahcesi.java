package Gun33._02_Inheritance;

public class HayvanatBahcesi {
    public static void main(String[] args) {
        Kedi kedi1 = new Kedi("siyah",3,"tekir");
        System.out.println("kedi1 = " + kedi1);
        kedi1.Konustu();
        Kopek kopek1 = new Kopek("siyah", 5, "labrador");
        System.out.println("kopek1 = " + kopek1);
        kopek1.Konustu();
        yilan yilan1=new yilan("mor",2,"anakonda",50);
        System.out.println("yilan1 = " + yilan1);
        yilan1.Konustu();
        Ordek ordek1=new Ordek("beyaz",6,"kaz",25);
        System.out.println("ordek1 = " + ordek1);
        ordek1.Konustu();
    }


}
