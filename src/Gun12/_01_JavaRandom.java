package Gun12;

public class _01_JavaRandom {
    public static void main(String[] args) {

double randSayi=Math.random();//0-0.9999999
        System.out.println("randSayi = " + randSayi);
        
        //0-0.999999
        //10 la çarparsam
        //0-9.9999
        //(int) 0-9
        int rndTamsayi=(int)(randSayi*10);
        System.out.println("rndTamsayi = " + rndTamsayi);
        
        

    }



}
