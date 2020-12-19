package com.yaytech.statepattern;

public class BrushTool implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("this is brush mouse up");
    }

    @Override
    public void mouseDown() {
        System.out.println("this is brush mouse down");

    }
}
