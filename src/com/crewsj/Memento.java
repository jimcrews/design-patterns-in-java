package com.crewsj;

import com.crewsj.memento.simple.Editor;
import com.crewsj.memento.simple.History;

public class Memento {
    public static void Simple() {
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop());
        editor.restore(history.pop());

        System.out.println(editor.getContent());
    }
}
