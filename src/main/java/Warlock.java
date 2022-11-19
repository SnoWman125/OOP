public class Warlock extends Person{

    public Warlock() {
        super(String.format("Dimon"),30, 17, 12, 0, new int[]{-5, 0}, 9);
        super.magic = true;
    }

    @Override
    public String printInfo() {
        return String.format("%s magic: %b", super.printInfo(), super.magic);
    }
}
