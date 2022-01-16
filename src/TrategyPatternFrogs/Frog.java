package TrategyPatternFrogs;

public class Frog {
    public CallBehavior callBehavior;
    public JumpBehavior jumpBehavior;

    public Frog(CallBehavior c, JumpBehavior j){
        this.callBehavior = c;
        this.jumpBehavior = j;
    }
    public void perform(){
        callBehavior.call();
        jumpBehavior.jump();
    }

    public void setCallBehavior(CallBehavior c){
        this.callBehavior = c;
    }

    public void setJumpBehavior(JumpBehavior j){
        this.jumpBehavior = j;
    }
}
