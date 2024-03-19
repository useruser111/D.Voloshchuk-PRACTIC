package ex05;

public class CommandManager {
    private Command lastCommand;

    public void executeCommand(Command command) {
        lastCommand = command;
        command.execute();
    }

    public void undoLastCommand() {
        if (lastCommand != null) {
            lastCommand.undo();
        } else {
            System.out.println("No commands to undo.");
        }
    }
}
