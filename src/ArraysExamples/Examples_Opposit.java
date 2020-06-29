package ArraysExamples;

import java.util.Random;

public class Examples_Opposit {
    public static void main(String[] args) {
        Random random= new Random();
        int[] arr= new int[5];



        for (int i = 0; i <arr.length ; i++) {
            int x= random.nextInt(2);
            arr[i]=x;
        }
        int[] arr2= new int[arr.length];
        int x=0;
        for (int i = arr.length-1; i >=0 ; i--) {
            arr2[i]=arr[x];
            x++;
        }
        if (arr.equals(arr2)){
            for (int i = 0; i <arr.length ; i++) {
                System.out.println(arr[i]);
            }
            System.out.println("yes");
        }
        else{
            System.out.println("no");
            for (int i = 0; i <arr.length ; i++) {
                System.out.println(arr[i]);
            }
        }

    }
}
