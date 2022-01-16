package StatePatternCircusLion;

public class LionFedState implements State{

    Lion lion;
    LionFedState(Lion lion){
        this.lion = lion;
    }

    @Override
    public void feed() {
        System.out.println("The Lion refuses to eat.");
    }

    @Override
    public void command() {
        System.out.println("the Lion dances.");
        lion.setState(lion.getHungryState());
    }

    @Override
    public void whip() {
        System.out.println("RAWR!!");
    }
}
