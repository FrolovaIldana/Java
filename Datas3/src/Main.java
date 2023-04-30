import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите строку из слов, разделенных пробелами:");
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();

        String [] result = a.split(" ");
        int counter = 0;
        for (int i=0; i<result.length; i++) {
            if (result[i].matches("^[a-zA-Z]*$")) {
                System.out.println(result[i]);
                counter ++;
            }
        }
        System.out.println(counter);
    }
}



