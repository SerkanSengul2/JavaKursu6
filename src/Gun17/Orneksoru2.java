package Gun17;

import java.util.Scanner;

public class Orneksoru2 {
    public static void main(String[] args) {
// Kullanıcının gireceği bir cumlede kaç kelime olduğunu bulunuz
        // for döngüsü ile yapalım
        // Bu gun hava cok guzel -> 5

        Scanner oku = new Scanner(System.in);
        System.out.print("cümle= ");
        String cumle = oku.nextLine();
        int kelime = 0;
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i)==' ')
                kelime++;
        }

        System.out.println("kelime = " + kelime);
    }


}
