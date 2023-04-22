import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        double[] array = new double[size];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }

        double sum = 0;
        double avrg = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            avrg = sum / array.length;
        }
        // System.out.println(sum);
        //System.out.println(avrg);
        System.out.print("Итоговый массив:\n");
        for (int i = 0; i < array.length; i++) {
            System.out.println(" " + array[i]  *  avrg);
        }
    }
}
