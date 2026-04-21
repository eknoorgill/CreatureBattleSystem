public class AttackType extends Creature {

    // AttackType deals more damage but misses more often.
    @Override
    public float attack() {

        // 25% chance of missing
        if (Rand.randomInt(0, 100) < 25) {
            action = name + " missed!";
            return 0;
        }

        // deal higher damage between 20-25
        float power = Rand.randomFloat(20, 25);
        action = name + " attacked with power " + power + "!";
        return power;
    }

    // AttackType has no special defense
    @Override
    public void defend(float incomingPower) {
        action = name + " did not defend.";
        health -= incomingPower;
    }
}
