package com.crewsj;

import com.crewsj.memento.document.DocumentHistory;
import com.crewsj.memento.simple.Editor;
import com.crewsj.memento.simple.History;
import com.crewsj.memento.document.Document;

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

    public static void Complex() {
        var document = new Document();
        var history = new DocumentHistory();

        history.push(document.createState());
        System.out.println(document); // Document{content='', fontName='', fontSize=0}

        document.setContent("Hello");
        history.push(document.createState());
        System.out.println(document); // Document{content='Hello', fontName='', fontSize=0}

        document.setFontName("Font 1");
        history.push(document.createState());
        System.out.println(document); // Document{content='Hello', fontName='Font 1', fontSize=0}

        document.setFontSize(10);
        history.push(document.createState());
        System.out.println(document); // Document{content='Hello', fontName='Font 1', fontSize=10}

        // start undo
        // pop an element from the deque. The element is popped from the top of the deque and is removed from the same.
        document.restore(history.pop());
        System.out.println(document); // Document{content='Hello', fontName='Font 1', fontSize=10}

        document.restore(history.pop());
        System.out.println(document); // Document{content='Hello', fontName='Font 1', fontSize=0}

        document.restore(history.pop());
        System.out.println(document); // Document{content='Hello', fontName='', fontSize=0}

        document.restore(history.pop());
        System.out.println(document); // Document{content='', fontName='', fontSize=0}

    }

}
