package Gun37._01_Soru;

import Gun35._01_Final.method.Araclar;

import java.util.ArrayList;

public class FabrikaMain {
    public static void main(String[] args) {
        TeslaCar tesla = new TeslaCar("model 5", 310.0);
        ToyotaPrus pirus = new ToyotaPrus("sedan", 1200);
        Bus bus = new Bus("Iveco", 700);

        ArrayList<Vecihle> arabalar = new ArrayList<>();
        arabalar.add(tesla);
        arabalar.add(pirus);
        arabalar.add(bus);
        for (Vecihle v : arabalar) {
            System.out.println("**************************");
            System.out.println(v.getClass().getSimpleName());
            System.out.println("***************************");
            System.out.println(v.getEngine());
            System.out.println(v.getModel());


            if (v instanceof TeslaCar) {
                System.out.println(((TeslaCar) v).drive());
                System.out.println(((TeslaCar) v).ChangeBattery());
            } else if (v instanceof ToyotaPrus) {
                System.out.println(((ToyotaPrus) v).drive());
                System.out.println(((ToyotaPrus) v).ChangeBattery());
                System.out.println(((ToyotaPrus) v).Changeoil());
            } else {
                System.out.println(((Bus) v).drive());
                System.out.println(((Bus) v).ChangeDiesel());
            }


        }


    }
}
