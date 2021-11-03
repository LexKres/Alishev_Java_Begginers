public class Multidimentional_arrays {
    public static void main(String[] args) {
        int[][] matrice = {{1,2,3}, {4,5,6}, {7,8,9}};

        System.out.println(matrice[2][1]); // 8
        System.out.println(matrice[1][0]); // 4

        int[][] matrice2 = {{1,2,3,4,5}, {6}, {7,8}};
        System.out.println(matrice2[0][4]); // 5

        String[][] strings = new String[2][3];
        strings[1][2] = "hi";
        System.out.println(strings[1][2]);

        System.out.println("Вывод массива matrice2");
        for (int i=0; i < matrice2.length; i++) {
            for (int j=0; j < matrice2[i].length; j++) {
                System.out.print(matrice2[i][j] + " ");
            }
            System.out.println();
        }


    }
}
