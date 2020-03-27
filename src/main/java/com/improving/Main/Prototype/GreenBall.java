package com.improving.Main.Prototype;

public class GreenBall extends Ball {

    public GreenBall(){
        color = "Green";
    }
    @Override
    public void bounce() {
        System.out.println("Green ball Bounces.");
    }
}
