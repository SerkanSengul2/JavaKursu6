package GUN07;

public class _10_StringToLowerCase {
    public static void main(String[] args) {

        //toLowerCase:Stringi küçük harfe çevirir


        String text = "Merhaba Dünya";
        System.out.println("orjinal hali= "+text);
        System.out.println("text.toLowerCase() = " + text.toLowerCase());

        boolean basliyorMU=text.startsWith("M");
        boolean basliyorMU2=text.startsWith("m");
        boolean basliyorMUIgnoreCase=text.toLowerCase().startsWith("m");

        System.out.println("basliyorMU = " + basliyorMU);
        System.out.println("basliyorMU2 = " + basliyorMU2);
        System.out.println("basliyorMUIgnoreCase = " + basliyorMUIgnoreCase);



    }


}
