package Gun31Enum._01_Konu.Enum;

public class Ornek1 {
    public static void main(String[] args) {
        //verilen bir ay nosuna göre ayın kaç gün sürdüğünü yazınız;

        int AyNo = 5;

        switch (AyNo) {
            case 2:
                System.out.println(28);
                break;
            case 1:// ocak
            case 3:// mart
            case 5://mayıs
            case 22:
            case 10:
            case 12:
                System.out.println(31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
        }

        //okunabilirlik ve kontrollü yazılım yok,tanımla yetersiz
        //numaradn gitmeye çalıştık,zorulukla karsılastık
        //bunun yerıne ısımden gıtmeye calısalım

        String AyAd="Mayıs";
        switch (AyAd){
            case "şubat":
                System.out.println(28);break;
            case "Ocak":
            case "MarT":
            case "agustos":
            case "haziran":
            case "aralık":
                System.out.println(31);break;
            case"temmuz":
            case"eylül":
            case"Ekim":
            case"KASIM":
                System.out.println(30);break;







        }



    }
}
