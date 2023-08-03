package Gun30.StaticVariables.Ornek2;

public class School {
    public static void main(String[] args) {

        Student ogr1=new Student(1,"Serkan Sengul");
        Student ogr2=new Student(2,"Ismet Temur");
        Student ogr3=new Student(3,"Beyza Demir");
        //Problem:hem id'yi takip etmek zorundayım
        //hem de hata olasılıgı yuksek

        Student ogr10=new Student("Ismet");
        Student ogr11=new Student("Mehmet");
        Student ogr12=new Student("Ayşe");
        System.out.println("ogr10 = " + ogr10);
        System.out.println("ogr11 = " + ogr11);
        System.out.println("ogr12 = " + ogr12);
    }
}
