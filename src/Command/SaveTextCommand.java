package Command;

public class SaveTextCommand extends ICommand{
    private Text text;

    public SaveTextCommand(Text text) {
        this.text = text;
    }

    @Override
    public void execute() {
        this.text.save();
    }
}
