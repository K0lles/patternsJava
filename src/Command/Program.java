package Command;

import java.util.ArrayList;
import java.util.List;

public class Program {
    private List<ICommand> commandList = new ArrayList<>();

    public Program() {
    }

    public void addCommands(ICommand command) {
        this.commandList.add(command);
    }

    public void executeCommands() {
        for (ICommand command : this.commandList) {
            command.execute();
        }
    }
}
