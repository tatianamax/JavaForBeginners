package homework;


import static java.lang.Integer.MIN_VALUE;

public class HW3 {
    public static void main(String[] args) {

        System.out.println("Task 2");

//        2.	Создать переменные a и b типа byte, присвоить им значения из допустимого диапазона.

        byte a = 50;
        byte b = 16;
        String line = "**************************************";

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(line);

        System.out.println("Task 3");

 //       3.	Создать переменные s и t типа short, присвоить им негативное и позитивное значения с разницей 60000.

        short s = -30000;
        short t = 30000;

        System.out.println("s = " + -30000);
        System.out.println("t = " + 30000);
        System.out.println(line);

        System.out.println("Task 4");

 //       4.	Создать переменную i типа int и присвоить ей минимально возможное значение этого типа.
        //       Затем присвоить максимально возможное значение этого типа. Распечатать оба значения в виде таблицы:

        int min, max;

        min = Integer.MIN_VALUE;
        max = Integer.MAX_VALUE;
        String line1 = "_____________________________";


        System.out.println(line1);
        System.out.println("|\tint min\t|\t" + min + "\t|");
        System.out.println(line1);
        System.out.println("|\tint max\t|\t" + max + "\t|");
        System.out.println(line1);
        System.out.println(line);

        System.out.println("Task 5");

 //       5.	Создать переменную phoneNumber и присвоить ей значение номера телефона с кодом страны и города
 //       (можно ненастоящий номер телефона, например, 18009998877)

        String phoneNumber = "+79527278938";

        System.out.println(phoneNumber);

        System.out.println(line);

        System.out.println("Task 6");

 //       6.	Создать переменную f типа float и присвоить ей значение 100.101101.
        //       Создать переменную d типа double и присвоить ей значение 100.101101.
 //       Распечатать результат в виде таблицы:

//        float f = 100.101101	значение double d = 100.101101	значение d

        float f = 100.101101F;
        double d = 100.101101;
        String line2 = "_____________________________________________";

        System.out.println(line2);
        System.out.println("|\tfloat f = 100.101101\t|\t" + 100.101101 + "\t|");
        System.out.println(line2);
        System.out.println("|\tdouble d = 100.101101\t|\t" + 100.101101 + "\t|");
        System.out.println(line2);
        System.out.println(line);

        System.out.println("Task 7");

//        a) Создать переменную типа Double с именем dd  и инициализировать её результатом суммы чисел 10.09999 и 20.099999.
//                b) Создать переменную типа Float с именем ff  и инициализировать её результатом суммы чисел 10.09999 и 20.099999.

//               Распечатать результаты задания №7, как продолжение таблицы из задания № 6.

        Double dd;
        dd = (10.09999 + 20.099999);
        System.out.println(dd);

        Float ff;
        ff = (10.09999F + 20.099999F);
        System.out.println(ff);

        System.out.println(line2);
        System.out.println("|\tfloat f = 100.101101\t|\t" + 100.101101 + "\t|");
        System.out.println(line2);
        System.out.println("|\tdouble d = 100.101101\t|\t" + 100.101101 + "\t|");
        System.out.println(line2);
        System.out.println("|\tDouble dd = (10.09999 + 20.099999)\t|\t" + (10.09999 + 20.099999) + "\t|");
        System.out.println(line2);
        System.out.println("|\tFloat ff = (10.09999 + 20.099999)\t|\t" + (10.09999F + 20.099999F) + "\t|");
        System.out.println(line2);
        System.out.println(line);

        System.out.println("Task 8");

 //       8.	Создать переменную result и присвоить ей значение выражения 10 / 3 (с максимальной точностью)

       double result = 10.0/3;
        System.out.println(result);

        System.out.println(line);

        System.out.println("Task 9");

 //       9.	Создать переменные sum, product, quotient и remainder,
        //       и  присвоить им значения вычислений переменных f и d

        double sum = (f + d);
        System.out.println(sum);

        double product = (f * d);
        System.out.println(product);

        double quotient = (f / d);
        System.out.println(quotient);

        double remainder = (f % d);
        System.out.println(remainder);

        System.out.println(line);

        System.out.println("Task 10");

 //       10.	Распечатать слово HELLO точками

        System.out.println(".    . ..... .     .      .....");
        System.out.println(".    . .     .     .     .    .");
        System.out.println("...... ..... .     .     .    .");
        System.out.println(".    . .     .     .     .    .");
        System.out.println(".    . ..... ..... .....  .....");

        System.out.println(line);

        System.out.println("Task 11");

 //       11.	Создать переменные подходящего ссылочного типа данных(выбирать минимально достаточный диапазон значений):
 //       t1 = 0;
 //       t2 = 150;
 //       t3 = -120;
//        t4 = - 505.505;
//        t5 = 100100;
//        t6 = 100010001000;
//        t7 = 2.66666666666666;
//        t8 = - 1000000.001;
//        t9 = 1010;

//        Распечатать значения всех переменных.

        Byte T1 = 0;
        Short T2 = 150;
        Byte T3 = 120;
        Float T4 = - 505.505F;
        Integer T5 = 100100;
        Long T6 = 100010001000L;
        Double T7 = 2.66666666666666;
        Double T8 = - 1000000.001;
        Short T9 = 1010;

        System.out.println(line2);
        System.out.println("|\tByte T1 = 0\t|\t" + 0 + "\t|");
        System.out.println(line2);
        System.out.println("|\tShort T2 = 150\t|\t" + 150 + "\t|");
        System.out.println(line2);
        System.out.println("|\tByte T3 = 120\t|\t" + 120 + "\t|");
        System.out.println(line2);
        System.out.println("|\tFloat T4 = - 505.505F\t|\t" + - 505.505 + "\t|");
        System.out.println(line2);
        System.out.println("|\tInteger T5 = 100100\t|\t" + 100100 + "\t|");
        System.out.println(line2);
        System.out.println("|\tLong T6 = 100010001000L\t|\t" + 100010001000L + "\t|");
        System.out.println(line2);
        System.out.println("|\tFloat T7 = 2.66666666666666F\t|\t" + 2.66666666666666F + "\t|");
        System.out.println(line2);
        System.out.println("|\tDouble T8 = - 1000000.001\t|\t" + - 1000000.001 + "\t|");
        System.out.println(line2);
        System.out.println("|\tShort T9 = 1010\t|\t" + 1010 + "\t|");
        System.out.println(line2);
        System.out.println(line);

        System.out.println("Task 12");

 //       12.	С помощью полей классов ссылочного типа распечатать таблицу:

 //       Type	Size in bits	min	max
//        byte	8	-128	127
//        short
//        int
//        long
//        float
//        double
        String line3 = "_____________________________________________________________";

        System.out.println(line3);
        System.out.println("|\ttype\t|\t" + "Size in bits   " + "|\tmin     \t|\t" + " max " + "\t|");
        System.out.println(line3);
        System.out.println("|\tByte\t|\t" + "      8        |\t-128     \t|\t " + 127 + " \t|");
        System.out.println(line3);
        System.out.println("|\tShort\t|\t" + "      16       |\t-32768   \t|\t" + 32767 + "\t|");
        System.out.println(line3);
        System.out.println("|\tInt   \t|\t" +  "      32       |\t-2*10^9   \t|\t" + "2*10^9" + "\t|");
        System.out.println(line3);
        System.out.println("|\tLong\t|\t" + "      64       |\t-9*10^18\t|\t" + "9*10^^18" + "\t|");
        System.out.println(line3);
        System.out.println("|\tFloat\t|\t" + "      32       |\t-10^38   \t|\t" + "-10^^38" + "\t|");
        System.out.println(line3);
        System.out.println("|\tDouble\t|\t" + "      64       |\t-10^308   \t|\t" + "10^^308" + "\t|");
        System.out.println(line3);
        System.out.println(line);

        System.out.println("Task 13");

//        13.	Создать 2 переменные референсного типа Integer - num1 и num2, присвоить им одинаковые значения,
//                сравнить 2 переменные друг с другом с помощью метода .equal.
//        Вывести результат сравнения на печать в виде выражения:
//            “Если num1 = num2, то результат сравнения методом .equal = …”

//        Присвоить переменным разные значения, сравнить,  и вывести результат на печать:
//        “Если num1 не равно num2, то результат сравнения методом .equal = …”



        Integer num1 = 257;
        Integer num2 = 257;

        num1.equals(num2);
        System.out.println("Если num1 = num2,то результат сравнения методом .equals ="  +  num1.equals(num2));
        System.out.println("Если num1 != num2,то результат сравнения методом .equals ="  +  num1.equals(num2));

         num1 = 257;
         num2 = 500;

        System.out.println("Если num1 = num2,то результат сравнения методом .equals ="  +  num1.equals(num2));
        System.out.println("Если num1 != num2,то результат сравнения методом .equals ="  +  num1.equals(num2));
        System.out.println(line);

        System.out.println("Task 14");

//        14.	Создать 2 переменные примитивного типа int - number1 and number2. Инициализаровать их
//        а) одинаковыми значениями
//        b) number1 < number2
//        c) number1 > number2
//        сравнить их подходящим методом класса Integer (посмотрите, какой метод подойдет),
//        и вывести результаты сравнения на печать в виде выражений:
//          “Если number1 = number2, то результат сравнения методом … = …”
//        “Если number1 < number2, то результат сравнения методом … = …”
//       “Если number1 > number2, то результат сравнения методом … = …”

        Integer number1 = 5;
        Integer number2 = 5;
        number1.compareTo(number2);

        System.out.println("Если number1 = number2, то результат сравнения методом .compareUnsigned = "
                + number1.compareTo(number2));


        number1 = 5;
        number2 = 10;

        System.out.println("Если number1 = number2, то результат сравнения методом .compareUnsigned = "
                + number1.compareTo(number2));


        number1 = 10;
        number2 = 5;

        System.out.println("Если number1 = number2, то результат сравнения методом .compareUnsigned = "
                + number1.compareTo(number2));

        System.out.println(line);

        System.out.println("Task 15");

//        15.	Создать переменную типа Float, присвоить ей значение 234.9999 и распечатать значение в int

        Float A = 234.9999F;
        A.intValue();
        Math.round(A);
        System.out.println(Math.round(A));

        System.out.println(line);

        System.out.println("Task 16");
//        16.	С помощью метода sum() класса Double посчитать сумму двух переменных типа double.


        double c = 12.35;
        double h = 10.15;

        System.out.println(Double.sum(c, h));

        System.out.println(line);

        System.out.println("Task 17");

//        17.	С помощью метода sum() класса Integer посчитать сумму двух переменных типа Float.

        Float D = 12.50F;
        Float F = 10.50F;

        D.intValue();
        F.intValue();

        System.out.println(Integer.sum (D.intValue(), F.intValue() ));;

        System.out.println(line);


        System.out.println("Task 18");

//        18.	Создать 2 переменные типа Short:
//        short1 = 12000
//        short2 = 12300
//        a)	Распечатать фразу:
//               “12000 - 12300 = -300”
//        где значение -300 выведено с помощью метода класса Short, а не операцией вычисления
//        b)	Присвоить переменной short1 значение 12500, вывести фразу:
//         “12500 - 12300 = 200”
//        где значение 200 выведено с помощью метода класса Short, а не операцией вычисления

        Short short1 = 12000;
        Short short2 = 12300;

        System.out.println("a) " + short1 + " - " + short2 + " = " + Short.compare(short1, short2));

        short1 = 12500;

        System.out.println("b)" + short1 + " - " + short2 + " = " + Short.compareUnsigned(short1, short2) );

        System.out.println(line);

        System.out.println("Task 19");

//        19.	Создать переменные:
//        String str1 = "123.56";
//        String str2 = "123.55";
//        Double doub1 = 123.56;
//        Double doub2 = 123.55;

//        Распечатать результат doub1 - doub2

//        Используя методы ссылочного типа данных, посчитать и распечатать результат str1 - str2

          String str1 = "123.56";
          String str2 = "123.55";
          Double doub1 = 123.56;
          Double doub2 = 123.55;

        System.out.println(doub1 - doub2);

        double numer = Double.valueOf(str1);
        double numer1 = Double.valueOf(str2);

        System.out.println(Double.valueOf(str1) - Double.valueOf(str2));

        System.out.println(line);

        System.out.println("Task 20");

//        20.	Создать переменную подходящего типа данных для хранения результатов измерения температуры тела кота
//        (значения температуры в Цельсиях).
//        Присвоить этой переменной сначала максимальное значение,
//        затем минимальное значение. Посчитать и распечатать среднее значение, округленное с помощью метода класса Math.
//                Распечатать результат среднего значения температуры тела кота.

        double maxTemp = 39.5;
        double minTemp = 38.0;
        double average = (maxTemp + minTemp)/2;

        System.out.println(average);
        System.out.println("Средняя температура тела кота = " + Math.round(average));

        System.out.println(line);

        //   способ 2

       // double = temp;
      //  temp = 37.3;
      //  double average;
      //  average = temp/2;
      //  temp 35.6;
      //  average = average +temp/2;
      //  System.out.println("Средняя температура тела кота = " + Math.round(average));

        System.out.println("Task 22");


//                        21.	Создать переменную n типа Number, присвоить ей максимально возможное значение.
//        Присвоить n значение 10,
//                затем присвоить n значение 10.999999999.

//                Распечатать результаты в виде выражения:
//          “Переменная n может принимать значения:
//        n =  …
//        n =  …
//        n =  …
//        Это возможно, потому что …”

        Number n = Long.MAX_VALUE;
        n = 10;
        n = 10.999999999;

        System.out.println("Переменная n может принимать значения:");
        System.out.println("n = " + Long.MAX_VALUE);
        System.out.println("n = " + n.byteValue());
        System.out.println("n = " + n.doubleValue());
        System.out.println("Это возможно, потому что n принимает значение других переменных.");

        System.out.println(line);

        System.out.println("Task 22");

//        22.	Создать переменную Integer numberInteger = 100.
//        Доказать, что numberInteger имеет тип Integer,
//        а numberInteger.toString() имеет тип String.

        Integer numberInteger = 100;
        numberInteger.toString();

        if (numberInteger instanceof Integer) {
            System.out.println(true);
        };

        if (numberInteger.toString() instanceof String) {
            System.out.println("String");

            System.out.println(line);

            System.out.println("Task 23");

//              23.	Вывести на экран следующие выражения, используя для печати только переменные:
//              “36.6 градусов по Цельсию  = … градусов по Фаренгейту”,
//              где значение по Фаренгейту должно быть вычислено по формуле
//              “50 kilogram = … lbs,  50 lb = … kg”, где значения должны быть вычислены по формулам

            double C = 36.6;
            double Fa = (C * 9/5 + 32);
            Math.round(Fa);
            System.out.println("36.6 градусов по Цельсию = " + Math.round(Fa));

            System.out.println(line);

            float kg = 50F;
            float lbs = 2.2046F;

            System.out.println("50 kilogram = " + (kg * lbs) + ", 50 lbs = " + (kg * 0.453592 ) + " kg");

            System.out.println(line);


        };
































    }
}
