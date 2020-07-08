package GeneralExamples;

import java.util.Random;
import java.util.Scanner;

public class MonsterGame {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Random random= new Random();

        System.out.print("Hero's hit points : ");
        int hp=scanner.nextInt();
        System.out.print("Damage of the hero : ");
        int dmg=scanner.nextInt();
        System.out.print("Monster hit points : ");
        int hpm=scanner.nextInt();
        System.out.print("Damage of the monster : ");
        int dmgm=scanner.nextInt();

        boolean t=true;
        int count=1;

        while(t){
            System.out.println("\n****** Round "+count+" *********");

            int x=random.nextInt(dmg);
            hpm-=x;
            System.out.println("Hero damage: "+x);
            System.out.println("Monster hp: "+hpm);


            int x1=random.nextInt(dmgm);
            hp-=x1;
            System.out.println("Monster damage: "+x1);
            System.out.println("Hero hp: "+hp);

            count++;

            if (hp<=0||hpm<=0){
                System.out.println("Battle ends!!!");

                if (hp<=0){
                    System.out.println("Monster WON!!");
                }
                else if (hpm<=0){
                    System.out.println("Hero WON!!");
                }
                t=false;}

        }





    }
}
