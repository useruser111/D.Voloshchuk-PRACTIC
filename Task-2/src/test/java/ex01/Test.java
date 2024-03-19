package ex01;

public class Test {
    public static void main(String[] args) {
        Calc calc = new Calc();

        restoreResult(calc);

        testCalculation(calc, calc.getResult().getMass(), 10.0);

        testSerialization(calc);
    }

    private static void restoreResult(Calc calc) {
        try {
            System.out.println("Restoring Result from file:");
            calc.restore();
            System.out.println("Result restored successfully.");
            System.out.println("Restored Result:");
            calc.show();
            System.out.println();
        } catch (Exception e) {
            System.out.println("Serialization error: " + e);
        }
    }

    private static void testCalculation(Calc calc, double mass, double height) {
        System.out.println("Testing Calculation:");
        double energy = calc.init(mass, height);
        System.out.println("Calculated Energy: " + energy + " J");
        calc.show();
        System.out.println();
    }

    private static void testSerialization(Calc calc) {
        try {
            System.out.println("Testing Serialization:");
            calc.save();
            System.out.println("Calculation result saved successfully.");

            calc.setResult(new Item2d());

            calc.restore();
            System.out.println("Calculation result restored successfully.");
            System.out.println("Restored Result:");
            calc.show();
        } catch (Exception e) {
            System.out.println("Serialization error: " + e);
        }
    }
}
