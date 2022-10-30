package Command;

public class ZipImageCommand extends ICommand{
    private Image image;

    public ZipImageCommand(Image image) {
        this.image = image;
    }

    @Override
    public void execute() {
        this.image.zip();
    }
}
