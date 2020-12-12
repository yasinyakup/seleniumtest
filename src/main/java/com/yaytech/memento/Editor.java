package com.yaytech.memento;

public class Editor {
    private String content;

    public EditorState createState(){
        return new EditorState(this.content);
    }
    public void restore(EditorState es){
        this.content = es.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
