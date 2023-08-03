package Gun30._02.FinalVariables.Ornek2.Soru2;

public class KimlerDinledi {
    int a;
    static int b = 0;

    void artir(){
        a++;
        b++;
    }


    public static void main(String[] args) {

        KimlerDinledi kd1 = new KimlerDinledi();
        kd1.a = 5;

        
        KimlerDinledi kd2 = new KimlerDinledi();
        kd2.a = 7;
       
       
        //1.soru a nın değeri şuan kaçtır?
        //burada her nesenin a sı var gs1 in 5,gs2 nin ise 7 degeri vardır
        System.out.println("kd1 = " + kd1.a);
        System.out.println("kd2.a = " + kd2.a);
        System.out.println("b = " + b);
        

        kd1.artir();
        kd2.artir();
        //a ve b nin değeri kaçtır
        
//        kd1.artir();//kd1.a>6 b>1
//        kd2.artir();//kd1 a>8 b>2
        System.out.println("kd1 = " + kd1.a);
        System.out.println("kd2 = " + kd2.a);
        System.out.println("b = " + b);
    }
}
