package com.yaytech.statepattern;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class Canvas {

    public static void main(String[] args) {
        mouseDown(new BrushTool());
    }
    public static void mouseUp(Tool tool){
    tool.mouseUp();
    }
    public static void mouseDown(Tool tool){
    tool.mouseDown();

        Map<String, Integer> map = new LinkedHashMap<>();

    }

}
