package GeneralExamples;

import java.util.Scanner;

public class Examples_GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("First Exam : ");
        double note1= scanner.nextInt();

        System.out.print("Final Exam : ");
        double note2= scanner.nextInt();

        System.out.print("Semester Project : ");
        double note3= scanner.nextInt();

        double note11=note1*0.35;
        double note22=note2*0.50;
        double note33=note3*0.15;

        double sum = note11+note33+note22;


        if(sum >=90) System.out.println("AA");
        else if(sum >=80) System.out.println("BA");
        else if(sum >=70) System.out.println("BB");
        else if(sum >=50) System.out.println("CB");
        else if(sum >=45) System.out.println("CC");
        else if(sum >=40) System.out.println("DC");
        else System.out.println("FF");

        System.out.println(sum);
    }
}
