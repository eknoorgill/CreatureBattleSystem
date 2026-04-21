public class AgilityType extends Creature {

    // AgilityType deals less damage but misses less often.
    @Override
    public float attack() {

        // 15% chance of missing
        if (Rand.randomInt(0, 100) < 15) {
            action = name + " missed!";
            return 0;
        }

        // deal less damage between 10-15
        float power = Rand.randomFloat(10, 15);
        action = name + " attacked with power " + power + "!";
        return power;
    }

    // AgilityType has a 30% chance to fully dodge an attack
    @Override
    public void defend(float incomingPower) {

        if (Rand.randomInt(0, 10) < 3) {
            action = name + " dodged the attack!";
            // take no damage
        } else {
            action = name + " did not defend.";
            health -= incomingPower;
        }
    }
}
