package GeneralExamples;

import java.util.Scanner;

public class Examples_SecretPassword {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);


        int [][] arr= new int[2][2];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j]=scanner.nextInt();
            }
        }

        for (int[] arr2 : arr ) {

            for (int arr3:arr2) {
                System.out.print("* ");
            }

            System.out.println();
        }




    }

}
