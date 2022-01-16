package StatePatternCircusLion;

public class LionHungryState implements State{
    Lion lion;
    public LionHungryState(Lion lion){
        this.lion = lion;
    }

    @Override
    public void feed() {
        System.out.println("nom nom nom!");
        lion.setState(lion.getFedState());
    }

    @Override
    public void command() {
        System.out.println("lion refuses to dance.");
    }

    @Override
    public void whip() {
        System.out.println("the lion keeper was eaten.");
    }
}
