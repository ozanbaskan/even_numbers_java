import java.util.Scanner;

public class EvenNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0, input = 0;
        System.out.print("Enter even numbers to sum, if you enter an odd number, sum process will end: ");
        do {
            input = s.nextInt();
            if (input % 2 == 0) sum += input;
        } while (input % 2 == 0);
        System.out.print(sum);
    }

}
