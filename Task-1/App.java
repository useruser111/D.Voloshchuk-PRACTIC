public class App {
    public static void main(String[] args) {
        System.out.println("Кількість аргументів командного рядка: " + args.length);
        System.out.println("Аргументи командного рядка:");

        for (int i = 0; i < args.length; i++) {
            System.out.println((i + 1) + ": " + args[i]);
        }
    }
}
