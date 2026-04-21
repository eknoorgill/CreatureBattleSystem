public class TankType extends Creature {

    // TankType attacks normally
    @Override
    public float attack() {

        // 20% chance of missing
        if (Rand.randomInt(0, 10) < 2) {
            action = name + " missed!";
            return 0;
        }

        // deal normal damage between 15-20
        float power = Rand.randomFloat(15, 20);
        action = name + " attacked with power " + power + "!";
        return power;
    }

    // TankType has a 30% chance to cut incoming damage in half
    @Override
    public void defend(float incomingPower) {

        if (Rand.randomInt(0, 10) < 3) {
            incomingPower = incomingPower * 0.5f;
            action = name + " blocked and reduced damage to " + incomingPower + "!";
        } else {
            action = name + " did not defend.";
        }

        health -= incomingPower;
    }
}
