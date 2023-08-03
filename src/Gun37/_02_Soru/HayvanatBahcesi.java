package Gun37._02_Soru;

import java.util.ArrayList;

public class HayvanatBahcesi {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Duck duck1 = new Duck();
        Shark shark1 = new Shark();
        Swallow swallow1 = new Swallow();

        ArrayList<Animal> hayvanlar = new ArrayList<>();
        hayvanlar.add(cat1);
        hayvanlar.add(shark1);
        hayvanlar.add(swallow1);
        hayvanlar.add(duck1);
        for (Animal a : hayvanlar) {
            System.out.println("***************");
            System.out.println(a.getClass().getSimpleName());
            System.out.println("****************");

            if (a instanceof Swallow){
                System.out.println((swallow1).food());
                System.out.println((swallow1).ucar());
            }
            else if (a instanceof Shark) {
                System.out.println((shark1).food());
                System.out.println((shark1).yuzer());
            } else if (a instanceof Duck) {
                System.out.println((duck1).food());
                System.out.println((duck1).ucar());
                System.out.println((duck1).yuzer());
            } else {
                if (a instanceof Cat){
                    System.out.println((cat1).food());


                }

            }
        }


    }
}
