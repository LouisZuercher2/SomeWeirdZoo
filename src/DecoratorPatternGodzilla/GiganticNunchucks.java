package DecoratorPatternGodzilla;

public class GiganticNunchucks implements Godzilla{

    Godzilla godzilla;

    public GiganticNunchucks(Godzilla godzilla){
        this.godzilla = godzilla;
    }
    @Override
    public int attackPower() {
        return 200 + godzilla.attackPower();
    }
}
