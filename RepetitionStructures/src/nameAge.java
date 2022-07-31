import java.util.Scanner;

public class nameAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name;
        int age;

        while (true) {
            System.out.println("name: ");
            name = scan.next();
            if (name.equals("0")) break;
            System.out.println("age: ");
            age = scan.nextInt();
        }
    }
}
