package Memento;

public class NotepadManager {
    public Memento currentState;

    public NotepadManager() {
    }

    public void save(Notepad notepad) {
        this.currentState = notepad.save();
    }

    public void undo(Notepad notepad) {
        notepad.undo(this.currentState);
    }
}
