import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        System.out.print("Пожалуйста, введите слово: ");

        Scanner in = new Scanner(System.in);
        String weather = in.next();

        switch (weather) {

            case "ветренно":
                System.out.println("windy");
                break;

            case "солнечно":
                System.out.println("sunny");
                break;

            case "холодно":
                System.out.println("cold");
                break;

            case "тепло":
                System.out.println("warm");
                break;

            case "дождь":
                System.out.println("rain");
                break;

            case "снег":
                System.out.println("snow");
                break;
        }

    }
}
