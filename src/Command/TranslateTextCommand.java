package Command;

public class TranslateTextCommand extends ICommand{
    private Text text;

    public TranslateTextCommand(Text text) {
        this.text = text;
    }

    @Override
    public void execute() {
        this.text.translate();
    }
}
