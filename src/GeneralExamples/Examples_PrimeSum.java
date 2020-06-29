package GeneralExamples;

public class Examples_PrimeSum {
    public static void main(String[] args) {

        int check = 2 ;
        int sum = 0 ;
        int sum2 =0;

        while(check <=50)
        {

            for(int i = 2; i< check; i++ )
            {
                if(check %i==0)
                {
                    sum = sum +1 ;
                }
            }

            if(sum == 0 )
            {
                sum2 += check;
                System.out.println(check);
            }
            sum = 0 ;
            check = check +1 ;
        }
        System.out.println("Sum of Prime : "+ sum2);
    }
}
