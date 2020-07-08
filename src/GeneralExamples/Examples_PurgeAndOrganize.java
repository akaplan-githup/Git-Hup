package GeneralExamples;

import java.util.Scanner;

public class Examples_PurgeAndOrganize {
    //Given an array of integers, write a method that returns an array that...
    //
    //Has all duplicate elements removed.
    //Is sorted from least value to greatest value.

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        String x= scanner.nextLine();

        if(x.equals("circle")) formula(scanner.nextInt());
        if(x.equals("triangle")) formula(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
        if(x.equals("rectangle")) formula(scanner.nextInt(),scanner.nextInt());




    }

    public  static void  formula(int a,int b,int c){

        System.out.println((a*b)/2);

    }
    public static  void formula(int a,int b){
        System.out.println(a*b);

    }
    public static  void formula(int a){

        System.out.println((3.15)*a*a);
    }
}
