package Gun31Enum.OrnekSoru;

public class Pizza {
   PizzaBoy pizzaboyut;

    public Pizza(PizzaBoy pizza) {
        this.pizzaboyut = pizza;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizza=" + pizzaboyut +
                '}';
    }
}
// TODO : Her pizza tipi için ücret belirleyerek toplam ücreti yazdırınız.