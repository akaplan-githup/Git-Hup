package GeneralExamples;

public class Examples_PrimeNumber {
    public static void main(String[] args) {

        int x=0;
        for(int i=10;i<=40;i++){

            if(i%3==0 || i%5==0){
                x+=i;
            }
        }
        System.out.println(x);
        System.out.println();
    }
}
