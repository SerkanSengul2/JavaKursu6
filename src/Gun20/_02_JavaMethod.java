package Gun20;

public class _02_JavaMethod {
    public static void main(String[] args) {

        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");

        merhabayaz();//giden dönen yok
        toplamyaz(4, 5);// giden var,donen yok
        int enb = Math.max(4, 5);// giden var,dönen var-eşitleyebiliyorsak dönen var
        double rndSayi = Math.random();//giden yok,dönen var-eşitleyebiliyorsak dönen var
        /**********************************/
        enBulyaz(4, 5);
        System.out.println(enb);

    }

    public static int enbbulGerigonder(int s1, int s2) //sırasıyla eşleşiy
    {
        int enb = 0;
        if (s1 > s2)
            enb = s1;
        else
            enb = 2;

        return enb;


    }

    public static void merhabayaz() {
        System.out.println("Merhaba Dünya");
    }

    public static void enBulyaz(int s1, int s2) {

    }

    public static void toplamyaz(int s1,int s2)
    {
        System.out.println(s1+s2);
    }

}




