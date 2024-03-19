package ex01;

public class EnergyCalculator {
    private Item2d result;

    public EnergyCalculator() {
        result = new Item2d();
    }

    public Item2d calculateEnergy(double mass, double height) {
        double energy = mass * 9.8 * height;
        result.setParameters(mass, energy);
        return result;
    }
}
