package ArraysExamples;

import java.util.Arrays;
import java.util.Random;

public class Examples_Order {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random= new Random();

        for (int i = 0; i < arr.length ; i++) {
            int x= random.nextInt(100);
            arr[i]=x;
        }
        Arrays.sort(arr);

        for (int i = arr.length-1; i >=0 ; i--) {
            int x=1;
            System.out.println(x+". "+ arr[i]);

            x++;
        }
    }
}
