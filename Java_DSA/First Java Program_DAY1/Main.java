import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello World!");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");
        input.close();
    }
}