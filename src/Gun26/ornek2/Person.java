package Gun26.ornek2;

public class Person {

    String name;
    String surname;
    int age;

    int birthday;

    //field,properties,özellik
    public void BilgiYazdir() {
        System.out.println("Adı: " + this.name);
        System.out.println("Soyadı: " + this.surname);
        System.out.println("Yaşı: " + this.age);
    }

    //yazdırılırken otomatık cagırıyor
    public String toString()
    {
        return this.name + "\t" + this.surname + "\t" + this .age;

    }

    public void GetBirthDay() {
        System.out.println("Doğum yılı=" + (2023 - this.age));
    }

}
