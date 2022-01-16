package CommandPatternAnimalFeeder;

public class NoCommand implements Command{
    public void execute(){
        System.out.println("no Command set");
    }
}
