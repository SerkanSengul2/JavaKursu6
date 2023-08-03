package Gun27._02ornek;

public class MyMath {

    public static int GetMax(int a, int b) {

        return (a > b ? a : b);
    }

    public static int GetMin(int a, int b) {
        return (a > b ? a : b);
    }

    public static double GetPow(int a,int b){
        return Math.pow(a,b);
    }

    public static double Getsqrt(int a){
        return Math.sqrt(a);
    }

public static int Getrandom(int sinir){

        return (int)(Math.random()*sinir);
}

}



