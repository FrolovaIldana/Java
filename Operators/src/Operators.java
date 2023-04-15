import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);  //1. Ввести три числа с клавиатуры x, y, z
        System.out.println("Ввести три числа с клавиатуры x  y  z" );
        int x = keyboard.nextInt();
        int y = keyboard.nextInt();
        int z = keyboard.nextInt();

        // 2. Найти и вывести в консоль среднее арифметическое этих чисел

        int arifm = (x+y+z)/3;
        System.out.println("Cреднее арифметическое этих чисел ="  + arifm );

        //3. Разделить среднее арифметическое на 2 и округлить в меньшую сторону
        int b = arifm/2;
        int result = (int)Math.floor(b);
        System.out.println("Итоговое число округленное:" + result);
        //4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
        if (result > 3 ){
            System.out.println("Программа выполнена корректно");
        }

    }
}
