import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");

        int number = sc.nextInt();

        if (0 <= number && number <= 14) {
            System.out.println("0 - 14");
        }
        else if (15 <= number && number <= 35) {
            System.out.println("15 - 35");
        }
        else if (36 <= number && number <= 60) {
            System.out.println("36- 60");
        }
        else if (61 <= number && number <= 100) {
            System.out.println("61 - 100");
        }
        else {
            System.out.println("No diapason");
        }

    }
}
