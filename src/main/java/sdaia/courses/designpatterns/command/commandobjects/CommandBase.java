package sdaia.courses.designpatterns.command.commandobjects;


public interface CommandBase {
    void execute();

    void undo();
}
