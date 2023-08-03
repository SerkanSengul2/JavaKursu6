package Gun08;

public class _03_StringRepcaleALL {
    public static void main(String[] args) {

        String text = "Merhaba Dünya1234";
        System.out.println("abn ->"+text.replaceAll("[abn]","_"));
        //a,b,n leri _ yap
        System.out.println("text.replaceAll = " + text.replaceAll("[A-Z]","_"));
        //A-Z YE KADAR HARFLERİ YAP>
        System.out.println("0-9 arasını sil ="+text.replaceAll("[0-9]",""));

    }


}
