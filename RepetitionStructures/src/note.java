import java.util.Scanner;

public class note {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int note;

        System.out.println("note: ");
        note = scan.nextInt();


        while (note < 0 | note > 10) {
            System.out.println("invalid note! Type it again" );
            note = scan.nextInt();

        }
    }
}
