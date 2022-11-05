public abstract class Person implements Actions {
    protected int atk, def, shot, health, speed;
    private int[] damage;
    protected String name;
    protected static int number;

    protected boolean delivery, magic;

    static {
        number = 0;
    }

    public Person(String name, int health, int atk, int def, int shot, int[] damage, int speed){
        this.name = name;
        this.health = health;
        this.atk = atk;
        this.shot = shot;
        this.def = def;
        this.damage = damage;
        this.speed = speed;
    }


    public String getName() {return name;}
    public int getAtk() {return atk;}
    public int getDef() {return def;}
    public int getShot() {return shot;}

    public int getSpeed() {return speed;}



    @Override
    public String printInfo() {
        return  String.format("%s#%d %s:: Health: %d Attack: %d Defence: %d Shot: %d Damage: %d -%d Speed: %d",
                this.getClass().getSimpleName(), ++Person.number, name, health, atk, def, shot, damage[0], damage[1], speed);

    }
    @Override
    public String getHealth() {
        return String.format("%s#%d %s:: Health: %d", this.getClass().getSimpleName(), ++Person.number, name, health);
    }

}
