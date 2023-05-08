import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите текущий курс доллара");
        double a = input.nextDouble();
        System.out.println("Введите количество рублей");
        int b = input.nextInt();
        double c = b/a;
        String result = String.format("%.2f",c);
        System.out.println("Итого: " + result + " " + "долларов");

    }
}