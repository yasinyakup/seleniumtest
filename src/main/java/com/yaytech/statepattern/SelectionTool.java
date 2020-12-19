package com.yaytech.statepattern;

public class SelectionTool implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("this is selection move up.");
    }

    @Override
    public void mouseDown() {
        System.out.println("this is selection mouse down");

    }
}
