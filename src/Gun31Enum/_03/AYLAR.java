package Gun31Enum._03;

public enum AYLAR {
    Tanimsiz(0, 0, ""),

    OCAK(1, 31, "OCAK"),

    sUBAT(2, 28, "ŞUBAT"),

    MART(3, 31, "MART"),

    NISAN(4, 30, "NİSAN"),

    MAYIS(5, 31, "MAYIS"),

    HAZIRAN(6, 30, "HAZIRAN"),

    TEMMUZ(7, 31, "TEMMUZ"),

    AGUSTOS(8, 31, "AGUSTOS"),

    EYLUL(9, 30, "EYLUL"),

    EKIM(10, 31, "EKIM"),

    KASIM(11, 30, "KASIM"),

    ARALIK(12, 31, "ARALIK");

    int ayNO;
    int gunMiktar;
    String ayAd;

    AYLAR(int ayNo, int gunMiktar, String ayAd) {
        this.ayNO = ayNo;
        this.gunMiktar = gunMiktar;
        this.ayAd = ayAd;

    }
}