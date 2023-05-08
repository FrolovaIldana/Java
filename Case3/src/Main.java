import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите количество строк n");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Введите строки");
        int counter = 0;
        String res = "";
        for ( int i= 0 ; i<n; i++){
            String temp = input.next();
            char[] temp1 = temp.toCharArray();
            //System.out.println(Arrays.toString(temp1));
            HashSet result = new HashSet();
            for (char t : temp1) {
               result.add(t);
            }
            //System.out.println(result.size());
            if ( counter < result.size() ){
                counter = result.size();
                res = temp;
            }
        }
        //System.out.println(counter);
        System.out.println(res);
    }
}





