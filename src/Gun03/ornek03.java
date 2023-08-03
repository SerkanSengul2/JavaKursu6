package Gun03;

public class ornek03 {
    public static void main(String[] args) {

//kişinin kilosunu ve boyunu kendınız verınız.
// ekrana kilonu ve boyunuz yazdırınız
//vucut kıtle ındeksini bulunu kılo/ boy*boy

        double kg = 79.2;
        double boy = 1.75;
        double kitleIndex = kg / (boy * boy);
        if (kitleIndex > 26) {
            System.out.println("gıdılısın");
        } else System.out.println("taş gibisin");

        //System.out.println("kilonuz="+kg+" ,boyunuz="+boy);
        //System.out.println("kitleIndex = " + kitleIndex);


    }




}
