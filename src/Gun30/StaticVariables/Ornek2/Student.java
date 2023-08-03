package Gun30.StaticVariables.Ornek2;

public class Student {

    private int id = 1;//nesneye ait
    String FullName;//nesneye ait

    private static int sayac = 1;
    //sen bitanesin.
    // static olmadan herzaman 1 le başlıyordu
    // static olduğunda artık bir tane oladuğundan
    // değerini korudu ve hep 1 tane arttı
    // tüm nesnelere ait olan bilgileri veya
    // sayac gibi işlemler için static kullanılır.

    public Student(int id, String fullName) {
        this.id = id;
        FullName = fullName;
    }

    public Student(String fullName) {
        FullName = fullName;
        this.id = sayac++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", FullName='" + FullName + '\'' +
                '}';
    }
}

