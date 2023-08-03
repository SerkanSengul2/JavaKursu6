package Gun02;

public class Örnek5 {
    public static void main(String[] args) {
        // \    yeni satır aç,alt satıra geçer
        // \t   tab tusuna bas,2-3 harflik boşluk oluşturur
        // \b   backspace etkisi oluşturur,yani 1 karakter geri siler
        // \"   tırnak yazdırmak için kullanır.
        // \\   ekrana bir tane \ yazar
        // \r   satır başına git

        System.out.println("merhabaDünya"); //      merhabaDünya yazar
        System.out.println("merhaba\nDünya");//     Merhaba yazar,alt satıra Dünya yazar
        System.out.println("merhaba\tDünya");//     merhaba boşluk koyar Dünya yazar
        System.out.println("merhaba\bDünya");//     MerhabDünya yazıcak 1 karekter silecek
        System.out.println("merhaba\"Dünya");//     Merhaba"Dünya yazıcaktır
        System.out.println("merhaba\\Dünya");//     merhaba/dünya yazıcaktır
        System.out.println("merhaba\rDünya");//     Dünya yazar sadece öncesini yazmaz

    }


}



