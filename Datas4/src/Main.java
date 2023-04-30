import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mas = new int[15];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(41) - 20;
        }
        System.out.println(Arrays.toString(mas));

       // 1. Выведите максимальный и минимальный элемент массива.
        int max = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] > max)
                max = mas[i];
        }
        System.out.println(max);

        int min = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] < min)
                min = mas[i];
        }
        System.out.println(min);

        //Из максимального и минимального значения выведите наибольшее по модулю.
        int max1=Math.abs(max);
        int min1=Math.abs(min);
        if (max1>min1) System.out.println("Большее из них = " + max1);
        else  System.out.println("Большее из них  = " + min1);

    }
}

