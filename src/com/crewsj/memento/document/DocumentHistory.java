package com.crewsj.memento.document;

import java.util.ArrayDeque;
import java.util.Deque;

public class DocumentHistory {
    private Deque<DocumentState> states = new ArrayDeque<>();

    public void push(DocumentState state) {
        states.push(state);
    }

    public DocumentState pop() {
        return states.pop();
    }
}
