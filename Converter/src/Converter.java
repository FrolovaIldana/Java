import java.util.Scanner;
public class Converter {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int a = keyboard.nextInt();

        switch (a) {
            case 1:
                System.out.println("Нет условий для конвертации массы");
                break;
            case 2:
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");

                int b = keyboard.nextInt();

                System.out.println("Введите число");
                int c = keyboard.nextInt();
                System.out.println("Результат:");

                switch (b) {
                    case 1:
                        System.out.printf("Метры: "+ c + "\n");
                        System.out.printf("Мили: %.3f \n", c * 0.00062137);
                        System.out.printf("Ярды: %.2f \n", c/0.9144);
                        System.out.printf("Футы: %.2f \n", c*3.2808);
break;
                    case 2:
                        System.out.printf("Метры: %.2f \n", c/0.00062137);
                        System.out.printf("Мили: " + c + "\n");
                        System.out.printf("Ярды: %.2f \n", c*1760.0);
                        System.out.printf("Футы: %.2f \n", c*5280.0 );
break;
                    case 3:
                        System.out.printf("Метры: %.2f \n", c/1.0936);
                        System.out.printf("Мили: %.3f \n",c*0.00056818);
                        System.out.printf("Ярды: " + c + "\n");
                        System.out.printf("Футы: %.2f \n", c*3.0000);
break;
                    case 4:
                        System.out.printf("Метры: %.2f \n", c/3.2808);
                        System.out.printf("Мили: %.3f \n",c*0.00018939);
                        System.out.printf("Ярды: %.2f \n", c*3.0000);
                        System.out.printf("Футы: " + c + "\n");
                    break;

        }






        }
    }
}

