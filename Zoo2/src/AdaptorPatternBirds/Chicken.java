package AdaptorPatternBirds;

public class Chicken implements Duck {
    public void fly(){
        System.out.println("flap flap!");
    }
    public void quack(){
        System.out.println("kikerikii!!");
    }
}
