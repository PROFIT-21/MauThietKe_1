package TheCommandPattern;
import java.util.*;
public class MacroCommand implements Command {
    private List<Command> commands;

    public MacroCommand(List<Command> commands) {
        this.commands = commands;
    }

    public void execute() {
        for (Command cmd : commands) cmd.execute();
    }

    public void undo() {
        // Hoàn tác theo thứ tự ngược lại
        for (int i = commands.size() - 1; i >= 0; i--) {
            commands.get(i).undo();
        }
    }
}