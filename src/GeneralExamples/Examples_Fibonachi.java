package GeneralExamples;



public class Examples_Fibonachi {

        //1-1-2-3-5-8-13-21
        public static void main(String[] args) {


            int x=1;

            int y=1;

            int z=0;

            for (int i = 0; i <10 ; i++) {
                z=x+y;
                System.out.print(z+"-");
                x=y+z;
                System.out.print(x+"-");
                y=z+x;
                System.out.print(y+"-");

            }

        }
}
