import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число с клавиатуры:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        String result;
        result = Integer.toString(a);
        // System.out.println(((Object)a).getClass().getSimpleName());
        // System.out.println(result.getClass().getSimpleName());

        System.out.println("Введите второе число с клавиатуры:");
        int b = input.nextInt();
        int c = Integer.parseInt(result);
        //System.out.println(((Object)c).getClass().getSimpleName());

       if (c>b) System.out.println("Большее из них a = " + c);
        else  System.out.println("Большее из них b = " + b);

        double d=b;
        double d2=c;
        //System.out.println(((Object)d).getClass().getSimpleName());
        //System.out.println(((Object)d2).getClass().getSimpleName());
           if (c < b) System.out.println("Меньшее из них a = " + c);
           else  System.out.println("Меньшее из них b = " + b);
        }

    }
