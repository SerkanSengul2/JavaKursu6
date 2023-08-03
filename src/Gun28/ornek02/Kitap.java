package Gun28.ornek02;

public class Kitap {

    String name;
    int PublishYear;
    String author;

    public Kitap(){

    }

    public Kitap(String name, int PublishYear, String author) {
        this.name = name;
        this.PublishYear = PublishYear;
        this.author = author;
    }

    public Kitap(String name, int PublishYear) {
        this(name, PublishYear, "");
    }

    public String toString() {

        return this.name + this.author + this.PublishYear;


    }
}
