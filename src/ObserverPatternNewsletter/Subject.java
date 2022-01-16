package ObserverPatternNewsletter;

public interface Subject {
    void registerSubscriber(Subscriber s);
    void removeSubscriber(Subscriber s);
    void update();
}
