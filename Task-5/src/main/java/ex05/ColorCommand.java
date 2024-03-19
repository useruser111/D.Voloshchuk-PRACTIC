package ex05;

import java.util.Random;

public class ColorCommand implements Command {
    private String previousColor;
    private String currentColor;

    @Override
    public void execute() {
        Random rand = new Random();
        String[] colors = {"Red", "Green", "Blue", "Yellow", "Purple", "Orange"};
        previousColor = currentColor;
        currentColor = colors[rand.nextInt(colors.length)];
        System.out.println("Generated color: " + currentColor);
    }

    @Override
    public void undo() {
        if (previousColor != null) {
            System.out.println("Undoing last operation. Previous color: " + previousColor);
            currentColor = previousColor;
        } else {
            System.out.println("Nothing to undo.");
        }
    }
}
