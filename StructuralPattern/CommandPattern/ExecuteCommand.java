package StructuralPattern.CommandPattern;

public class ExecuteCommand implements Command {
    private TextDocument textDocument;
    private String text;
    public ExecuteCommand(TextDocument textDocument, String text){
        this.textDocument = textDocument;
        this.text = text;
    }
    @Override
    public void execute(){
        textDocument.write(text);
    }
    @Override
    public void undo(){
        textDocument.delete(textDocument.txt.length() - text.length(), textDocument.txt.length());
    }
    
}
