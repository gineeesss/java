import criaturas.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Creature[] creatures = new Creature[10];
        for (int i = 0; i < creatures.length; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(3); // Genera un número aleatorio entre 0 y 2

            switch (randomNumber) {
                case 0:
                    creatures[i] = new Warrior("Guerrero" + i);
                    break;
                case 1:
                    creatures[i] = new Mage("Mago" + i);
                    break;
                case 2:
                    creatures[i] = new Beast("Bestia" + i);
                    break;
            }
        }
        // Simulación de la batalla
        System.out.println("Comienza la batalla!");
        Random random = new Random();
        Creature attacker = creatures[random.nextInt(10)];
        Creature defender = creatures[random.nextInt(10)];

        while (attacker.isAlive() && defender.isAlive()) {
            attacker.attack(defender);
            // Intercambiar roles de atacante y defensor
            Creature temp = attacker;
            attacker = defender;
            defender = temp;
        }

        // Determinar el ganador
        if (attacker.isAlive()) {
            System.out.println(attacker.getName() + " ha ganado la batalla!");
        } else {
            System.out.println(defender.getName() + " ha ganado la batalla!");
        }
    }
}