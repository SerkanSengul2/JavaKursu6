package Gun19;

public class Orneksoru2 {
    public static void main(String[] args) {

        int[][] tablo = new int[2][3];

        int[][] tablo2 = {{4, 2, 5}//0.satir 2sütün
                        ,{2, 6, 2, 3}//1.satir 4sütün
                        ,{5, 2, 3, 66, 7, 2,},//2.satir 6sütün
                         {2} //3.satir 1.sütün
        };

        for (int i = 0; i <tablo2.length ; i++) {
            for (int j = 0; j <tablo2[i].length ; j++) {
                System.out.print(tablo2[i][j]+" ");

            }
            System.out.println();
        }

    }
}
