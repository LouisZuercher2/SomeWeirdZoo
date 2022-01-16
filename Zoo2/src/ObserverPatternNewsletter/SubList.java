package ObserverPatternNewsletter;

import java.util.LinkedList;

public class SubList implements Subject {
    private LinkedList<Subscriber> subscriberList;

    public SubList(){
        this.subscriberList = new LinkedList<Subscriber>();
    }

    public void registerSubscriber(Subscriber s){
        subscriberList.add(s);
    }
    public void removeSubscriber(Subscriber s){
        subscriberList.remove(s);
    }

    public void update(){
        for(Subscriber s : subscriberList){
            s.call();
        }
    }
}
