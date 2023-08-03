package Gun43;

public class _06_TryCatchFinaly {
    public static void main(String[] args) {
        String str = "";
long startime=0;
        try {
            startime=System.currentTimeMillis();
            System.out.println("hatadan önceki kısım");
            char ilkharf = str.charAt(0);
            System.out.println("hatadan sonraki kısım");

        } catch (Exception ex) {
            System.out.println("catch bloğu çalıştı");
            //hata olduğunda yapılacaklar


        }
        finally {//hata olsa da olmasa da çalışıyor
            //try catch bloğu ile ilgili kodlar yazılır.
            System.out.println("try-catch bloğuyla ilgili son yapılacaklar");
            System.out.println(System.currentTimeMillis()-startime+" ms");
        }
        System.out.println("diğer çalışacak kodlar");
        System.out.println("program bitti");

    }


}
