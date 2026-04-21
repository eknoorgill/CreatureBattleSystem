import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Eknoor's Creature Battle System!");
        System.out.println();

        // get player creature info
        System.out.println("Enter your creature's name:");
        String playerName = scanner.nextLine();

        System.out.println("Choose your creature type:");
        System.out.println("1 - Attack (high damage)");
        System.out.println("2 - Agility (high dodge)");
        System.out.println("3 - Tank (high defense)");
        int playerChoice = scanner.nextInt();
        scanner.nextLine();

        System.out.println();

        // get enemy creature info
        System.out.println("Enter the enemy's name:");
        String enemyName = scanner.nextLine();

        System.out.println("Choose the enemy type:");
        System.out.println("1 - Attack (high damage)");
        System.out.println("2 - Agility (high dodge)");
        System.out.println("3 - Tank (high defense)");
        int enemyChoice = scanner.nextInt();

        System.out.println();

        // create the creatures based on the choices
        Creature player = createCreature(playerChoice, playerName);
        Creature enemy = createCreature(enemyChoice, enemyName);

        System.out.println("Battle start: " + player.name + " vs " + enemy.name + "!");
        System.out.println();

        // set up the battle
        BattleSystem battleSystem = new BattleSystem();

        // run the battle
        battleSystem.battle(player, enemy);

        scanner.close();
    }

    // creates and returns a creature based on the type number and name given
    public static Creature createCreature(int type, String name) {
        Creature creature;

        if (type == 1) {
            creature = new AttackType();
        } else if (type == 2) {
            creature = new AgilityType();
        } else {
            creature = new TankType();
        }

        creature.name = name;
        creature.health = 100;
        return creature;
    }
}
