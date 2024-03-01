package criaturas;

public class Warrior extends Creature {
    private static final String DEFAULT_WEAPON = "Espada";

    public Warrior(String name) {
        super(name, 100, 20, 30);
    }

    public static String getDefaultWeapon() {
        return DEFAULT_WEAPON;
    }

    @Override
    public void attack(Creature target) {
        System.out.println(name + " ataca a " + target.getName() + " con su " + DEFAULT_WEAPON + "!");
        int damage = atk;
        target.takeDamage(damage);
        System.out.println(target.getName() + " recibe " + damage + " puntos de daño.");
    }
}