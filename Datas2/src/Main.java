public class Main {
    public static void main(String[] args)
    {
        boolean a;
        boolean b;
        boolean c;
        String str = "I like Java!!!";

        a = str.contains("Java");
        System.out.println("Содержит ли строка подстроку “Java”:" + a);

        b = str.startsWith("I like");
        System.out.println("Начинается ли строка с подстроки “I like”: " + b);

        c = str.endsWith("!!!");
        System.out.println("Заканчивается ли строка с подставки “!!!”: " + c);

        if (a && b && c) {
            System.out.println(str.toUpperCase());

            //Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран (используйте substring()).
            String result = str.replace('a', 'o');
            System.out.println(result.substring(6,11));
        }

    }
}