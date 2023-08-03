package Gun30.StaticVariables.Ornek1;

public class Okul {
    public static void main(String[] args) {
//        Ogrenci ogr1=new Ogrenci("Serkan","Sengul","İzmir Okulu");
//        Ogrenci ogr2=new Ogrenci("Ismet","Temur","İzmir Okulu");
//        Ogrenci ogr3=new Ogrenci("Elif","Ozen","İzmir Okulu");
//
//   //..
//   //..
//        Ogrenci ogr499=new Ogrenci("Senol","Dogan","İzmir Okulu");
//        Ogrenci ogr500=new Ogrenci("Murat","Savluk","İzmir Okulu");

        Ogrenci ogr1=new Ogrenci("Serkan","Sengul");
        System.out.println("ogr1 = " + ogr1);

        Ogrenci.OkulAd="Atatürk Okulu";
        System.out.println("ogr1 tekrar = " + ogr1);

//     Aynı verinin çok kez girişi engellendi
//      Aynı verinin hazıfazada NESNE sayısı kadar tekrarlanması engellendi

    }
}
