package GeneralExamples;

import java.util.Scanner;
/*
Create a function that takes two numbers as arguments (num, length) and returns an array of multiples of num up to length.
 */

public class Examples_ArrayofMultiples {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);



        int x=scanner.nextInt();
        int[] arr= new int[x];

        int i;
        for(i=0;i<x;i++){

            arr[i]=(i+1)*x;


            System.out.println(arr[i]);
        }


    }
}
