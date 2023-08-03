package OdevMethodlar;

public class odev4 {
    public static void main(String[] args) {
        //Dize: Java yazın
        //dönüş şöyle olmalıdır:  yazın Java


        String cumle = "Java yazın";
        String degisencumle = reverseWord(cumle);
        System.out.println("degisencumle = " + degisencumle);
    }

    public static String reverseWord(String cumle) {
        String[] kelime = cumle.split(" ");
        String degisencumle = " ";
        for (int i = kelime.length - 1; i >= 0; i--) {
            degisencumle += kelime[i];
            if (i > 0)
                degisencumle += " ";
        }
        return degisencumle;


    }


}


