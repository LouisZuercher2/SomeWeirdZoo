package CommandPatternAnimalFeeder;

import java.util.LinkedList;

public class Remote {
    Command[] onSlots;
    Command[] offSlots;

    public Remote(){

        this.offSlots = new Command[10];
        this.onSlots = new Command[10];
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++){
            onSlots[i] = noCommand;
            offSlots[i] = noCommand;
        }
    }

    public void setOnCommand(int i, Command c){
        onSlots[i] = c;
    }

    public void setOffCommand(int i, Command c){
        offSlots[i] = c;
    }

    public void pressOnCommand(int i){
        onSlots[i].execute();
    }

    public void pressOffCommand(int i){
        offSlots[i].execute();
    }

}
