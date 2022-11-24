import java.util.Scanner;
public class hw2_2 {
    public static void main(String[] args) {
        for (int n = 0; n <= 10; n++) {
            System.out.println("Введите имя");
            Scanner str = new Scanner(System.in);
            String name = str.nextLine();
            System.out.println("Hello " + name);
        }
    }
}
