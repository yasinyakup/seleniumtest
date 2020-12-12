package com.yaytech.memento;

public class Main {

    public static void main(String[] args) {

        Editor editor = new Editor();
        editor.setContent("a");
        History.push(editor.createState());
        System.out.println(editor.getContent());

        editor.setContent("b");
        History.push(editor.createState());
        System.out.println(editor.getContent());

        editor.setContent("c");
        editor.restore(History.pull());
        editor.restore(History.pull());
        System.out.println(editor.getContent());
    }
}
