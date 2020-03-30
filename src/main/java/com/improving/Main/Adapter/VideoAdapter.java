package com.improving.Main.Adapter;

public class VideoAdapter implements VideoPlayer {

    AdvancedVideoPlayer advancedVideoPlayer;

    public VideoAdapter(String videoType) {
        if (videoType.equalsIgnoreCase("MOV")) {
            advancedVideoPlayer = new MOVPlayer();
        }
        if (videoType.equalsIgnoreCase("WMV")) {
            advancedVideoPlayer = new WMVPlayer();
        }
    }

    @Override
    public void play(String videoType, String fileName) {
        if (videoType.equalsIgnoreCase("MOV")) {
            advancedVideoPlayer.playMOV(fileName);
        }
        if (videoType.equalsIgnoreCase("WMV")) {
            advancedVideoPlayer.playWMV(fileName);
        }
    }
}
