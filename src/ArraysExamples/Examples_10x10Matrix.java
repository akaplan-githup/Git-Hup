package ArraysExamples;

public class Examples_10x10Matrix {
    public static void main(String[] args) {
        int [][] table= new int[11][11];

        for (int i = 0; i <11 ; i++) {
            for (int j = 0; j <11 ; j++) {
                table[i][j]=i*j;
            }
        }
        for (int j = 1; j <11 ; j++) {
            System.out.print(table[1][j]+"\t");
        }
        System.out.println();
        for (int i = 0; i <10 ; i++) {
            System.out.print("---\t");
        }
        System.out.println();

        for (int i = 1; i <11 ; i++) {


            for (int j = 1; j <11 ; j++) {

                System.out.print(table[i][j] + "\t");
            }
            System.out.print("|"+"\n");


        }

        for (int i = 0; i <10 ; i++) {
            System.out.print("---\t");
        }


    }
}
