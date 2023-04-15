public class Massiv {
    public static void main(String[] args) {
        int [] numbers={5,10,15,20,25};

        //2. Поменяйте местами первый и последний элемент в массиве
// создаем промежуточную переменную и записываем туда первый элемент массива
        int temp = numbers[0];

//меняем местами значения
        numbers[0] = numbers[numbers.length-1];

//значение последнего элемента берем из промежуточной переменной
        numbers[4] = temp;
        System.out.println(java.util.Arrays.toString(numbers));

        //3. Вывести в консоль результат суммы первого и среднего элемента

        System.out.println(numbers[0]+ numbers[numbers[numbers.length-1]/2]);
    }
}