package Gun31Enum.OrnekSoru;

import java.util.ArrayList;

public enum PizzaBoy {
    SMALL(150),
    MEDIUM(225),
    LARGE(295);
int fiyat;

    PizzaBoy(int fiyat) {
        this.fiyat = fiyat;
    }
}

// Bir pizza sipariş hattı yapılmak isteniyor.
// Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Goster
// seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
// bir ARRAYLIST e atınız.
// Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
// verdiğini bir metodda yazdırınız.
