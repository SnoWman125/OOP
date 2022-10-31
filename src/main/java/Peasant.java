public class Peasant extends Person{

    public Peasant() {
        super(1, 1, 0, new int[]{1}, 1, 3, true, false, "Egor");
    }

    @Override // переопределение родительского класса printInfo
    public void printInfo() {
        System.out.println("Peasant, Health: " + health);
    }
}
