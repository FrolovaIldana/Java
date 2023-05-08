import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите уравнение");
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char[] s = str.toCharArray();

        char x = 'x';
        char p = '+';
        char m = '-';
        int i4=Character.getNumericValue(s[4]);
        int i2=Character.getNumericValue(s[2]);
        int i0=Character.getNumericValue(s[0]);

        if (x == s[0]) {
            if (s[1] == p) {

                System.out.println("x = " + (i4 - i2));
            } else {

                System.out.printf("x = " + (i4 + i2));
            }
        }
        else if  (x == s[2])
       {
               if (s[1] == p) {
                    System.out.println("x = " + (i4 - i0));
               } else {
                    System.out.println("x = " + (i0 - i4));
                }
        }
       else {
            if (s[1] == p) {
                System.out.println("x = " + (i0 + i2));
            }
            else {
                    System.out.println("x = " + (i0 - i2));
               }
            }
        }
    }


