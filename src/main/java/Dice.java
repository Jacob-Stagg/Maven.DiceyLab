import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    Dice dice;
    Integer toss;
    Integer rollAmount;

    public Dice(int numberOfRolls) {
        this.dice = new Dice(numberOfRolls);
        this.toss = dice.tossAndSum();
        this.rollAmount = numberOfRolls;
    }

    private Integer tossAndSum() {
        Integer value = null;

        for (int i = 0; i < rollAmount; i++) {
            value += throwValue();
        }

        return value;
    }

    public int throwValue() {
        return ThreadLocalRandom.current().nextInt(1, 6);
    }

    public Dice getDice() {
        return dice;
    }

    public void setDice(Dice dice) {
        this.dice = dice;
    }

    public Integer getToss() {
        return toss;
    }

    public void setToss(Integer toss) {
        this.toss = toss;
    }

    public Integer getRollAmount() {
        return rollAmount;
    }

    public void setRollAmount(Integer rollAmount) {
        this.rollAmount = rollAmount;
    }
}
