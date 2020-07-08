package GeneralExamples;

import java.util.Random;

public class Examples_TriangleWithAlph {
    public static void main(String[] args) {
        String x="qwertyuiopasdfghjklzxcvbnm";
        Random random=new Random();
        int rndm=random.nextInt(x.length());

        for (int i = 0; i <10 ; i++) {
            for (int j = 10; j >=i ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <i ; j++) {
                System.out.print(x.charAt(rndm));
            }
            for (int j = 1; j <i ; j++) {
                System.out.print(x.charAt(rndm));
            }
            System.out.println();
        }

    }
}
