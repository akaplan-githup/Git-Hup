package ArraysExamples;

import java.util.Random;

public class Examples_RandomSum {
    public static void main(String[] args) {
        Random random= new Random();

        int [][] table= new int[10][10];
        int [] sum= new int[10];
        int [] sum1= new int[10];
        int x=0;

        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j <10 ; j++) {
                int rdm=random.nextInt(100);
                table[i][j]=rdm;
            }
        }

        for (int i = 0; i <10 ; i++) {

            for (int j = 0; j <10 ; j++) {
                x+=table[i][j];

            }
            sum[i]=x;
            x=0;
        }
        for (int i = 0; i <10 ; i++) {

            for (int j = 0; j <10 ; j++) {
                x+=table[j][i];

            }
            sum1[i]=x;
            x=0;
        }

        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j <10 ; j++) {

                System.out.print(table[i][j]+"\t");
            }
            System.out.print("| "+sum[i]);
            System.out.println();
        }
        System.out.println("*****************************************");
        for (int i = 0; i <10 ; i++) {

            System.out.print(sum1[i]+"\t");
        }



    }
}
