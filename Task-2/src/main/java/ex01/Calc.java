package ex01;

import java.io.*;

public class Calc {
    private static final String FNAME = "Item2d.bin";
    private Item2d result;
    private EnergyCalculator energyCalculator;

    public Calc() {
        result = new Item2d();
        energyCalculator = new EnergyCalculator();
    }

    public void setResult(Item2d result) {
        this.result = result;
    }

    public Item2d getResult() {
        return result;
    }

    public double init(double mass, double height) {
        result = energyCalculator.calculateEnergy(mass, height);
        return result.getEnergy();
    }

    public void show() {
        System.out.println(result);
    }

    public void save() throws IOException {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FNAME));
        os.writeObject(result);
        os.flush();
        os.close();
    }

    public void restore() throws Exception {
        ObjectInputStream is = new ObjectInputStream(new FileInputStream(FNAME));
        result = (Item2d) is.readObject();
        is.close();
    }
}
