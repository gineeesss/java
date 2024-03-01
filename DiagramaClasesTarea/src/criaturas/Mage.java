package criaturas;

public class Mage extends Creature {
    private static final String DEFAULT_SPELL = "Fireball";

    public Mage(String name) {
        super(name, 80, 40, 10);
    }

    public static String getDefaultSpell() {
        return DEFAULT_SPELL;
    }

    @Override
    public void attack(Creature target) {
        System.out.println(name + " lanza un hechizo de " + DEFAULT_SPELL + " a " + target.getName() + "!");
        int damage = atk;
        target.takeDamage(damage);
        System.out.println(target.getName() + " recibe " + damage + " puntos de daño.");
    }
}