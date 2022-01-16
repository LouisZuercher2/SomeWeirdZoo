package TrategyPatternFrogs;

public class Mute implements CallBehavior{
    @Override
    public void call() {
        System.out.println("......");
    }
}
