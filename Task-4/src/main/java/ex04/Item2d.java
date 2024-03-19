package ex04;

import java.io.Serializable;

public class Item2d implements Serializable {
    private double mass;
    private double energy;

    private static final long serialVersionUID = 1L;

    public Item2d() {
        mass = 0.0;
        energy = 0.0;
    }

    public Item2d(double mass, double energy) {
        this.mass = mass;
        this.energy = energy;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getMass() {
        return mass;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public double getEnergy() {
        return energy;
    }

    public void setParameters(double mass, double energy) {
        this.mass = mass;
        this.energy = energy;
    }

    @Override
    public String toString() {
        return "Mass: " + mass + " kg, Energy: " + energy + " J";
    }

    public void display(String format) {
        switch (format) {
            case "default":
                System.out.println(toString());
                break;
            case "table":
                System.out.println("| Mass (kg) | Energy (J) |");
                System.out.println("|-----------|-------------|");
                System.out.println(String.format("| %9.2f | %11.2f |", mass, energy));
                break;
            default:
                System.out.println("Invalid format!");
        }
    }

}
