package Memento;

public class Notepad {
    public String content = "";
    public String fileName;

    public Notepad(String fileName) {
        this.fileName = fileName;
    }

    public void write(String word) {
        this.content += word;
    }

    public Memento save() {
        return new Memento(this.content, this.fileName);
    }

    public void undo(Memento memento) {
        this.content = memento.content;
        this.fileName = memento.fileName;
    }
}
