import java.util.Scanner;
public class Pages {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter your age: ");
                int age = scanner.nextInt();

                int yearsUntil100 = 100 - age;

                System.out.println(age + " years old should read at least " + yearsUntil100 + " pages before giving up on a book.");

                scanner.close();
    }
}
