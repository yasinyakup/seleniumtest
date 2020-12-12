package com.yaytech.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
   static List<EditorState> esList = new ArrayList<>();

    public static void push(EditorState es){
        esList.add(es);

    }
    public static EditorState pull(){
        int lastIndex = esList.size()-1;
        EditorState lastEditorState = esList.get(lastIndex);
        esList.remove(lastIndex);

        return lastEditorState;
    }
}
