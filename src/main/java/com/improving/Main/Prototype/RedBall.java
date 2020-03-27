package com.improving.Main.Prototype;

public class RedBall extends Ball {

    public RedBall() {
        color = "Red";
    }
    @Override
    public void bounce() {
        System.out.println("Red ball bounces.");
    }
}
