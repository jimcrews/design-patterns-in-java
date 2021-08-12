package com.crewsj.state;

public class SelectionTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Draw Rectangle Selection Box");
    }

    @Override
    public void mouseUp() {
        System.out.println("Select Everything in the Selection Box");
    }
}
