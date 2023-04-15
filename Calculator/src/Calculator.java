import java.util.Scanner;
public class Calculator {
    public static void main(String[] args)  {

        Scanner calc= new Scanner(System.in);  //1. Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’
        System.out.println("Введите 2 числа с клавиатуры x  y  затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’ " );
        int x = calc.nextInt();
        int y = calc.nextInt();
        char z = calc.next().charAt(0);

//2. В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
        if (z == '+'){
            System.out.println( x+y );
        }
        else if (z == '-'){
            System.out.println( x-y );
        }
        else if (z == '*'){
            System.out.println( x*y );
        }
        else {
            System.out.println( x/y );
        }
    }
}