import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Отгадай загадку: “Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает”.  ");
        System.out.println("Есть 3 попытки, чтобы отгадать загадку");

        for (int i = 0; i < 3; i++) {

            Scanner input = new Scanner(System.in);
            String answer = input.nextLine();
            String answer_tru = "Заархивированный вирус";
            String answer_tru2 = "Подсказка";

            if (answer.equals(answer_tru)){
                break;
            }
            if (!answer.equals(answer_tru2)){
                if (i < 2){
                    System.out.println("Подумай еще!");
                }
                else System.out.println("Обидно, приходи в другой раз");
            }
            else {
                if (i == 0){
                    System.out.println("Подсказка");
                    String answer2 = input.nextLine();
                    if (!answer2.equals(answer_tru)){
                        System.out.println("Обидно, приходи в другой раз");
                    }
                    break;
                }
                else System.out.println("Подсказка уже недоступна");
            }
        }
    }
}