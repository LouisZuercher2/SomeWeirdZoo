package Zoo;

import AdaptorPatternBirds.Duck;
import AdaptorPatternBirds.TurkeyAdapter;
import AdaptorPatternBirds.WildTurkey;
import CommandPatternAnimalFeeder.*;
import CompositePatternCafeteria.Menu;
import CompositePatternCafeteria.MenuComponent;
import CompositePatternCafeteria.MenuItem;
import ObserverPatternNewsletter.SubList;
import ObserverPatternNewsletter.Subscriber;
import ObserverPatternNewsletter.ZooNews;
import SingletonPatternRhino.Rhino;
import StatePatternCircusLion.Lion;
import TrategyPatternFrogs.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Adapter pattern -------------");
        //TurkeyAdapter
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        turkeyAdapter.fly();
        turkeyAdapter.quack();
        System.out.println("singleton pattern------------------");
        //Singleton
        Rhino rhino = Rhino.getWhiteRhino("Bobby");
        String s = rhino.getName();

        Rhino rhino1 = Rhino.getWhiteRhino("Hans");
        String t = rhino.getName();

        System.out.println(s);
        System.out.println(t);
        System.out.println("observer pattern-----------------");
        //Observer pattern
        Subscriber hans = new Subscriber("Hans");
        Subscriber tom = new Subscriber("Tom");
        Subscriber jerry = new Subscriber("Jerry");

        SubList subs = new SubList();
        subs.registerSubscriber(hans);
        subs.registerSubscriber(tom);
        subs.registerSubscriber(jerry);

        subs.update();
        System.out.println("command pattern------------");
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
        System.out.println("state pattern----------------");
        //state pattern
        Lion lion = new Lion();
        lion.command();
        lion.feed();
        lion.command();
        lion.whip();

        System.out.println("composite pattern-------------");
        //somewhat composite pattern (only 1 branch deep due to laziness)
        Menu zooCafeteria = new Menu();
        MenuItem spaghett = new MenuItem(1, "Spaghetti");
        MenuItem penguin = new MenuItem(2, "Pinguin drumsticks");
        zooCafeteria.addComponent(spaghett);
        zooCafeteria.addComponent(penguin);
        zooCafeteria.getChild();
        System.out.println(penguin.getPrice());;


        System.out.println("strategy pattern---------------");
        //Strategy Pattern
        Jump j = new Jump();
        Ribbit ribbit = new Ribbit();
        NoJump cripple = new NoJump();
        Mute mute = new Mute();

        Frog frog = new Frog(ribbit, j);
        Frog muteCripple = new Frog(mute, cripple);
        frog.perform();
        muteCripple.perform();
        muteCripple.setCallBehavior(ribbit);
        muteCripple.perform();
    }
}
