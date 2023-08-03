package OdevArray;

public class Odev1 {
    public static void main(String[] args) {

        //Bu String'i oluşturun. "Removes white space from both ends of a string"
        //String'deki kelime sayısını yazdırınız.

        String cumle = "Removes white space from both ends of a string";

        int kelime=1;
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i)==' ')
                kelime++;

        }

        System.out.println("kelime = " + kelime);
    }
}
