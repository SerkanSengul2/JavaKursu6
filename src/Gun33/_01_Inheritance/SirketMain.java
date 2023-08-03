package Gun33._01_Inheritance;

public class SirketMain {
    public static void main(String[] args) {
        YoneticiYeni yy=new YoneticiYeni();
        yy.setAd("serkan");
        yy.zamYap();
        System.out.println("yy = " + yy);
        Personel pp=new Personel();
        pp.setAd("kerem");
        pp.setDepartmani("gloryhole");
    }
}
