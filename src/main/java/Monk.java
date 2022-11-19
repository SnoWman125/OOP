public class Monk extends Person{

    public Monk() {
        super(String.format("Sergey"), 30, 12, 7, 0, new int[]{-4, 0}, 5);
        super.magic = true;
    }

    @Override
    public String printInfo() {
        return String.format("%s magic: %b", super.printInfo(), super.magic);
    }
}
