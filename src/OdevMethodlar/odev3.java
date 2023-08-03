package OdevMethodlar;

public class odev3 {
    public static void main(String[] args) {
//        reverseString isminde bir method oluşturun.
//        Bu method bir String'i parametre olarak alsın.
//        Ve bu method, girilen String'i tersten yazsın.
//        Terste yazılmış halini yazdırınız.
//        Örn: String = "Java'yı Seviyorum."
//        Print: .muroyiveS ıy'avaJ
        
        String reverseString="Java'yi seviyorum";
        String line= cumle(reverseString);
        System.out.println("line = " + line);
        
        
    
    }


    public static String cumle(String reverseString) {

        String bosluk = " ";
        for (int i = reverseString.length() - 1; i >= 0; i--) {
            bosluk = bosluk + reverseString.charAt(i);


        }

        return bosluk;
    }
}
