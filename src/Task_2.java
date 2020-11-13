import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int operand1 = 12, operand2 = 0;

        System.out.println("Enter sign");

        String sign = sc.next();

        switch (sign) {

            case "+":
                System.out.println(operand1 + operand2);
                break;

            case "-":
                System.out.println(operand1 - operand2);
                break;

            case "*":
                System.out.println(operand1 * operand2);
                break;

            case "/":
                if (operand2 == 0) {
                    System.out.println("Can't divide by zero");
                } else {
                    System.out.println(operand1 / operand2);
                }
                break;

            default:
                System.out.println("Unknown operation");


        }
    }
}
