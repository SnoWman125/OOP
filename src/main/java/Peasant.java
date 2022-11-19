public class Peasant extends Person{

    public Peasant() {
        super(String.format("Farmer"), 1,1, 1, 0, new int[]{1, 2}, 3);
        super.delivery = true;
    }

    @Override // переопределение родительского класса printInfo
    public String printInfo() {
        return String.format("%s delivery: %b", super.printInfo(), super.delivery);
    }

    @Override //переопределение родительского класса
    public String getHealth() {
        return String.format("%s#%d %s delivery: %b", super.getClass().getSimpleName(), ++Person.number,  this.name, this.delivery);
    }
}
