package com.crewsj.state;

public class BrushTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Begin Drawing Colour Under Brush Icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Stop Drawing Colour Under Brush Icon");
    }
}
