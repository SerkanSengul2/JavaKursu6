package Gun29.Orneksoru;

public class Hesap {

    private int yatan;
    private int cekilen;
    private int bakiye;

    public void ParaYatir(int yatanPara) {
        this.yatan = this.yatan + yatanPara;
        this.bakiye = this.bakiye + yatanPara;
    }

    public void paraCek(int cekilenPara) {
        this.cekilen = this.cekilen + cekilenPara;
        this.bakiye = this.bakiye - this.cekilen;
    }


    public String toString() {
        return "Hesap{" +
                "yatan=" + yatan +
                ", cekilen=" + cekilen +
                ", bakiye=" + bakiye +
                '}';


    }

}

