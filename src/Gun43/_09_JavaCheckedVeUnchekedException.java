package Gun43;

public class _09_JavaCheckedVeUnchekedException {
    public static void main(String[] args) {
        String kelime = "";

        char ilkharf = kelime.charAt(0);
//zorunlu degıl unchecked exception


        try { //cheked exception

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        bekle();
        //cheked exception

    }

    public static void bekle() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
