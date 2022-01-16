package StatePatternCircusLion;

public class Lion {
    private final State lionFedState;
    private final State lionHungryState;
    private State lion;

    public Lion(){
        this.lionFedState = new LionFedState(this);
        this.lionHungryState = new LionHungryState(this);
        lion = lionHungryState;
    }

    public void setState(State s){
        lion = s;
    }

    public State getFedState(){
        return lionFedState;
    }

    public State getHungryState(){
        return lionHungryState;
    }

    public void feed(){
        lion.feed();
    }

    public void command(){
        lion.command();
    }

    public void whip(){
        lion.whip();
    }
}
