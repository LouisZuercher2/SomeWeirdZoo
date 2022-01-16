package TrategyPatternFrogs;

public class NoJump implements JumpBehavior{
    @Override
    public void jump() {
        System.out.println("no boing :(");
    }
}
