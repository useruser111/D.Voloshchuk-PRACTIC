package ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CommandManager commandManager = new CommandManager();
        MacroCommand macroCommand = new MacroCommand();
        ColorCommand colorCommand = new ColorCommand();

        boolean running = true;
        while (running) {
            System.out.println("Enter 'generate' to generate a color, 'undo' to undo last operation, 'exit' to exit:");
            String input = scanner.nextLine();
            switch (input) {
                case "generate":
                    commandManager.executeCommand(colorCommand);
                    macroCommand.addCommand(colorCommand);
                    break;
                case "undo":
                    commandManager.undoLastCommand();
                    break;
                case "exit":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid command.");
                    break;
            }
        }
        scanner.close();
    }
}
