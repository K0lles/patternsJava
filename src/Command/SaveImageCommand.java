package Command;

public class SaveImageCommand extends ICommand{
    private Image image;

    public SaveImageCommand(Image image) {
        this.image = image;
    }

    @Override
    public void execute() {
        this.image.save();
    }
}
