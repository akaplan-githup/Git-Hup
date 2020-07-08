package GeneralExamples;

public class Examples_Swap {
    public static void main(String[] args) {

        String x="Ahmet";
        String y="Kaplan";

        x=x+y;


        y=x.substring(0,x.length()-y.length());


        x=x.substring(y.length());

        System.out.println(x);
        System.out.println(y);



    }
}
