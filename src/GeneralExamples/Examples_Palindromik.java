package GeneralExamples;

import java.util.Scanner;

public class Examples_Palindromik {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Check Palindromik:  ");
        int number =scanner.nextInt();

        if(number <10){rakam(number);}
        else{


            String x=String.valueOf(number);

            String y="";

            for (int i = x.length()-1; i >=0 ; i--) {


                y= y+ x.charAt(i);
            }

            if(y.equals(x)){
                System.out.println(x+"- Palindromik.");
            }
            else{
                System.out.println(x+"- Non Palindromik.");
            }

        }


    }
    public static void rakam(int a){
        System.out.println(a+"- Digist are always Palindromik!! ");
    }
}
