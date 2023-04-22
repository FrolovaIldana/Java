import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int z = 3;

        Scanner input = new Scanner(System.in);
        System.out.println("Ввведите размер массива");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == x || array[i] == y || array[i] == z){
                System.out.println("Данное значение имеется в константах " + array[i]);
            }
        }
    }
}
