package Gun06;

public class _06_StringIndexof {
    public static void main(String[] args) {
        //indexof: verilen karakter(lerin) indeksini verir
        // 01234 : harflerin oda numarası
        // bugün

        String cumle = "merhaba dünya";
        //h nin oda numarası kaç=3
        //a nın oda numarası kaç=4
        //dü nin indexi kaç=8

        System.out.println("cumle.IndexOf = " + cumle.indexOf("m"));
        System.out.println("cumle.IndexOf = " + cumle.indexOf("h"));
        System.out.println("cumle.indexOf " + cumle.indexOf("a"));
        System.out.println("cumle.indexOf " + cumle.indexOf("dü"));
        System.out.println("cumle.indexOf = " + cumle.indexOf(""));
        System.out.println("cumle.indexOf = " + cumle.indexOf("A"));
        System.out.println("cumle.indexOf = " + cumle.indexOf("a",5));
        System.out.println("cumle.indexOf = " + cumle.indexOf("a",7));






    }


}
