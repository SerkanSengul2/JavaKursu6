package Gun39._03_Soru_3;

public class Hayvanlar {
    public static void main(String[] args) {
        Kedi kedi1=new Kedi("Sarman",false,"01/05/2012");
        System.out.println("kedi1 ID'si = " + kedi1.getId());
        System.out.println("kedi1 = " + kedi1);
        kedi1.Sesi();
        kedi1.gunlukUykusu();
        kedi1.yemekMiktari();
        kedi1.yiyecegi();
        System.out.println("*********************************");
        Kartal kartal1=new Kartal("Beyaz",true,"10/05/2015");
        System.out.println("kartal1 ID'si = " + kartal1.getId());
        System.out.println("kartal1 = " + kartal1);
        kartal1.gunlukUykusu();
        kartal1.Sesi();
        kartal1.yiyecegi();
        kartal1.yemekMiktari();

    }
}
