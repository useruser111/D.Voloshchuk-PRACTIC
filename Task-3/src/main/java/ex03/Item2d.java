package ex03;

import java.io.Serializable;

public class Item2d implements Serializable, Displayable{
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Item2d item2d = (Item2d) obj;
        return Double.compare(item2d.mass, mass) == 0 &&
                Double.compare(item2d.energy, energy) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(mass);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(energy);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public void display() {
        System.out.println("Mass: " + mass + " kg, Energy: " + energy + " J");
    }
}
