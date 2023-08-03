package Gun04;

public class _07_ornek03 {
    public static void main(String[] args) {
   //String olarak verilen 3 notun ("82","95","56") ortalmasını bulunuz

   String not1="82";
   String not2="95";
   String not3="56";

   int intnot1=Integer.parseInt(not1);
   int Intnot2=Integer.parseInt(not2);
   int Intnot3=Integer.parseInt(not3);
   int toplamnot=intnot1+Intnot2+Intnot3;
        System.out.println("toplamnot = " + toplamnot);
        double ortalama=(double) toplamnot/3;
        System.out.println("ortalama = " + ortalama);






    }




}
