package com.improving.Main.Adapter;

public class WMVPlayer implements AdvancedVideoPlayer {
    @Override
    public void playMOV(String filename) {

    }

    @Override
    public void playWMV(String filename) {
        System.out.println("Playing WMV: " + filename);
    }
}
