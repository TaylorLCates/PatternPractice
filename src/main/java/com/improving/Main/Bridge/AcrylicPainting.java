package com.improving.Main.Bridge;

public class AcrylicPainting extends Painting {

    public AcrylicPainting(Painter painter) {
        super(painter);
    }

    @Override
   public void display() {
        painter.paint();
    }
}
