package ex04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) {
        Calc calc = new Calc();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input;
        try {
            do {
                System.out.println("Choose an option:");
                System.out.println("1. Initialize and view");
                System.out.println("2. Save and restore");
                System.out.println("3. Test");
                System.out.println("4. Exit");
                input = in.readLine();
                switch (input) {
                    case "1":
                        System.out.println("Enter mass:");
                        double mass = Double.parseDouble(in.readLine());
                        System.out.println("Enter height:");
                        double height = Double.parseDouble(in.readLine());
                        calc.init(mass, height);
                        System.out.println("Enter display format (default or table):");
                        String format = in.readLine();
                        calc.show(format);
                        break;
                    case "2":
                        System.out.println("Saving...");
                        calc.save();
                        System.out.println("Restoring...");
                        try {
                            calc.restore();
                        } catch (Exception e) {
                            System.out.println("Error restoring: " + e.getMessage());
                        }
                        calc.show("default");
                        break;
                    case "3":
                        System.out.println("Testing...");
                        calc.test();
                        break;
                    case "4":
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid option");
                        break;
                }
            } while (!input.equals("4"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
