package homework;


import java.util.Arrays;
import java.util.Random;

public class HW7 {

    public static int number = 1;

    public static void printTaskNumber() {
        System.out.println(" ************************  Task = " + number + " ***********************");
        number++;
    }

    public static double average(int[] array) {

        double average = 0;
        if (array.length > 0) {
            double sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[j];
            }
            average = sum / array.length;

            System.out.println("Средний возраст котов = " + average);

        }
        return average;
    }


    public static void verifyEquals(double expectResult, String actualResult) {
//        if (expectResult == actualResult) {
//            System.out.println("Pass");
//        } else {
//            System.out.println("Fail");
//        }


    }

//    21.	Создать метод, который принимает на вход массив int,
//        и возвращает минимальное значение, максимальное значение и среднее значение всех чисел массива.

    public static int[] Array(int[] array) {
        int minNum = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (minNum > array[i]) {
                minNum = array[i];
            }
        }

        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (maxNum > array[i]) {
                maxNum = array[i];
            }
        }

        int averageNum = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        averageNum = sum / array.length;

        int[] result = new int[3];
        result[0] = minNum;
        result[1] = maxNum;
        result[2] = averageNum;

        return result;

    }




        public static void main (String[]args){
//        String catName = "Мурзик";

            printTaskNumber();

//        1.	Создать массив catsNames, заполнить его любыми значениями (см картинку котов из презентации).

            String[] catsNames;
            catsNames = new String[8];
            catsNames[0] = "Мурзик";
            catsNames[1] = "Рыжик";
            catsNames[2] = "Пуфик";
            catsNames[3] = "Шерил";
            catsNames[4] = "Муська";
            catsNames[5] = "Васька";
            catsNames[6] = "Клементина";
            for(int i =0; i<7; i++) {

                System.out.println(catsNames[i]);
            }

            printTaskNumber();

//        2.	В массиве catsNames изменить значение элемента с индексом 4 на “Рыжик”,
////        а значение элемента с индексом 1 на “Черныш”.

            if (catsNames[4] != "Рыжик") {
                System.out.println(catsNames[4] = "Рыжик");
            }
            if (catsNames[1] != "Черныш") {
                System.out.println(catsNames[1] = "Черныш");
            }


            printTaskNumber();

//        3.	Создать массив catsColors и заполнить его значениями.

            String[] catsColors;
            catsColors = new String[8];

            catsColors[0] = "grey";      //серый
            catsColors[1] = "black";     // черный
            catsColors[2] = "striped";   // полосатый
            catsColors[3] = "motley";   // пестрый
            catsColors[4] = "ginger";  // рыжий
            catsColors[5] = "white";  // белый
            catsColors[6] = "brown"; // коричневый
            catsColors[7] = "spotted";// пятнистый

            for(int i =0; i<8; i++) {

                System.out.println(catsColors[i]);
            }

            printTaskNumber();

//        4.	Создать массив catsAges и заполнить его любыми значениями.

            int[] catsAges;
            catsAges = new int[8];
            catsAges[0] = 1;
            catsAges[1] = 2;
            catsAges[2] = 3;
            catsAges[3] = 4;
            catsAges[4] = 5;
            catsAges[5] = 6;
            catsAges[6] = 7;
            catsAges[7] = 8;
            for(int i = 0; i < 8; i++) {

                System.out.println(catsAges[i]);
            }

            printTaskNumber();

//        5.	Создать массив isCatRed и заполнить его соответствующими значениями

            boolean[] isCatRed = new boolean[8];
            for (int i = 0; i < catsColors.length; i++) {
                if (catsColors[i].equals("ginger")) {
                    isCatRed[i] = true;
                } else {
                    isCatRed[i] = false;
                }
                System.out.println(isCatRed[i]);

            }

            printTaskNumber();

            //        6.	Распечатать для массивов catsNames и catsColors:
            //●	имя кота в коробке с номером 6
            //●	имена котов из коробок с четными индексами
            //●	имена котов из коробок, чьи индексы кратны 4
            //●	цвет котов из коробок с нечетными индексами
            //●	цвет котов из коробок, чьи индексы кратны 3

            System.out.println(catsNames[6]);
            System.out.println(catsColors[6]);

            System.out.println("______________________________________");

            for (int i = 0; i < 8; i++) {
                if (i % 2 == 0) {
                    System.out.println(catsNames[i]);
                }
            }
            System.out.println("______________________________________");

            for (int i = 0; i < 8; i++) {
                if (i % 4 == 0) {
                    System.out.println(catsNames[i]);
                }
            }

            System.out.println("______________________________________");

            for (int i = 0; i < 8; i++) {
                if (i % 2 != 0) {
                    System.out.println(catsColors[i]);
                }
            }
            System.out.println("______________________________________");
            for (int i = 0; i < 8; i++) {
                if (i % 3 == 0) {
                    System.out.println(catsColors[i]);
                }
            }

            printTaskNumber();

//        7.	Распечатать “Накорми кота!” для всех серых котов

            for (int i = 0; i < 8; i++) {
                if (catsColors[i].equals("grey") ) {
                    System.out.println(catsColors[i] + "-" + "Накорми кота!");
                }
            }

            printTaskNumber();

//        8.	Распечатать “Отнеси кота на прививку!”, если возраст кота меньше 2 лет

            for (int i = 0; i < catsAges.length; i++) {
                if (catsAges[i] < 0 || catsAges[i] > 50) {
                    System.out.println("Error");
                } else if (catsAges[i] < 2){
                    System.out.println(catsAges[i] + " - " + " Отнеси кота на прививку!");
                } else {
                    System.out.println("Кот остается дома");
                }
            }

            printTaskNumber();

//        9.	Для кота в последней коробке распечатать имя, цвет, возраст

            System.out.println(catsNames[6]);
            System.out.println(catsColors[6]);
            System.out.println(catsAges[6]);

            printTaskNumber();

//        10.	Распечатать имена всех котов, чей возраст больше 2 лет

            for (int i = 0; i < 7; i++) {
                if (catsAges[i] > 2) {
                    System.out.println(catsNames[i]);
                }
            }

            printTaskNumber();


//        11. Распечатать “Накорми кота!” если имя кота “Рыжик” и значение isCatRed == true

//            for (int i=0; i < isCatRed.length; i++){
//                if (isCatRed[i] == true && catsNames[i].equals("Рыжик")){
//
//                }
//                System.out.println("Накорми кота!");
//
//            }
            if(catsNames.length == isCatRed.length && catsNames.length !=0 ){
                for(int i =0; i < isCatRed.length; i++){
                    if(isCatRed[i] == true && catsNames[i].equals("Рыжик")){
                        System.out.println("Накорми кота, его зовут " + catsNames[i]);
                    }
                }
            }


            printTaskNumber();

//        12.	Распечатать средний возраст котов из массива catsAges

            double average = 0;
            if (catsAges.length > 0) {
                double sum = 0;
                for (int j = 0; j < catsAges.length; j++) {
                    sum += catsAges[j];
                }
                average = sum / catsAges.length;
                System.out.println("Средний возраст котов = " + average);

            }

            printTaskNumber();

//        13.	Распечатать возраст самого молодого кота

//            for (int i = 0; i < 8; i++) {
//                if (i == 0) {
//                    System.out.println("Возраст самого молодого кота = " + catsAges[i] + " год");
//
//                }
//            }

            double min = catsAges[0];
            for(int i =0; i < catsAges.length; i++){
                if(catsAges[i] < min){
                    min = catsAges[i];
                }
            }
            System.out.println("Возраст самого молодого кота = " + min + " год");

            printTaskNumber();

//        14.	Распечатать возраст самого старого кота
            int maxAges = Integer.MIN_VALUE;

            for (int i = 0; i < catsAges.length; i++) {
                if (maxAges <  catsAges[i]) {
                    maxAges = catsAges[i];

                }
            }
            System.out.println("Возраст самого старого кота = " + maxAges + " лет");

            printTaskNumber();
//        15.	Распечатать количество серых котов
            int count = 0;

            for (int i = 0; i < catsColors.length; i++) {
                if (catsColors[i] == "grey") {

                    count++;

                }

            }
            System.out.println("Количество серых котов = " + count);
            printTaskNumber();

//        16.	Распечатать имя кота, если кот находится в коробке с четным индексом и его возраст не больше 3 лет

            for (int i = 0; i < catsNames.length; i++) {

                if (i % 2 == 0 && catsAges[i] < 4) {

                    System.out.println(catsNames[i]);

                }
            }
            printTaskNumber();
//        17.	Создать массив четных положительных чисел, значения которых не больше 10.
//    (заполняем значения с помощью цикла for)
            int[] evenPositiveNumber = new int[6];
            int index = 0;
            for (int i = 1; i < 11; i++) {
                if (i % 2 == 0) {
                    evenPositiveNumber[index] = i;
                    index++;
                }

            }
            System.out.println(Arrays.toString(evenPositiveNumber));
            printTaskNumber();

//        18.	Написать метод, который принимает на вход массив int,
//        и возвращает среднее значение.
//        Проверить работу метода тестом, если параметр - массив catsAges


            average(catsAges);

//            verifyEquals(4.5, String.valueOf(catsAges));

            printTaskNumber();

//        19.	Создать массив нечетных отрицательных чисел в промежутке от -1000 до -900

            int[] oddNegativeNumber = new int[50];

            int index1 = 0;
            for (int i = -1000; i < -900; i++) {
                if (i % 2 != 0) {
                    oddNegativeNumber[index1] = i;
                    index1++;
                }
            }
            System.out.println(Arrays.toString(oddNegativeNumber));
            printTaskNumber();

//        20.	Создать массив из 10 случайных положительных целых чисел

            int[] randomArray = new int[10];
            Random random = new Random();

            for (int i = 0; i < 10; i++) {
                randomArray[i] = Math.abs(random.nextInt());
                System.out.println(randomArray[i]);


            }
            printTaskNumber();

//        21.	Создать метод, который принимает на вход массив int,
//        и возвращает минимальное значение, максимальное значение и среднее значение всех чисел массива.
//                Проверить работу метода на массиве из задания 20.

            Array(randomArray);

            System.out.println(Arrays.toString(Array(randomArray)));



            printTaskNumber();

            // 22.	Создать массив четных чисел и массив нечетных чисел из элементов массива из задания 20.

            for (int i = 0; i < 10; i++) {
                randomArray[i] = Math.abs(random.nextInt());
                if (i % 2 == 0) {
                    System.out.println(randomArray[i]);
                }
            }
            System.out.println("__________________________________________");

            for (int i = 0; i < 10; i++) {
                randomArray[i] = Math.abs(random.nextInt());
                if (i % 2 == 1) {
                    System.out.println(randomArray[i]);
                }
            }

            printTaskNumber();
            System.out.println("___________________________________________________________");

            String[][] twoDArrayOfCats = {{"Мурзик", "Черныш", "Мурка", "Васька", "Рыжик", "Дымка", "Патрик", "Зорро" },
                    {String.valueOf(2), String.valueOf(3), String.valueOf(4), String.valueOf(1), String.valueOf(5), String.valueOf(6), String.valueOf(9), String.valueOf(10)},
                    {"Grey", "Black", "Grey", "Brown", "Red", "Grey", "Red", "Grey" }};

            for (int i = 0; i < 3; i++) {  //идём по строкам
                for (int j = 0; j < 8; j++) {//идём по столбцам
                    System.out.print(" " + twoDArrayOfCats[i][j] + " "); //вывод элемента
                }
                System.out.println();//перенос строки ради визуального сохранения табличной формы
                System.out.println("___________________________________________________________");
            }
//            Распечатать все данные котов в коробках с четными индексами, используя двумерный массив.

            for(int i = 0; i < 3; i++){
                if(i%2==0){
                    for(int j = 0; j < 8; j++){
                        if(j%2==0){
                            System.out.println(" " + twoDArrayOfCats[i][j] + " ");
                        }

                    }

                }
            }


        }
    }