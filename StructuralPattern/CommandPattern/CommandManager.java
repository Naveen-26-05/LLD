package StructuralPattern.CommandPattern;
import java.util.Stack;
public class CommandManager {
    private Stack<Command> cmds;
    public CommandManager(){
        cmds = new Stack<>();
    }
    public void execute(Command cmd){
        cmd.execute();
        cmds.push(cmd);
    }
    public void undo(){
        if(!cmds.isEmpty()){
            cmds.pop().undo();
        }
    }
    
}
