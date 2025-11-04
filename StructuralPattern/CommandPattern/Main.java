package StructuralPattern.CommandPattern;

import org.w3c.dom.Text;

public class Main {
    public static void main(String[] arg){
        TextDocument textDocument = new TextDocument();
        CommandManager commandManager = new CommandManager();
        commandManager.execute(new ExecuteCommand(textDocument, "Hello"));
        commandManager.execute(new ExecuteCommand(textDocument, "World"));
        System.out.println(textDocument.txt);
        commandManager.undo();
        System.out.println(textDocument.txt);
    }
    
}
