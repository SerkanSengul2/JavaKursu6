package Gun42;

public class _01_StringBufferAndStringBuilder {
    public static void main(String[] args) {
        String cumle = "";
        cumle = cumle + "Bugün";//Bugün oldu
        cumle = cumle + " Hava";
        cumle += " cok soguk";

        System.out.println("cumle = " + cumle);
        System.out.println("cumle= " + cumle + "      Değil mi");
//bugun hava cok soguk

        System.out.println("cumle= " + cumle.concat("dün değildi"));
        cumle.concat(" merhaba");//cumlenı degerı degısmez.atama gerektirir.
        cumle = cumle.concat(" merhaba");//cumlenın degerı degısır.

        /**********************StringBuilder******************************/
        StringBuilder cumle2=new StringBuilder();
        cumle2.append(" Bugün");//direkt kendisine atıyor.//eşitleme gerekmiyor.
        cumle2.append(" hava");
        cumle2.append(" soğuk");
        System.out.println("cumle2 = " + cumle2);





        /******** + **** concat ****** StringBuilder ***** hız farkları *******/
        long StartTime=System.currentTimeMillis();
        String test1="";
        for (int i = 0; i <1000 ; i++) {
            test1=test1+" merhaba";

        }
        System.out.println("+ için geçen süre= " +(System.currentTimeMillis()-StartTime)+" ms");



         StartTime=System.currentTimeMillis();
        String test2="";
        for (int i = 0; i <1000 ; i++) {
            test2=test2.concat(" merhaba");


        }

        System.out.println("concat geçen süre= " +(System.currentTimeMillis()-StartTime)+" ms");

        StartTime=System.currentTimeMillis();
        StringBuilder test3=new StringBuilder();
        for (int i = 0; i <1000 ; i++) {
            test3.append(" merhaba");


        }

        System.out.println("StringBuilder için süre= " +(System.currentTimeMillis()-StartTime)+" ms");


        System.out.println("\n\n******************************************");
        /*              StringBuilder'ı yakından tanıyalım  */

        StringBuilder sb=new StringBuilder();
        sb.append(" Bugün ");// kendine ekleme-atama gerektirmiyor
        sb.append(" Hava");
        sb.append(" biraz soğuk");
        System.out.println("sb = " + sb);

        System.out.println("sb.length() = " + sb.length());
        sb.append(4);
        
        System.out.println("sb = " + sb);
        sb.reverse();//Stringi ters cevırıyor
        
        System.out.println("sb = " + sb);
        sb.reverse();

        sb.delete(0,5);//0 dahil 5 hariç siliyor
        System.out.println("sb = " + sb);
        
        sb.deleteCharAt(3);//sadece belirtilen indexi siler
        System.out.println("sb = " + sb);
        
        sb.insert(5,"kelime ");//5 nolu indexe kelimeyi ekle
        System.out.println("sb = " + sb);
        
        String parca =sb.substring(5,8);//5  dahil 7 degıl
        System.out.println(parca);

        boolean varmi= sb.toString().startsWith("de");
        System.out.println("varmi = " + varmi);
        
        sb.replace(5,8,"saç");
        System.out.println("sb = " + sb);//verilen aralığa kelime eklenir

        sb=new StringBuilder();//tamamen sıfırlamak yenilemek
        sb=new StringBuilder("Bugün Hava soğuk");//ilk atama yapılabilir

        StringBuffer sBuffer=new StringBuffer();//tamamen StringBuilder aynı
        //tek farkı paralel çalışan yazılımlar için kullanıılır.














    }

    // Performans testi sonucu :
    // eğer 3 kadar ekleme işlemi olacaksa + kullanılır, pratik olduğu için
    // ancak daha fazla ekleme olacaksa 10 adede kadar concat kullanılabilir
    // Eğer çok fazla String işlemleri yapacaksak bunun için
    // performansı oldukça iyi olan StringBuilder kullanılır.
    // yapısı gereği hızlı çalışır.







}
