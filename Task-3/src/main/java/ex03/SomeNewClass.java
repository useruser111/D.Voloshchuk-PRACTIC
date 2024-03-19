package ex03;

public class SomeNewClass implements Displayable {
    private String data;

    public SomeNewClass(String data) {
        this.data = data;
    }

    @Override
    public void display() {
        System.out.println("Data: " + data);
    }
}