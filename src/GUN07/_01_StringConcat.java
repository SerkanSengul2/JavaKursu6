package GUN07;

public class _01_StringConcat {
    public static void main(String[] args) {
//concat : bir string diğerini birleştirme

        String s1 = "merhaba";
        String s2 = "dünya";

        System.out.println("birleşik hali= "+s1+s2);
        System.out.println("birleşik hali= "+s1.concat(s2));
        System.out.println("birleşik hali= "+s1.concat(" ").concat(s2));
        System.out.println("birleşik hali= "+s1.concat(" "+s2));
        

        
        


    }


}
