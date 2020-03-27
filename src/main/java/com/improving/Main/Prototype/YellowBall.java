package com.improving.Main.Prototype;

public class YellowBall extends Ball {

    public YellowBall() {
        color = "Yellow";
    }
    @Override
    public void bounce() {
        System.out.println("Yellow ball bounces.");
    }
}
