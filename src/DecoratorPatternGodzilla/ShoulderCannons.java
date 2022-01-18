package DecoratorPatternGodzilla;

public class ShoulderCannons implements Godzilla{

    Godzilla godzilla;

    public ShoulderCannons(Godzilla godzilla){
        this.godzilla = godzilla;
    }
    @Override
    public int attackPower() {
        return 5 + godzilla.attackPower();
    }
}
