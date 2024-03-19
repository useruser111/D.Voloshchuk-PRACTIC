package ex05;

public class ColorTester {
    public static void main(String[] args) {
        CommandManager commandManager = new CommandManager();
        ColorCommand colorCommand = new ColorCommand();
        
        commandManager.executeCommand(colorCommand);
        commandManager.undoLastCommand();
    }
}
