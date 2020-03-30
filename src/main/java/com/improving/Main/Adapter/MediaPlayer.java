package com.improving.Main.Adapter;

public class MediaPlayer implements VideoPlayer {

    VideoAdapter videoAdapter;

    //built in support for mp4
    @Override
    public void play(String videoType, String fileName) {
        if (videoType.equalsIgnoreCase("MP4")) {
        System.out.println("Playing MP4: " + fileName);
        }
    //using adapter to play WMV or MOV
        else if (videoType.equalsIgnoreCase("WMV") || videoType.equalsIgnoreCase("MOV")) {
        videoAdapter = new VideoAdapter(videoType);
        videoAdapter.play(videoType, fileName);
        }
        else {
        System.out.println(videoType + " is not a supported format on this crappy media player");
        }
    }
}
