import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите резмер матрицы:");
        Scanner input = new Scanner(System.in);
        int size_x = input.nextInt();
        int size_y = input.nextInt();
        int[][] array = new int[size_x][size_y];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < size_x; i++){
            for (int j = 0; j < size_y; j++){
                array[i][j] = input.nextInt();
            }
        }
        System.out.print("Первая строка матрицы:");
        for (int j = 0; j < size_y; j++) {
            System.out.print(" " + array[0][j] * 3 );
        }
    }
}