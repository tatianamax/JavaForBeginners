package homework;

public class HW6 {

    public static int number = 1;

    public static void printTaskNumber() {
        System.out.println(" ************************  Task = " + number + " ***********************");
        number++;
    }

    public static void printSubsequenceOffEvenNumber(double start, double end, double step) {
        for (double i = start; i < end; i += step) {
            System.out.println(i);
        }
    }
//    Написать метод, который принимает параметр ι
//        и печатает  последовательность четных чисел от нуля. Длина последовательности = ι.

    public static void printSubsequenceOffEvenNumber(int l) {
        for (int i = 0; i < l; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

//    12.	Напишите метод, который принимает целое число n, и выводит все степени числа 2 от 1 до n включительно

    public static void degreeOfNumber(int n) {

        for (int i = 1; i < n + 1; i++) {
            System.out.println(Math.pow(2, i));
        }
    }

    //    15.Написать метод, который принимает параметры n, m, ι,
//                и печатает последовательность нечетных чисел начиная с числа n, с шагом m,
//        длина последовательности  ι.
    public static void sequenceOfOddNumbers(int n, int l) {
        for (int i = n; i < l; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

//    18 Написать метод, который принимает параметры ι, n,
//    и печатает последовательность чисел,
//    начиная с числа n, по формуле для n + 1 члена последовательности:
//    n + 1 = 2n
//    Длина последовательности  ι.

    public static void printSubsequenceNumber(int n, int l) {
        int member = n; // равно первому члену пос-ти

        for (int i = 0; i < l; i++) {

            System.out.println(member);
            member = member * 2; // каждый следующий член пос-ти в два раза больше предыдущего

        }

    }

//    17.	Сгенерируйте и распечатайте последовательность по формуле:
//        n + 1 = n + 2

    public static void arithmeticProgressionPrinting(int bound) {
        for (int i = 1; i < bound; i += 2) {
            System.out.println(i);
        }

    }


    public static void main(String[] args) {

        printTaskNumber();

//        1.	Распечатать последовательность чисел от 0 до 9 включительно.

        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }

        printTaskNumber();

//        2.	Распечатать последовательность чисел от 10 исключительно до 0 включительно.

        for (int i = 9; i > -1; i--) {
            System.out.println(i);
        }

        printTaskNumber();

//        3.	Распечатать последовательность чисел от 50 до 55 включительно с шагом 2.

        for (int i = 50; i < 56; i += 2) {
            System.out.println(i);
        }
        printTaskNumber();

//        4.	Распечатать последовательность чисел, кратных 7, в промежутке (327, 300)
        for (int i = 300; i < 328; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
        printTaskNumber();

//        5.	Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1
        for (double i = 12; i < 14; i += 0.1) {
            System.out.println(i);

        }
        printTaskNumber();

//        6.	Распечатать последовательность четных чисел от 215 до 237 включительно

        for (int i = 215; i < 238; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        printTaskNumber();

//        7.	Распечатать последовательность чисел, кратных 7, в промежутке от 7 исключительно до 14 исключительно.

        for (int i = 8; i < 14; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
        printTaskNumber();

//        8.	Распечатать последовательность которая начинается с минимального значения типа данных short
//        и заканчивается максимальным значением short. Числа в последовательности должны быть кратны 15001.

        for (short i = -32768; i < 32767; i++) {
            if (i % 15001 == 0) {
                System.out.println(i);
            }
        }

        printTaskNumber();

//        9.	Распечатать последовательность чисел в промежутке от -10 до 34 включительно.
//            Числа, кратные 11, должны быть распечатаны синим цветом.
//        Числа, кратные 12, должны быть распечатаны синим цветом. А ноль необходимо распечатать словом ZERO.

        for (int i = -10; i < 35; i++) {
            if (i == 0) {
                System.out.println("ZERO");
            } else if (i % 11 == 0) {
                System.out.println("\u001B[34m" + i + "\u001B[0m");
            } else if (i % 12 == 0) {
                System.out.println("\u001B[33m" + i);
            }
        }
        printTaskNumber();

//        10.	Написать метод, который принимает на вход параметры start,  end, step,
//                и печатает последовательность десятичных  чисел, начиная с числа start, с шагом step.
//        Точка выхода из цикла - число end.

        double start = 1.0;
        double end = 5.5;
        double step = 2.0;

        printSubsequenceOffEvenNumber(1.0, 5.5, 2.0);

        printTaskNumber();

//        Написать метод, который принимает параметр ι
//        и печатает  последовательность четных чисел от нуля. Длина последовательности = ι.

        int l = 30;
        printSubsequenceOffEvenNumber(30);

        printTaskNumber();

//        12.	Напишите метод, который принимает целое число n,
//        и выводит все степени числа 2 от 1 до n включительно


        degreeOfNumber(4);

        printTaskNumber();

//        13.	Вывести последовательность 012345678900112233445566778899000…  до числа 9999 включительно.

        String str = "";
        for (int j = 1; j < 5; j++) {
            for (int i = 0; i <= 9; i++) {
                str = str + (String.valueOf(i).repeat(j));
            }
        }
        System.out.println(str);

        printTaskNumber();

//        14.	Распечатайте последовательность чисел:
//        0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5

        String str1 = "";
        int i1 = 0;
        for (int j = 0; j < 11; j++) {
            if (i1 <= 0 & i1 > -1) {
                str1 = str1 + i1 + ", ";
                i1++;
            } else if (i1 <= -1 & i1 > -2) {
                str1 = str1 + i1 + ", ";
                i1 = i1 + 3;
            } else if (i1 <= -2 & i1 > -3) {
                str1 = str1 + i1 + ", ";
                i1 = i1 + 5;
            } else if (i1 <= -3 & i1 > -4) {
                str1 = str1 + i1 + ", ";
                i1 = i1 + 7;
            } else if (i1 <= -4 & i1 > -5) {
                str1 = str1 + i1 + ", ";
                i1 = i1 + 9;
            } else {
                str1 = str1 + i1 + ", ";
                i1 = i1 * -1;
            }
        }
        System.out.println(str1);

        for (int i = 0; i < 6; i++) {
            if (i == 0) {
                System.out.printf("%d", i);
            } else {
                System.out.printf(", %d, %d", i, -i);
            }
        }
        System.out.println();


        printTaskNumber();

//        15.	Распечатать последовательность чисел:
//        0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25

        for (int i = 0; i < 26; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            } else if (i % 5 == 0) {
                System.out.println(i);
            }
        }
        printTaskNumber();

//        16.Написать метод, который принимает параметры n, m, ι,
//                и печатает последовательность нечетных чисел начиная с числа n, с шагом m,
//        длина последовательности  ι.

        sequenceOfOddNumbers(1, 22);

        printTaskNumber();

//        17.	Сгенерируйте и распечатайте последовательность по формуле:
//        n + 1 = n + 2

        arithmeticProgressionPrinting(10);

        printTaskNumber();


//       18 Написать метод, который принимает параметры ι, n, и печатает последовательность чисел,
//                начиная с числа n, по формуле для n + 1 члена последовательности:
//        n + 1 = 2n
//        Длина последовательности  ι.


        printSubsequenceNumber(1, 10);

        printTaskNumber();


//        19.	Сгенерируйте последовательность целых положительных  двузначных чисел,
//        в которых разница между первой цифрой (десятки)
//                и второй цифрой (единицы) не превышает 3.
        for (int i = 1; i < 10; i++ ) {
            for (int j = 0; j < 10; j++) {
                if(i - j < 4){
                    System.out.println(i + "" + j);
                }


            }
        }


        printTaskNumber();


    }


}
