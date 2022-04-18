package homework;

import java.util.Random;

public class HW5 {

    public static int number = 2;

    public static void printTaskNumber() {
        System.out.println(" ************************  Task = " + number + " ***********************");
        number++;
    }

    public static void verifyEquals(int expectResult, int actualResult){
        if( expectResult == actualResult){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }
    }

    public static void verifyEquals(String expectResult, String actualResult){
        if ( expectResult.equals(actualResult)){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }

    }
    public static void verifyEquals(double expectResult, double actualResult){
        if ( expectResult==actualResult){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

    }
    public static String dayWeek(int n) {
        if (n == 1) {
            return "понедельник";
        } else if (n == 2) {
            return "вторник";
        } else if (n == 3) {
            return "среда";
        } else if (n == 4) {
            return "четверг";
        } else if (n == 5) {
            return "пятница";
        } else if (n == 6) {
            return "суббота";
        } else if (n == 7) {
            return "воскресенье";
        } return "такого дня недели не существует";

    }


    public static int returnMaxOfThree(int x, int y, int z) {
        int max;
        if (x > y) {
            max = x;
        } else {
            max = y;
        }
        if (max > z) {

        } else {

            max = z;
        }
        return  max;
    }

    public static double averageTempCate(double f, double g, double k, double d, double e) {

        return (f + g + k + d + e) / 5;

    }

    public static String rubAndKop(double v) {

        return (int) v + " руб. " + ((int) (v * 100) - (int) v * 100) + " коп.";

    }

    public static String kgAndGrr(double n) {

        return (int) n + " кг. " + ((int) (n * 1000) - (int) n * 1000) + " гр.";
    }

    public static double returnCost(double t, int t1) {

        return ((double) t * t1);
    }


    public static double calculationSalary(double hour, double paymentHour) {

        return (hour * paymentHour);


    }

    public static void printSalary(String name, double hour11, double paymentHour11) {


        System.out.println("Смирнова Мария Ивановна\t\t" + rubAndKop(hour11 * paymentHour11));

    }

    public static void printReceipt(String product, double price, double quantity) {
        System.out.println(product);
        System.out.println("Цена за 1 кг\t\t\t" + rubAndKop(price));
        System.out.println("Количество товара\t\t" + kgAndGrr(quantity));
        System.out.println("______________________________________________________");
        System.out.println("Сумма к оплате\t\t\t" + rubAndKop(price * quantity));

    }

    public static String negativePositive(double w) {

        if (w > 0) {
            return "positive";
        } else if (w < 0) {
            return "negative";
        }
        return "0";
    }

    public static void differenceAverageOfMedian(int a, int b, int c) {
        double average = (a + b + c) / 3;
        int median = a;
//        int median =  (a > b)? ((c<b)?b:((c<a)?c:a)): ( (a>c)?a:(b>c)?c:b));
        if (a>b){
            if(c<b){
              median=b;
            }else if(c<a){
                median = c;
            }
        }else if (a>c){
            median = a;
        } else if (b>c){
            median = c;
        } else {
            median = b;
        }

        double diff = (average - median);
        if (diff > 2) {
            System.out.println("Среднее значение " + average + " отличается от медианы " + median + " на " + diff);

        } else {
            System.out.println(" Среднее значение =  " + average + " медиана = " + median);
        }
    }
    public static void differenceAverageOfMedian1(int a, int b, int c){

       double average = (a + b + c) / 3;

        int max = Math.max(Math.max(a,b), c);
        int min = Math.min(Math.min(a,b), c);
        int median = a + b + c - (min + max);
        double diff = (average - median);
        if (diff > 2) {
            System.out.println("Среднее значение " + average + " отличается от медианы " + median + " на " + diff);

        } else {
            System.out.println(" Среднее значение =  " + average + " медиана = " + median);
        }
    }

    public static int luckyNumber(int year) {
        int one = year % 10;                     // вычленяем единицы 1972 - остаток деления на 10
        int dozens = (year / 10) % 10;          // вычленяем десятки 1972 / 10 % 10
        int hundreds = (year / 100) % 10;
        int thousands = year / 1000;
        int sum =  one + dozens + hundreds + thousands;
        while (sum>9){                         // пока сумма больше 9 делай действие в фигурных скобках
            sum = (sum % 10) + (sum / 10);
        }

        return sum;
    }

    public static void printPaymet(){

        double q = (Math.floor(10.75));
        System.out.println((int) q + " руб. " + ((int) (q * 100) - (int) q * 100) + "коп. ");

    }

    public static double squareRootOfExpression(int a, int b, int c){

        double n = Math.sqrt((a * b + c) * Math.pow(a,b));

        return Math.ceil(n/Math.PI);

    }

    public static int  generateNumber() {

//        return (int) (Math.random() * 99);
        return new Random().nextInt(100);

    }


    public static boolean isLeapYear(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
            return true;
        else
            return false;
    }

//    public static double randomPow()



    public static void main(String[] args) {

        printTaskNumber();

//        2.	Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели.

        System.out.println(dayWeek(1));

        verifyEquals("понедельник",dayWeek(1));
        verifyEquals("вторник",dayWeek(2));
        verifyEquals("среда",dayWeek(3));
        verifyEquals("четверг",dayWeek(4));
        verifyEquals("пятница",dayWeek(5));
        verifyEquals("суббота",dayWeek(6));
        verifyEquals("воскресенье",dayWeek(7));
        verifyEquals("такого дня недели не существует",dayWeek(9));

        printTaskNumber();

//        Пример 2: даны три значения x, y и z. Определите наибольшее значение и присвойте его переменной largest

        int x = 10;
        int y = 20;
        int z = 30;
        System.out.println("largest = " + returnMaxOfThree(10,20,30));

        verifyEquals(30,returnMaxOfThree(10,20,30));



        printTaskNumber();

//        Используйте вложенные if, напишите фрагмент кода, который печатает наименьшее значение среди переменных a, b и c

        int a = 40;
        int b = 38;
        int c = 12;
        int min;

        if (a < b) {
            min = a;
        } else if (c < a) {
            min = c;
        } else {
            min = b;
        }

        System.out.println(min);



        printTaskNumber();

//        5.	Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота.

        double f = 35.5;
        double g = 36.6;
        double k = 37.7;
        double d = 38.0;
        double e = 39.5;

        System.out.println(averageTempCate(f, g, k, d, e));

        verifyEquals(37.46,averageTempCate(35.5,36.6,37.7,38.0,39.5));

        printTaskNumber();

//        6.	Написать метод, который принимает на вход десятичное число (например, 10.75),
//                и возвращает строку “10 руб 75 коп”.
        double v = 10.75;

        System.out.println(rubAndKop(v));
        verifyEquals("10 руб. 75 коп.", rubAndKop(10.75));

        printTaskNumber();

//        7.	Написать метод, который принимает на вход десятичное число и возвращает строку “10 кг 75 гр”.

        double n = 10.75;

        System.out.println(kgAndGrr(n));

        verifyEquals("10 кг. 750 гр.", kgAndGrr(10.75));

        printTaskNumber();

//        8.	Написать метод, который принимает на вход 2 параметра -  цену и количество товара
//                (может быть вес товара, или количество в штуках).
//                Алгоритм возвращает сумму покупки в виде десятичного числа.

        double t = 20.5;
        int t1 = 5;

        System.out.println(returnCost(t, t1));

        verifyEquals(102.5,returnCost(20.5, 5));

        printTaskNumber();

//        9.	Написать метод, который принимает на вход необходимые параметры, и печатает чек.
//        Например:
//
//        Яблоки
//        Цена за 1 кг			50 руб 13 коп
//        Количество товара	3 кг 400 гр
//                _______________________________________
//        Сумма к оплате		170 руб 44 коп
//
//                или
//
//        Хлеб
//        Цена за 1 шт		30 руб 50 коп
//        Количество товара	5 шт
//                _______________________________________
//        Сумма к оплате		152 руб 50 коп


        String product = "Яблоки";
        String line = "------------------------------------------------------------";
        double price = 50.13;
        double quantity = 3.400;

        printReceipt("Яблоки", 50.13, 3.400);


        printTaskNumber();

//        10.	Написать метод, который принимает на вход количество часов работы в день и стоимость одного часа работы,
//                и возвращает заработную плату в месяц.

        double hour = 176.0;
        double paymentHour = 1235.5;

        System.out.println("Заработная плата в месяц = " + rubAndKop(hour * paymentHour));

//        asserStringResult("Заработная плата в месяц = 217448 руб. 0 коп.",rubAndKop(176.0, 1235.5));
//        asserStringResult("Заработная плата в месяц = 217448 руб. 0 коп.",
//                printSalary("Заработная плата в месяц = ",176.0,1235.5));

        printTaskNumber();

//        11.	Написать метод, который принимает на вход необходимые параметры
//        и печатает строку ведомости выдачи зарплаты сотрудникам.
//        Например:
//
//        Смирнова Мария Ивановна 		70000 руб. 00 коп.

        // String name = "Смирнова Мария Ивановна";
        double hour11 = 200.00;
        double paymentHour11 = 350.00;
        double hour12 = 170.00;
        double paymentHour12 = 753.29;

        System.out.println("Март 2022");
        System.out.println("Смирнова Мария Ивановна\t\t\t" + rubAndKop(hour11 * paymentHour11));
        System.out.println("Серебряков Иван Петрович \t\t" + rubAndKop(hour12 * paymentHour12));

//        Распечатать ведомость для нескольких сотрудников, например:
//
//        Март 2022
//        Смирнова Мария Ивановна 		70000 руб 00 коп
//        Серебряков Иван Петрович 		128059 руб 00 коп


        printTaskNumber();

        double w = -1;
        negativePositive(-1);
        System.out.println(negativePositive(w));

//        asserDoubleResult(Double.parseDouble("positiv"),negativPositiv(5));
        verifyEquals("negative", negativePositive(-1));


        printTaskNumber();

//        13.	Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число.
//        Счастливое число рассчитывается по форумуле: сумма всех чисел, если результат больше 9,
//                снова считается сумма всех чисел.
//        Например:
//        год рождения 1999
//        1 + 9 + 9 + 9 = 28
//        2 + 8 = 10
//        1 + 0 = 1
//        Счастливое число - 1

        System.out.println(" Счастливое число = " +  luckyNumber(1972));

        verifyEquals(1, luckyNumber(1972));

        printTaskNumber();

//        а) Дано 3 числа. Необходимо рассчитать разницу между средним значением и медианой (median) значением.
//                Если разница больше 2, необходимо показать сообщение: “Среднее значение … отличается от медианы … на … “.
//        Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.

        System.out.println("a)");

        differenceAverageOfMedian(12, 13, 3);

        System.out.println("b)");

//        b) Посчитать все то же самое с помощью методов класса Math, где возможно их использовать
//
//                *Медиана - это серединное число в отсортированном наборе чисел.
//        1, 3, 9 → медиана 3
//        12, 13, 101 → медиана 13
//        14, 2, 12 → медиана 12

        differenceAverageOfMedian1(3,12,13);

        printTaskNumber();

//        15.	Написать метод, который использует методы класса Math,
//        принимает на вход сумму к оплате (например, 10.75) и округляет сумму в пользу покупателя.
//        Метод возвращает новую сумму к оплате в виде строки, например “10 руб 00 коп”.

        printPaymet();

        printTaskNumber();

//        Посчитать с помощью методов класса Math
//        a = 3
//        b = 4
//        c = 20
//
//           √(((a * b + c) * a^b))/(π )
//                Вернуть значение с округлением в бОльшую сторону.

        a = 3;
        b = 4;
        c = 20;

        System.out.println(squareRootOfExpression(3, 4, 20));

        verifyEquals(17.0,squareRootOfExpression(3,4,20));

        printTaskNumber();

//        1. Написать выражение, которое присваивает 1 к x, если y > 0
//        2. Предположим, что переменная score имеет тип double. Напишите выражение, которое увеличивает score на 5,
//            если score между 80 и 90
//        3. Перепишите следующее выражение на Java без использования оператора Не (!):  item =!( (i<10) | (v>=50) )
//        4. Напишите выражение, которое печатает True, если x  нечётное и положительно число
//        5. Напишите выражение, которое печатает true, если оба x и y положительные числа
//        6. Напишите выражение, которое печатает true, если x и y имеют одинаковый знак (+ или -)

        if(y > 0){
            x = 1;
        }
         double score;
//        if ()


        printTaskNumber();

//        18.	Написать метод, который с помощью методов класса Math высчитывает любую степень сгенерированного случайного числа.
//                Метод возвращает математически округленное целое значение и выводит на экран:
//                 “Число … в степени … = …”
//
//                  Число может быть в пределах от 0 до 1 исключительно.
//                Степень числа может быть от 0 от 10 включительно

        printTaskNumber();

//        19.	Написать метод, который возвращает случайное число в пределах от 1 до 99 включительно.

        System.out.println(generateNumber());



        printTaskNumber();

//        5. Предположим, что были сделаны следующие объявления:
//        int year;  логическое значениеВисокосный год;
//        Напишите фрагмент, который будет присваивать isLeapYear значение true, если year представляет високосный год,
//        и false в противном случае.
//                Примечание. Самое простое определение високосного года — это любой год, который делится на четыре.
//                В качестве задачи вы можете исследовать полное определение високосного года
//        и создать фрагмент для определения правильного високосного года.
//        Где логическое значениеВисокосный год - это boolean isLeapYear

//        for (int year = 2000; year <= 2020; year++) {

        int year = 2004;
        if (isLeapYear(year)){
            System.out.println("Year " + year + " is a leap year");
        }else{
            System.out.println("Year " + year + " is not a leap year");
        }





    }

}












