package ex04;

public class SomeNewClass implements Displayable {
    private String data;

    public SomeNewClass(String data) {
        this.data = data;
    }

    @Override
    public void display(String format) {
        System.out.println("Displaying in " + format + " format. Data: " + data);
    }
}
