package criaturas;

public abstract class Creature {
    protected String name;
    protected int hp;
    protected int atk;
    protected int def;

    public Creature(String name, int hp, int atk, int def) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
    }

    public abstract void attack(Creature target);

    public boolean isAlive() {
        return hp > 0;
    }

    public void takeDamage(int damage) {
        hp -= Math.max(damage - def, 0);
    }

    public String getName() {
        return name;
    }
}