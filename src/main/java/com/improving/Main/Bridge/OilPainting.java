package com.improving.Main.Bridge;

public class OilPainting extends Painting {

    public OilPainting(Painter painter) {
        super(painter);
    }

    @Override
    public void display() {
        painter.paint();
    }
}
