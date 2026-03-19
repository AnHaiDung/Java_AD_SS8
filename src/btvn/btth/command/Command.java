package btvn.btth.command;

public interface Command {
    void excute();
    void undo();
    void redo();
}
