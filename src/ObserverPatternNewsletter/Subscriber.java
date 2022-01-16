package ObserverPatternNewsletter;

public class Subscriber implements Observer {
    String name;

    public Subscriber(String name){
        this.name = name;
    }
    public void call(){
        System.out.println(name + ": I have been updated!");
        System.out.println(ZooNews.getNews());
    }
}
