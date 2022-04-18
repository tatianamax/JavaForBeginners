package homework;

public class HW4 {

    public static int number = 3;


    public static void printTaskNumber() {
        System.out.println(" ************************  Task = " + number + " ***********************");
        number++;
    }


    public static void division(int a, int b) {
        System.out.println(" Результат деления " + a + " на " + b + " = " + a / b + " , а остаток деления = " + a % b);
    }

    public static void appleStudent(int apple, int student) {
        System.out.println("Если " + apple + " яблок поделить на " + student + " учеников, то каждый ученик получит по " + (apple / student) + " яблок(a), и " + (apple % student) + " яблок(а) останется учителю.");
    }

    public static void appleStudent16(int apple, int student) {
        int studentApple = apple / student;
        int teacherApple = apple % student;
        System.out.println("Если " + apple + getAppleWord(apple) + " поделить на " + student + " учеников, то каждый ученик получит по " + studentApple + getAppleWord(studentApple) + " , и " + teacherApple + getAppleWord(teacherApple) + " останется учителю.");
    }

    public static String getAppleWord(int apple) {
        int lastDigit = apple % 10;
        if (apple >= 11 & apple <= 19 || lastDigit == 0 || lastDigit >= 5 & lastDigit <= 9) {
            return " яблок";
        }
        if (lastDigit == 1) {
            return " яблоко";
        }
        return " яблока";

    }

    public static double CelsiusToFahrenheit(double celsius) {

        return 9 / 5 * celsius + 32;


    }

    public static void Tab(int i) {

    }

    public static void exspectedIntegerResult( int expectedResult, int actualResult){

        if ( expectedResult == actualResult){
            System.out.println( " Pass ");
        }else {
            System.out.println( " Fail");
        }

    }



    public static void main(String[] args) {

        printTaskNumber();


        //   3.	Записать в виде кода следующие логические выражения:
        //   1) (2 = 2) И (7 = 7);
        //   2) Не(15 < 3);
        //   3) ("Сосна" = "Дуб") ИЛИ ("Вишня" = "Клён");
        //   4) Не("Сосна" = "Дуб");
        //   5) (Не(15 < 3)) И (10 > 20);
        //    6) ("Глаза даны, чтобы видеть") И ("Под третьим этажом находится второй этаж");
        //   7) (6/2 = 3) ИЛИ (7*5 = 20).

        //1) (2 = 2) И (7 = 7);


        int a = 2;
        int b = 7;


        System.out.println((a == a) & (b == b));


        //       2) Не(15 < 3);

        int c = 15;
        int d = 3;


        System.out.println(!(c < d));


        //       3) ("Сосна" = "Дуб") ИЛИ ("Вишня" = "Клён");

        String Pine = "Сосна";
        String Oak = " Дуб ";
        String Cherry = " Вишня ";
        String Maple = " Клен ";

        if ((Pine == Oak) || (Cherry == Maple)) ;
        {

            System.out.println((Pine == Oak) || (Cherry == Maple));
        }

//        4) Не("Сосна" = "Дуб");

        if (!(Pine == Oak)) {
            System.out.println(!(Pine == Oak));
        }

        //     5) (Не(15 < 3)) И (10 > 20);

        int e = 10;
        int f = 20;

        if (!((c < d)) || (e > f)) {

            System.out.println(!((c < d)) || (e > f));
        }

//        6) ("Глаза даны, чтобы видеть") И ("Под третьим этажом находится второй этаж");

        String oko = "Глаза даны, чтобы видеть";
        String floors = "Под третьим этажом находится второй этаж";
        System.out.println(oko + " и " + floors);

        //  7) (6/2 = 3) ИЛИ (7*5 = 20)
        int g = 6;
        int h = 5;

        if (((g / a) == 3) || ((b * h == 20))) {

            System.out.println(((g / a) == 3) || ((b * h == 20)));

        }

        printTaskNumber();
//            4.	Записать в виде кода:
//            1) ("В минуте 70 секунд") ИЛИ ("Работающие часы показывают время");
//            2) !(28 > 7) И !(300/5 = 60);
//            3) ("Телевизор - электрический прибор") И ("Стекло - дерево");
//            4) Не((300 < 100))  → ("Жажду можно утолить водой");
//            5) (75 < 81) → (88 = 88).

//            1) ("В минуте 70 секунд") ИЛИ ("Работающие часы показывают время");

        String min = "60 сек";
        String watch = "Работающие часы показывают время";

        System.out.println(min == "70 сек" || watch == "Работающие часы показывают время");


//            2) !(28 > 7) И !(300/5 = 60);

        int j = 28;
        int k = 300;

        if (!(j > b) & (!(k / h == 60))) {

            System.out.println(!(j > b) & (!(k / h == 60)));

        }

//            ("Телевизор - электрический прибор") И ("Стекло - дерево");

        String tivi = " Телевизор - электрический прибор ";
        String glass = " Стекло - дерево ";

        System.out.println(tivi == " Телевизор - электрический прибор " || glass == " Стекло - дерево ");

//            4) Не((300 < 100))  → ("Жажду можно утолить водой");

        int l = 100;
        if (!(k < l)) {

            System.out.println((!(k < l)));

        } else {
            String thirst = " Жажду можно утолить водой ";
            System.out.println(thirst);
        }

//            5) (75 < 81) → (88 = 88)
        int z = 75;
        int x = 81;


        if (z < x) {
            System.out.println(z < x);
        } else {
            int v = 88;
            System.out.println(v);
        }
        printTaskNumber();

//            5.	Записать в виде кода следующие выражения:
//            а) Андрей старше Светы. Наташа старше Светы.
//                    б) На полке стоят учебники, а на столе лежат справочники.
//            в) БОльшая детей — девочки. Остальные - мальчики.

        int Andrey = 15;
        int Natasha = 20;
        int Sveta = 10;
        if ((Andrey > Sveta) & (Natasha > Sveta)) {
            System.out.println((Andrey > Sveta) & (Natasha > Sveta));
        }

//            б) На полке стоят учебники, а на столе лежат справочники.
        String polka = " стоят учебники ";
        String stol = " лежат справочники ";
        if (polka == " стоят учебники " & stol == " лежат справочники ") ;
        System.out.println((polka == " стоят учебники " & stol == " лежат справочники "));

//                        в) БОльшая детей — девочки. Остальные - мальчики.
        String girls = " БОльшая часть детей";
        String boys = "  Остальные ";

        System.out.println(girls == " БОльшая часть детей" & boys == "  Остальные ");

        printTaskNumber();

//            6.	“Водительские права можно получить, только когда исполнится 16 лет.”

        int age = 14;
        if (age == 16) {
            System.out.println("Получите водительские права");
        }
        if (age < 16) {
            System.out.println(" Получение водительских прав невозможно ");
        } else System.out.println("Получите водительские права");

        printTaskNumber();

//                         7.	”Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно”
//            ! (Петя едет в автобусе) & (читает книгу || !( смотрит в окно))


        // System.out.println(! ("Петя едет в автобусе")  &  (("читает книгу || !(( смотрит в окно"));

        printTaskNumber();

//            8.	“Если с другом ты, это хорошо, а когда наоборот - плохо”
        String dr = " друг ";
        String ya = " я ";
        System.out.println(" Если ya и dr - хорошо, а когда ya -  плохо");

        printTaskNumber();

        //           9.	Записать выражения в виде условий if-else:

        //           - Если тебе больше 18 лет, то ты взрослый. Иначе, ты - ребенок.

        if (age > 18) {
            System.out.println(" Ты  - взрослый ");
        } else {
            System.out.println("Ты - ребенок");
        }

//              ○	Если земля сухая, значит, нет дождя. Если земля мокрая, то идет дождь.
//
        String land = " сухая ";
        String result = " нет дождя ";
        if (land == " сухая ") {

            System.out.println(result);

        } else {
            System.out.println(result == " идет дождь ");
        }

//            ○	Если земля сухая, значит, нет дождя. Если земля мокрая, то идет дождь. Иначе идет снег.
        String resalt = " идет дождь ";

        if (land == " сухая " || land == " !сухая") {

            System.out.println(result == " идет дождь ");

        } else {
            System.out.println(" идет снег ");
        }


//                ○	Если на небе тучи, идет дождь, иначе идет “слепой” дождь.

        String sky = " тучи ";

        if (sky == " ясно ") {
            System.out.println(" идет дождь");
        } else {
            System.out.println(" идет слепой  дождь");
        }

//               ○	Если сегодня суббота, значит, завтра воскресенье.
//               Если сегодня пятница, значит, вчера был четверг. Иначе вчера был не четверг, а завтра - не воскресенье

        String today = "Суббота";

        if (today == "Суббота") {
            String tomorrow = "Воскресенье";
            System.out.println(" Если сегодня пятница, значит вчера был четверг");
        } else {
            System.out.println(" Иначе вчера был !четверг, а завтра ! воскресенье");
        }

//               ○	Если на горе свистнул рак, значит, прошла вечность, иначе ждите дальше.
        String cancer = " вечность ";

        if (cancer == " свистнул ") {

            System.out.println(" Если на горе свистнул рак, значит прошла вечность");
        } else {
            System.out.println(" иначе ждите дальше");
        }


//               ○	Если тебе 18 или ты закончил школу, то ты можешь не жить с родителями,
//               иначе живи с родителями.

        String age1 = "18";
        String age2 = "ты закончил школу";
        if (age1 == "18" || age2 == "ты закончил школу") {
            System.out.println(" ты можешь не жить с родителями");
        } else {
            System.out.println("живи с родителями");
        }

        printTaskNumber();
//             10.	Проверьте число на четность. Если число четное, удвойте это число, иначе возведите число в квадрат.
//              Выведите результат работы алгоритма на печать.
//              Найдите в презентации, какой блок схеме соответствует ваш алгоритм.
        int n = 6;
        int expectedResult = 0;
        if (n % 2 == 0) {
            System.out.println(expectedResult = n * 2);
        } else {
            System.out.println(expectedResult = n * n);

        }

        printTaskNumber();

//                 11.	Напишите алгоритм проверки возраста на соответствие условиям (if-else):
//                    a)	Голосовать можно с 18 лет


        int age3 = 18;
        if (age3 >= 18) {
            System.out.println(" голосовать можно");
        }
//                    b)	Машину можно водить с 16 лет
        if (age >= 16) {
            System.out.println(" машину водить можно");
        }

//                          c)	В школу можно идти с 5 лет
//                            Выведите результат работы алгоритма на печать.
        int age4 = 5;
        if (age4 >= 5) {
            System.out.println(" можно идти в школу");
        }
//                             Найдите в презентации, какой блок схеме соответствует ваш алгоритм.

        printTaskNumber();

//                             12.	Напишите алгоритм программы, которая проверяет оценку ученика и выполняет следующие действия:
//                                      a)	5 - выдать похвальную грамоту и перевести в следующий класс
//                                      b)	4 - перевести в следующий класс
//                                      c)	3 - дать задание на лето и перевести в следующий класс
//                                      d)	2 - вызвать родителей и оставить в текущем классе на второй год
//                                      Выведите результат работы алгоритма на печать.

//                                        Найдите в презентации, какой блок схеме соответствует ваш

        int ocenka = 2;
        if (ocenka == 2) {
            System.out.println(" вызвать родителей и оставить в текущем классе на второй год");
        } else if (ocenka == 3) {
            System.out.println(" дать задание на лето и перевести в следующий класс");
        } else if (ocenka == 4) {
            System.out.println("перевести в следующий класс ");
        } else if (ocenka == 5) {
            System.out.println("выдать похвальную грамоту и перевести в следующий класс");
        }
        printTaskNumber();
//                 13.	Напишите алгоритм программы, которая проверяет 2 числа.
//                     Программа складывает числа, которые делятся на 3 без остатка, и вычитает числа, которые делятся на 5 без остатка.
//                     Программа умножает числа, которые делятся на 2 без остатка, но если хотя бы одно число отрицательное,
//                      программа умножает результат предыдущего действия на (-1).
//                      Если числа не прошли ни одну проверку, программа выводит на печать ошибку
//                      о невозможности произвести действия.
        int a13 = 8;
        int b13 = 12;
        Integer result13 = null;
        if (a13 % 3 == 0 & b13 % 3 == 0) {
            result13 = a13 + b13;
        } else if (a13 % 5 == 0 & b13 % 5 == 0) {
            result13 = a13 - b13;
        } else if (a13 % 2 == 0 & b13 % 2 == 0) {
            if (a13 < 0 || b13 < 0) {
                result13 = a13 * b13 * -1;
            } else {
                result13 = a13 * b13;
            }
        } else {
            System.out.println(" невозможно произвести действие ");
        }
        if (result13 != null) {
            System.out.println(result13);
        }

        printTaskNumber();
//                                                  14.	Распечатать следующие выражения, используя метод и параметры:
//                                                    Результат деления k на l = …, а остаток от деления  = …
//                                                    Результат деления k на m = …, а остаток от деления  = …
//                                                    Результат деления l на m = …, а остаток от деления  = …
//                                                    Результат деления m на k = …, а остаток от деления  = …
//                                                    И так далее все возможные варианты.
//                                                    Сравнить код из HW2 с кодом из HW4. Что для вас легче?

        int k14 = 10;
        int l14 = 15;
        int m14 = 20;
        division(k14, l14);
        division(l14, k14);
        division(k14, m14);
        division(m14, k14);
        division(l14, m14);
        division(m14, l14);

        printTaskNumber();

//        15.	Выполнить задание 18 из HW2 с помощью метода и параметров:
//
//        а) Создать переменные apple и  student и присвоить им значения 40 и 6 соответственно. Распечатать выражение:
//        Если … яблок(а) поделить на … учеников, то каждый ученик получит по … яблок(a), и … яблок(а) останется учителю.
//        Распечатать это же выражение со значениями 100 и 21.

        int apple = 40;
        int student = 6;

        appleStudent(apple, student);
        appleStudent(100, 21);

        printTaskNumber();

//        16.	Выполнить задание 18 из HW2 с помощью метода и параметров:
//
//        Написать метод так, чтобы правильные склонения слов (н-р, яблок или яблока) печатались автоматически
//        в зависимости от значений параметров.
//                Распечатать выражение с параметрами:
//        apple = 42, 55, 1
//        student = 42, 5, 2

        appleStudent16(42, 42);
        appleStudent16(55, 5);
        appleStudent16(1, 2);

        printTaskNumber();

//        17.	Напишите метод, который примет на вход параметр температуры в Цельсиях,
//                и распечатает результат температуры в Цельсиях и в Фаренгейтах.
        double celsius = 36.0;
        CelsiusToFahrenheit(36.0);

//        System.out.println(CelsiusToFahrenheit(36.0));
        System.out.println( celsius+ " " + (CelsiusToFahrenheit(36.0)));

        printTaskNumber();


//        а) Создать метод, который примет на вход параметр i и распечатает таблицу:
//
//
//        i ^ 2	значение i ^ 2

//
//
//        String line1 = "_____________________________";
//
//
//        System.out.println(line1);
//        System.out.println("|\tint min\t|\t" + min + "\t|");
//        System.out.println(line1);
//        System.out.println("|\tint max\t|\t" + max + "\t|");
//        System.out.println(line1);
//        System.out.println("|\t 1^2\t|\t" + 1^2 + "\t|");


//        b) поменять значение i и распечатать таблицу с новым значением i

      printTaskNumber();

//      19.	Напишите тест, который валидирует (проверит правильность работы) ваш код из задания №10.
//        Тестовые данные - 2, 5, 0.

        int n19 = 5;
        int expectedResult19 = 0;
        if (n % 2 == 0) {
            System.out.println(expectedResult = n * 2);
        } else {
            System.out.println(expectedResult = n * n);

        }





       printTaskNumber();

//       20.	Напишите тест, который валидирует ваш код из задания №11.
//        Придумайте тестовые данные. Выведите результат проверки на печать.
       printTaskNumber();
//        21.	Напишите алгоритм программы, которая проверяет число типа short на количество разрядов,
//        и выводит результат проверки.
//        ( Например, “It’s a two-digit number.”, “It’s a five-digit number.”, etc)
//        Выведите результат проверки на печать.


}





}











