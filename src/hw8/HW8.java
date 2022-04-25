package hw8;

import java.util.Arrays;

import static utils.Utils.*;

public class HW8 {

    public static int[] returnArray(int a, int b, int c, int d, int f) {
        int[] Array = {a, b, c, d, f,};


        return Array;

    }

    //    8.	Написать метод, который принимает на вход 5 чисел типа double,  и возвращает массив из этих же чисел
    public static double[] returnArray(double a, double b, double c, double d, double f) {
        double[] Array = {a, b, c, d, f};

        return Array;
    }

    //    9.	Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов
    public static String[] returnArray(String a, String b, String c, String d, String f) {
        String[] Array = {a, b, c, d, f};

        return Array;
    }

//    10.	Написать метод, который принимает на вход массив целых чисел,
//    и возвращает массив тех же чисел, умноженных на 2.5

    public static double[] Array(int[] array) {

        double n = 2.5;
        double[] array1 = new double[array.length];

        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i] * n;

            System.out.println(array[i] * n);
        }
        return array1;
    }

//    11.	Написать метод, который принимает на вход массив целых положительных чисел,
//    и возвращает количество четных чисел в этом массиве

    public static int count_evenNumber(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) count++;
        }
        return count;
    }

//    12.	Написать метод, который принимает на вход массив целых положительных чисел,
//                и возвращает массив нечетных чисел

    public static int[] reverseUneven(int[] array) {

        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                result[i] = array[i];
            }
        }
        return result;
    }

//    13.	Написать метод, который принимает на вход масив целых чисел,
//    и возвращает массив значений true или false, если числа больше 10

    public static boolean[] returnArr(int[] array) {

        boolean[] result = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 10) {
                result[i] = true;
            } else {
                result[i] = false;
            }
        }
        return result;
    }

//    14.	Написать метод, который принимает на вход массив слов,
//    и возвращает строку, состоящую из этих слов

    public static String [] returnString(String[] array) {


        System.out.println(Arrays.toString(array));
        return array;
    }

//    15.	Написать метод, который принимает массив целых чисел
//    и считает сумму чисел во второй половине массива

    public static int sumNumber(int[] array){
        int sum = 0;
        for(int i = array.length/2; i < array.length; i++){

            sum = sum + array[i];
        }
        return  sum;
    }
//    16.	Написать метод, который принимает на вход целое положительные число в пределах от 1 до 10 исключительно,
//    и возвращает таблицу умножения на это число в виде массива
//    Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}

//    public static int evenNumber(int a){
//        int [] result = new int[]{};
//        for(int i = 0; i <10; i++){
//            result =
//
//        }
//
//    }






    public static void main(String[] args) {

        printTaskNumber();

//        В классе HW8:
//        4.	Импортировать статичные методы класса Utils, которые вы будете использовать во время выполнения HW8

        printTaskNumber();

//        5.	Создать объекты типа Integer, Double, String
//        и присвоить им такие же значения, как и переменным класса HW8_1

        Integer intAge1 = new Integer(18);
        Double tempBody1 = new Double(36.6);
        String name1 = new String("Irina");

        System.out.println(intAge1 + "  " + tempBody1 + "  " + "Ирина");

        printTaskNumber();

//        6.	Сравнить переменные соответствующих типов из классов HW8_1 и HW8
//        и распечатать результат сравнения в виде таблички:
//        HW8	 		|HW8_1			|areEquals?
//                ____________________________________________
//        Double d = …	|Double d_1 = …		| true or false

        System.out.println("HW8 \t\t\t" + "|" + "HW_1\t\t\t" + "|" + "areEquals?");
        line();
        System.out.println("Ирина \t\t\t" + "|" + "Ирина \t\t\t" + "|" + (name1.equals(HW8_1.name)));
        line();
        System.out.println("Double tempBody1 \t" + "|" + "Double tempBody1 \t" + "|" + "true or false");
        line();
        System.out.println(String.valueOf(tempBody1) + "\t\t |" + String.valueOf(HW8_1.tempBody) + "\t\t |" + (tempBody1.equals(HW8_1.tempBody)));
        line();

        printTaskNumber();

//        7.	Написать метод, который принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int f = 5;

        System.out.println(returnArray(1, 2, 3, 4, 5));
        System.out.println(Arrays.toString(returnArray(1, 2, 3, 4, 5)));

        printTaskNumber();

//        8.	Написать метод, который принимает на вход 5 чисел типа double,  и возвращает массив из этих же чисел

        printTaskNumber();

//        9.	Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов
        String[] Array = {"Серафима", "Кирилл", "Анна", "Ангелина", "Ирина"};

        System.out.println(returnArray("Серафима", "Кирилл", "Анна", "Ангелина", "Ирина"));


        printTaskNumber();

//        10.	Написать метод, который принимает на вход массив целых чисел,
//        и возвращает массив тех же чисел, умноженных на 2.5


        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7};

        System.out.println(Arrays.toString(Array(intArray)));

        printTaskNumber();

//        11.	Написать метод, который принимает на вход массив целых положительных чисел,
//                и возвращает количество четных чисел в этом массиве

        int[] evenArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println((count_evenNumber(evenArray)));

        printTaskNumber();

//        12.	Написать метод, который принимает на вход массив целых положительных чисел,
//                и возвращает массив нечетных чисел

        int[] uneven = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9,};
        System.out.println(Arrays.toString(reverseUneven(uneven)));

        printTaskNumber();

//        13.	Написать метод, который принимает на вход масив целых чисел,
//        и возвращает массив значений true или false, если числа больше 10

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 9, 10, 15, 20};
        System.out.println(Arrays.toString(returnArr(arr)));

        printTaskNumber();

//        14.	Написать метод, который принимает на вход массив слов,
//    и возвращает строку, состоящую из этих слов

        String[] word = {"Hello", "Word"};
        System.out.println(returnString(word));

        printTaskNumber();

//        15.	Написать метод, который принимает массив целых чисел
//        и считает сумму чисел во второй половине массива
        int [] result = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(sumNumber(result));

        printTaskNumber();

//        16.	Написать метод, который принимает на вход целое положительные число
//        в пределах от 1 до 10 исключительно, и возвращает таблицу умножения на это число в виде массива
//        Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}









    }
}