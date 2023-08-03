package Gun28.ornek03;

public class sube {
    String adi;
    int subeSayisi;
    int kurulusYili;

    public sube(){

    }


    public sube(String adi, int subeSayisi, int kurulusYili) {
        this.adi = adi;
        this.subeSayisi = subeSayisi;
        this.kurulusYili = kurulusYili;

    }

    public String toString() {
        return "sube{" +
                "adi='" + adi + '\'' +
                ", subeSayisi=" + subeSayisi +
                ", kurulusYili=" + kurulusYili +
                '}';
    }
}



