package StructuralPattern.CommandPattern;

public class TextDocument {
    public StringBuilder txt;
    public TextDocument(){
        txt = new StringBuilder();
    }
    public void write (String text){
        txt.append(text);
    }
    public void delete(int start, int end){
        txt.delete(start, end);
    }
}
