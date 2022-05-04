package homework;

import static utils.Utils.line;
import static utils.Utils.printTaskNumber;

public class HW10 {
    // Написать алгоритм CapitalizeWords, который принимает на вход предложение
// с единичным пробелом между словами,
// и возвращает предложение, в котором все слова написаны с большой буквы
// "        happy birthday!  " --> "Happy Birthday!"
// "     john jacob smith jr." --> "John Jacob Smith Jr."

    //пустой String = "";
    //String str = null;

    public static String capitalizeWords(String sentence) {
        if (sentence != null) {
            sentence = sentence.trim();

            if (sentence.length() != 0) {
                //Character.toString(sentence.charAt(0)).toUpperCase()
                sentence = sentence.substring(0, 1).toUpperCase() + sentence.substring(1);

                for (int i = 1; i < sentence.length(); i++) {
                    if (sentence.charAt(i) == ' ') {
                        sentence = sentence.substring(0, i + 1) + sentence.substring(i + 1, i + 2).toUpperCase() + sentence.substring(i + 2);
                    }
                }

                return sentence;
            }

            return "";
        }

        return "";
    }

//    Написать метод, который принимает на вход строку.
//    Если строка не пустая (проверить методом из видео),
//    то примените метод по удалению пробелов в начале строки и в конце строки.
//    Догадаться, каким методом из видео можно проверить, были ли пробелы.
//    Если пробелы были, то метод должен вернуть сообщение: “Лишние пробелы удалены”.
//    Если пробелов не было, вернуть сообщение “Пробелов не было”.
//    Если строка пустая, вернуть сообщение “Строка пустая”.
//
//    Test Data:
//            “    QA4Everyone   “ → “Лишние пробелы удалены”
//            “QA4Everyone“ → “Пробелов не было”
//            “” → “Строка пустая”

    public static String removeSpacesOfString(String abc) {
        String trimmedString = abc.trim();
        if (abc.isEmpty()) {
            return "Строка пустая";
        }

        if (trimmedString.equals(abc)) {

            return "Пробелов не было";
        }
        return "Лишние пробелы удалены";

    }

//    2.	Написать алгоритм RemoveAlla.
//    С помощью методов из видео1,
//    написать алгоритм, который принимает на вход строку.
//    Если строка валидная, то метод удаляет все буквы a из строки, если таковые имеются.
//    Метод возвращает обработанную строку.
//    Test Data:
//            “    QA4Everyone   “ →  “QA4Everyone“
//            “panda   “ → “pnd”

    public static String RemoveAlla(String str) {
        if (str.isEmpty()) {
            System.out.println(str.trim());

        }

        return str.trim().replace("a", "");
    }

//    3.	Написать алгоритм RemoveAllZeros.
//    С помощью методов из видео1,  написать алгоритм,
//    который принимает на вход строку, состоящую из цифр.
//    Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
//    Метод возвращает обработанную строку, в которой нет нулей.
//    Test Data:
//            “   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 “ →  “35429764“
//            “ 0000000111“ → “111”

    public static String RemoveAllZeros(String str) {
        if(str.isEmpty()){
            return "error";
        }
        return str.replaceAll("\\s", "").replace("0","");
    }

//    4.	Написать алгоритм RemoveAllSpaces.
//    С помощью методов из видео1,  написать алгоритм, который принимает на вход строку.
//    Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
//    Метод возвращает обработанную строку.
//    Test Data:
//            “    QA   4  Everyone   “ →  “QA4Everyone“
//            “p a     n d a   “ → “panda”

    public static String RemoveAllSpaces(String str){
        if(str.isEmpty()) {
            return "error";
        }

        return str.replaceAll("\\s", "");
    }




    public static boolean isPositiveNumber(int number) {

        return number >= 0;
    }

    // num1 >= num2 ? num1 : num2


    public static void main(String[] args) {
//        System.out.println("        happy birthday!  ");
//        System.out.println(capitalizeWords("        happy birthday!  "));
        System.out.println(capitalizeWords(""));
        System.out.println(capitalizeWords(null));
//        System.out.println(capitalizeWords("     john jacob smith jr."));
        System.out.println(capitalizeWords(" "));

        System.out.println(isPositiveNumber(8));

        printTaskNumber();

        //    Написать метод, который принимает на вход строку.
//    Если строка не пустая (проверить методом из видео),
//    то примените метод по удалению пробелов в начале строки и в конце строки.
//    Догадаться, каким методом из видео можно проверить, были ли пробелы.
//    Если пробелы были, то метод должен вернуть сообщение: “Лишние пробелы удалены”.
//    Если пробелов не было, вернуть сообщение “Пробелов не было”.
//    Если строка пустая, вернуть сообщение “Строка пустая”.
//
//    Test Data:
//            “    QA4Everyone   “ → “Лишние пробелы удалены”
//            “QA4Everyone“ → “Пробелов не было”
//            “” → “Строка пустая”
        String str = "    QA4Everyone   ";
        System.out.println(removeSpacesOfString(str));
        line();
        String str1 = "QA4Everyone";
        System.out.println(removeSpacesOfString(str1));
        line();
        String str3 = "";
        System.out.println(removeSpacesOfString(str3));

        printTaskNumber();

        //    2.	Написать алгоритм RemoveAlla.
//    С помощью методов из видео1,
//    написать алгоритм, который принимает на вход строку.
//    Если строка валидная, то метод удаляет все буквы a из строки, если таковые имеются.
//    Метод возвращает обработанную строку.
//    Test Data:
//            “    QA4Everyone   “ →  “QA4Everyone“
//            “panda   “ → “pnd”

        String a = "panda";
        System.out.println(RemoveAlla(a));
        line();
        String a1 = "    QA4Everyone   ";
        System.out.println(RemoveAlla(a1));

        printTaskNumber();

//        3.	Написать алгоритм RemoveAllZeros.
//                С помощью методов из видео1,  написать алгоритм,
//                который принимает на вход строку, состоящую из цифр.
//        Если строка валидная, то метод удаляет все пробелы из строки,
//        если таковые имеются. Метод возвращает обработанную строку, в которой нет нулей.
//                Test Data:
// “   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 “ →  “35429764“
//“ 0000000111“ → “111”
        String b = "   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 ";
        System.out.println(RemoveAllZeros(b));
        line();
        String c = " 0000000111";
        System.out.println(RemoveAllZeros(c));

        printTaskNumber();

//        4.	Написать алгоритм RemoveAllSpaces.
//                С помощью методов из видео1,
//        написать алгоритм, который принимает на вход строку.
//        Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
//        Метод возвращает обработанную строку.
//        Test Data:
//         “    QA   4  Everyone   “ →  “QA4Everyone“
//             “p a     n d a   “ → “panda”

        String st = "    QA   4  Everyone   ";
        System.out.println(RemoveAllSpaces(st));
        line();
        String st1 = "p a     n d a   ";
        System.out.println(RemoveAllSpaces(st1));
        String st3 = "";
        line();
        System.out.println(RemoveAllSpaces(st3));

        printTaskNumber();













    }

}





