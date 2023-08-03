package GUN09;

import java.util.Scanner;

public class orneksoru6 {
    public static void main(String[] args) {
        //girilen bir cümlede a harfinin geçip geçmediğini
        //bulunuz geçiyor ise evet geçmiyor ise hayır yazdırınız

        Scanner oku = new Scanner(System.in);
        System.out.print("cümle oku=");
        String kelime = oku.nextLine();
        boolean varmi = kelime.contains("a");
        if (varmi == true) {
            System.out.println("evet");
        }
        if (varmi == false) {
            System.out.println("hayır");

            //2. yol
            if (kelime.contains("a")) {
                System.out.println("evet");
            }
            if (!kelime.contains("a")) {
                System.out.println("hayr");
            }


        }


    }


}
