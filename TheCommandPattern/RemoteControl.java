package TheCommandPattern;

import java.util.Stack;

public class RemoteControl {
    private Command currentCommand;
    private Stack<Command> history = new Stack<>();

    public void setCommand(Command command) {
        this.currentCommand = command;
    }

    public void pressButton() {
        currentCommand.execute();
        history.push(currentCommand);
    }

    public void pressUndo() {
        if (!history.isEmpty()) {
            Command lastCmd = history.pop();
            System.out.print("Undoing: ");
            lastCmd.undo();
        }
    }
}
