package sdaia.courses.designpatterns.command.invoker;


import sdaia.courses.designpatterns.command.commandobjects.CommandBase;

public class RemoteControl {
    CommandBase onCommand, offCommand, undoCommand;

    public void onButtonPressed(CommandBase onCommand) {
        this.onCommand = onCommand;
        onCommand.execute();
        undoCommand = onCommand;
    }

    public void offButtonPressed(CommandBase offCommand) {
        this.offCommand = offCommand;
        offCommand.execute();
        undoCommand = offCommand;
    }

    public void undoButtonPressed() {
        undoCommand.undo();
    }

}
