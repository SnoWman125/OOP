import java.util.ArrayList;
import java.util.List;

public class Lesson1 {

    public static void main(String[] args) {

        List<Person> darkSide = new ArrayList<>();
        List<Person> whiteSide = new ArrayList<>();


        Archer archer = new Archer();
        Peasant peasant = new Peasant();
        Monk monk = new Monk();
        Rogue rogue = new Rogue();
        Sniper sniper = new Sniper();
        Spearman spearman = new Spearman();
        Warlock warlock = new Warlock();


        archer.printInfo();
        peasant.printInfo();
        monk.printInfo();
        rogue.printInfo();
        sniper.printInfo();
        spearman.printInfo();
        warlock.printInfo();

    }
}
