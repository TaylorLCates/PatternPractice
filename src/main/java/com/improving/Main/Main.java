package com.improving.Main;

import com.improving.Main.Adapter.MediaPlayer;
import com.improving.Main.Facade.AnimalFacade;
import com.improving.Main.FactoryAndNull.Greeting;
import com.improving.Main.FactoryAndNull.GreetingFactory;
import com.improving.Main.Builder.*;
import com.improving.Main.Prototype.Ball;
import com.improving.Main.Prototype.BallCache;
import com.improving.Main.Singleton.SingleObject;
import com.improving.Main.Strategy.OperationAdd;
import com.improving.Main.Strategy.OperationDivide;
import com.improving.Main.Strategy.OperationSubtract;
import com.improving.Main.Strategy.StrategyContext;

public class Main {

    public static void main(String[] args) {
        //Builder
        Car car = new Car.CarBuilder("Honda", "Fit", 2020)
                .allWheelDrive(true)
                .milesPerGallon(30)
                .build();

        System.out.println(car.toString());

        //Singleton
        SingleObject object = SingleObject.getInstance();

        object.showMessage();

        //Factory and Null Object Pattern
        GreetingFactory greetingFactory = new GreetingFactory();

        Greeting hi = greetingFactory.getGreeting("Hi");
        Greeting hello = greetingFactory.getGreeting("Hello");
        Greeting whatsUp = greetingFactory.getGreeting("Whatsup");
        Greeting notAGreeting = greetingFactory.getGreeting("fojfoj");

        hi.greet();
        hello.greet();
        whatsUp.greet();
        notAGreeting.greet();

        //Strategy
        StrategyContext context = new StrategyContext(new OperationAdd());
        System.out.println(context.executeStrategy(5, 7));
        context = new StrategyContext(new OperationDivide());
        System.out.println(context.executeStrategy(10, 5));
        context = new StrategyContext(new OperationSubtract());
        System.out.println(context.executeStrategy(11, 4));

        //Prototype
        BallCache.loadCache();

        Ball clonedBall1 = (Ball) BallCache.getBall("1");
        Ball clonedBall2 = BallCache.getBall("2");
        Ball clonedBall3 = BallCache.getBall("3");

        clonedBall1.bounce();
        clonedBall2.bounce();
        clonedBall3.bounce();

        //Facade
        AnimalFacade animalFacade = new AnimalFacade();

        animalFacade.makeCatEat();
        animalFacade.makeDogEat();
        animalFacade.makeLizardEat();

        //Adapter
        MediaPlayer mediaPlayer = new MediaPlayer();

        mediaPlayer.play("MP4", "Titanic");
        mediaPlayer.play("WMV", "Good Will Hunting");
        mediaPlayer.play("MOV", "Sharknado");
        mediaPlayer.play("FLV", "Superman 18");
    }
}
