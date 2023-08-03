package Gun31Enum._01_Konu.Enum;

public class Ornek1Cozum {
    //enumarator:numalandırılmıs sımgeler
    public static void main(String[] agrs) {

        // Yazılım dillerinde enum, enumaration ve enum sabitleri
        // olarak adladırılmaktadır. Tanımlanan değişkenlerin
        // sabit değer alması için kullanılır. Tanımlanan
        // bu sabit değerler bir grup oluşturur. Erişilmesi,
        // yönetilmesi ve anlaşılması kolay hale gelir.

        Aylar ay = Aylar.MAYIS;
        switch (ay) {
            case SUBAT:
                System.out.println(28);
                break;
            case OCAK:
            case MART:
            case MAYIS:
            case TEMMUZ:
            case AGUSTOS:
            case EKIM:
            case ARALIK:
                System.out.println(31);
                break;
            case NISAN:
            case HAZIRAN:
            case KASIM:
            case EYLUL:
                System.out.println(30);
                break;


        }
        if (ay == Aylar.MAYIS)
            System.out.println("zam ayı");
        System.out.println("ay = " + ay);
        System.out.println("ay.name() = " + ay.name());
        System.out.println("ay.ordinal() = " + ay.ordinal());

        for (Aylar a : Aylar.values())
            System.out.println(a.name() + "= " + a.ordinal());

    }
}





