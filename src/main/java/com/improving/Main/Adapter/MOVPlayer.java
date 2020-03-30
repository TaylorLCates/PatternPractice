package com.improving.Main.Adapter;

public class MOVPlayer implements AdvancedVideoPlayer {
    @Override
    public void playMOV(String filename) {
        System.out.println("Playing MOV: " + filename);
    }

    @Override
    public void playWMV(String filename) {

    }
}
