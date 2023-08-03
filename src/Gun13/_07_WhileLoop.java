package Gun13;

public class _07_WhileLoop {
    public static void main(String[] args) {

        //100 e kadar olan sayıların toplanı yazınız

        int sayac=1;
        int toplam=0;

        while (sayac<=100){

            toplam=toplam+sayac;
            sayac=sayac+1;
        }
        System.out.println("toplam = " + toplam);
    }
}
