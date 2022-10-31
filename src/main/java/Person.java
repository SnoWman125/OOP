
public abstract class Person {
    protected int atk, def, shot;
    protected int[] damage;
    protected float health, speed;
    protected boolean delivery, magic;
    protected String name;

    protected static int number;

    static {
        number = 0;
    }


    public int getShot() {return shot;}
    public int getAtk() {return atk;}
    public int getDef() {return def;}
    public int[] getDamage() {return damage;}
    public float getHealth() {return health;}
    public float getSpeed() {return speed;}

    public int setShot(int shot) {
        if (shot < 0) return -1;
        if (shot > 36) return -2;
        this.shot = shot;
        return shot;
    }

    public Person(int atk, int def, int shot, int[] damage, float health, float speed, boolean delivery, boolean magic,
                  String name){
        this.atk = atk;
        this.shot = shot;
        this.def = def;
        this.damage = damage;
        this.health = health;
        this.speed = speed;
        this.delivery = delivery;
        this.magic = magic;
        this.name = name;
    }


    public void printInfo() {
        System.out.println("Name: " + name + "; Attack: " + atk + "; Health: " + health + "; Defence: " + def + "; Shot: " + shot);
    }

}
