package com.improving.Main.Bridge;

public abstract class Painting {
    Painter painter;

    public Painting(Painter painter) {
        this.painter = painter;
    }

    public abstract void display();
}
