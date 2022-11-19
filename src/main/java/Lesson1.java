import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lesson1 {

    public static void main(String[] args) {

        List<Person> darkSide = new ArrayList<>();
        List<Person> whiteSide = new ArrayList<>();


        darkSide.add(new Archer());
        darkSide.add(new Monk());
        darkSide.add(new Rogue());
        darkSide.add(new Peasant());
        Random rnd = new Random();
        for(int i=0; i < 4; i++){
            switch (rnd.nextInt(4)){
                case 0:
                    darkSide.add(new Archer());
                case 1:
                    darkSide.add(new Monk());
                case 2:
                    darkSide.add(new Rogue());
                default:
                    darkSide.add(new Peasant());
            }
        }

        whiteSide.add(new Sniper());
        whiteSide.add(new Spearman());
        whiteSide.add(new Warlock());
        whiteSide.add(new Peasant());
        for(int i = 0; i < 4; i++){
            switch (rnd.nextInt(4)){
                case 0:
                    whiteSide.add(new Sniper());
                case 1:
                    whiteSide.add(new Spearman());
                case 2:
                    whiteSide.add(new Warlock());
                default:
                    whiteSide.add(new Peasant());
            }
        }

        darkSide.forEach(n -> System.out.println(n.printInfo()));
        System.out.println();
        whiteSide.forEach(n -> System.out.println(n.printInfo()));
        System.out.println();
        darkSide.forEach(n -> System.out.println(n.getHealth()));






    }
}
