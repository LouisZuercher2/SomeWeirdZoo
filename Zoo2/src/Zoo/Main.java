package Zoo;

import AdaptorPatternBirds.Duck;
import AdaptorPatternBirds.TurkeyAdapter;
import AdaptorPatternBirds.WildTurkey;
import CommandPatternAnimalFeeder.*;
import ObserverPatternNewsletter.SubList;
import ObserverPatternNewsletter.Subscriber;
import ObserverPatternNewsletter.ZooNews;
import SingletonPatternRhino.Rhino;
import StatePatternCircusLion.Lion;

public class Main {

    public static void main(String[] args) {

        //TurkeyAdapter
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        turkeyAdapter.fly();
        turkeyAdapter.quack();

        //Singleton
        Rhino rhino = Rhino.getWhiteRhino("Bobby");
        String s = rhino.getName();

        Rhino rhino1 = Rhino.getWhiteRhino("Hans");
        String t = rhino.getName();

        System.out.println(s);
        System.out.println(t);

        //Observer pattern
        Subscriber hans = new Subscriber("Hans");
        Subscriber tom = new Subscriber("Tom");
        Subscriber jerry = new Subscriber("Jerry");

        SubList subs = new SubList();
        subs.registerSubscriber(hans);
        subs.registerSubscriber(tom);
        subs.registerSubscriber(jerry);

        subs.update();

        //Command Pattern
        Remote remote = new Remote();
        BirdFeeder birdFeeder = new BirdFeeder();
        GeckoFeeder geckoFeeder = new GeckoFeeder();
        SoothingAmbientMusicOFF soothingAmbientMusicOFF = new SoothingAmbientMusicOFF();
        SoothingAmbientMusicON soothingAmbientMusicON = new SoothingAmbientMusicON();

        remote.setOnCommand(1, birdFeeder);
        remote.setOnCommand(2, geckoFeeder);
        remote.setOnCommand(3, soothingAmbientMusicON);
        remote.setOffCommand(3, soothingAmbientMusicOFF);

        remote.pressOnCommand(1);
        remote.pressOnCommand(2);
        remote.pressOnCommand(3);

        remote.pressOffCommand(3);
        remote.pressOffCommand(4);

        //state pattern
        Lion lion = new Lion();
        lion.command();
        lion.feed();
        lion.command();
        lion.whip();
    }
}
