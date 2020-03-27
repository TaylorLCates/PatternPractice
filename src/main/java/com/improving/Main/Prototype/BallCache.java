package com.improving.Main.Prototype;

import java.util.Hashtable;

public class BallCache {

    private static Hashtable<String, Ball> ballHashtable = new Hashtable<>();

    public static Ball getBall(String ballId) {
        Ball cachedBall = ballHashtable.get(ballId);
        return (Ball) cachedBall.clone();
    }

    public static void loadCache() {
        GreenBall greenBall = new GreenBall();
        greenBall.setId("1");
        ballHashtable.put(greenBall.getId(), greenBall);

        RedBall redBall = new RedBall();
        redBall.setId("2");
        ballHashtable.put(redBall.getId(), redBall);

        YellowBall yellowBall = new YellowBall();
        yellowBall.setId("3");
        ballHashtable.put(yellowBall.getId(), yellowBall);
    }
}
