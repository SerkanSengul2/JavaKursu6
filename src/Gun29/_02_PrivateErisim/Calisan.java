package Gun29._02_PrivateErisim;

public class Calisan {
    int id; //default
    String name;// default
    String surname;// default
    private String password;// default

    public void SifreAta(String sifre) {
        if (sifre.length() < 8)
            System.out.println("zayıf şifre");
        else
        {
            this.password = sifre;
        System.out.println("şifre başarıyla atandı");

    }
    }


    public void sifreGoster() {
        System.out.println("***"+this.password.substring(4));
    }


    }



