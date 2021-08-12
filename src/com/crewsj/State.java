package com.crewsj;

import com.crewsj.state.Canvas;
import com.crewsj.state.BrushTool;
import com.crewsj.state.SelectionTool;

public class State {
    public static void simple() {
           var canvas = new Canvas();
           canvas.setCurrentTool(new SelectionTool());
           canvas.mouseDown();
           canvas.mouseUp();
    }
}
