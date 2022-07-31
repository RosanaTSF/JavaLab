import java.util.Scanner;

public class moreAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number;
        int maior = 0;
        int soma = 0;

        int count = 0;
        do {
            System.out.println("Number: ");
            number = scan.nextInt();

            soma = soma + number;

            if (number > maior) maior = number;

            count = count + 1;
        } while(count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Media: " + (soma/5));


    }
}
