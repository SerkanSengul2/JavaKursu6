package Gun20;

public class _06_JavaMethod {
    public static void main(String[] args) {
        int s1 = 45;
        int s2 = 4;
        int s3 = 67;
        int s4 = 23;
        int sonuc1 = toplambul(s1, s2);
        int sonuc2 = toplambul(s1, s2, s3);
        int sonuc3 = toplambul(s1, s2, s3, s4);
        System.out.println("sonuc1 = " + sonuc1);
        System.out.println("sonuc2 = " + sonuc2);
        System.out.println("sonuc3 = " + sonuc3);

    }
//
//    public static int toplambul(int s1, int s2) {
//        return (s1 + s2);
//    }
//
//    public static int toplamBul(int s1, int s2, int s3) {
//        return (s1 + s2 + s3);
//    }
//
//    public static int toplamBul(int s1, int s2, int s3, int s4) {
//        return (s1 + s2 + s3 + s4);
    
    public static int toplambul(int... dizi) {
        int toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            toplam = toplam + dizi[i];

        }

        return toplam;
   
   
   
   
    }

    
    }


