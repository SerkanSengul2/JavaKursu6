package Gun36._04_Interface;

import Gun36._03_Interface.ICizdirir;

public class A4 implements ICizdirir,IGosterir {


    @Override
    public void ciz() {
        System.out.println("çizdi");
    }

    @Override
    public void goster() {
        System.out.println("gösterdi");
    }
}

