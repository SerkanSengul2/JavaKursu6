package Gun29._02_PrivateErisim;

public class Sirket {
    public static void main(String[] args) {
        Calisan cal1 = new Calisan();
        cal1.id = 1;
        cal1.name = "Serkan";
        cal1.surname = "Sengul";

        cal1.SifreAta("1234");
        cal1.SifreAta("m123_sdf23");
        cal1.sifreGoster();

    }
}
