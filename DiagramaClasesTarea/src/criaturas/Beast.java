package criaturas;
public class Beast extends Creature {
    private static final String DEFAULT_ROAR = "Rugido";

    public Beast(String name) {
        super(name, 120, 30, 20);
    }

    public static String getDefaultRoar() {
        return DEFAULT_ROAR;
    }

    @Override
    public void attack(Creature target) {
        System.out.println(name + " embiste y lanza un " + DEFAULT_ROAR + " a " + target.getName() + "!");
        int damage = atk;
        target.takeDamage(damage);
        System.out.println(target.getName() + " recibe " + damage + " puntos de daño.");
    }
}
