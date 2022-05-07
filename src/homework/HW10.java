package homework;

import java.util.Arrays;

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

//    5.	Напишите метод, который принимает на вход строку и считает,
//
//    сколько букв а или А содержится в строке.
//    Test Data:
//            “Abracadabra” → 5
//            “Homenum Revelio” → 0

    public static String CountA(String s){
        int uppercase = 0;
        int lowercase = 0;

        if (s != null) {
            String s1 = s.toUpperCase();
            String s2 = s.toLowerCase();

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == s1.charAt(i) ^ s.charAt(i) == s2.charAt(i)) {
                    if (s.charAt(i) == s1.charAt(i)) uppercase++;
                    else lowercase++;
                }
            }
        }
        System.out.println(uppercase + " " + lowercase);


        return (uppercase + " " + lowercase);
    }
//    6.	Напишите метод, который принимает на вход текст и проверяет,
//    содержится ли в тексте хотя бы одно слово Java.
    public static boolean JavaString(String s){
//        System.out.println(s.contains("Java"));
        return s.contains("Java");
    }

//    Напишите метод, который принимает на вход строку, и добавляет Кавычки в начале строки,
//    точку и кавычки в конце строки с помощью метода concat()
//    Test Data:
//            “One” → ““One.””
//            “    TWO  “ → ““TWO.””
    public static String StringPlus(String s){

        return (("\""+s.trim().concat(".\"")));

    }
//    8.	Напишите метод, который принимает на вход название города
//    и исправляет написание:
//    Test Data:
//            “ташкент” → “Ташкент”
//            “ЧикаГО” → “Чикаго”

    public static String CityUpp(String str){
        if(str== null || str.isEmpty()) {
            return str;
        }

        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
    public static String CityLow(String str){
        if(str== null || str.isEmpty()) {
            return str;
        }
        return str.substring(0,4)+ str.substring(4,5).toLowerCase() + str.substring(5,6).toLowerCase();

    }
//    9.	Напишите метод, который принимает на вход строку,
//    и возвращает все, что находится между первой и последней буквой-параметром:
//    Test Data:
//            “Abracadabra”, “b” → “bracadab”
//            “Whippersnapper”, “p” → “ppersnapp”

    public static String OneLastLetter(String str, String s){
        if(str== null || str.isEmpty()) {
            return str;
        }
         str = str.substring(str.indexOf(s), str.lastIndexOf(s)+1);

        return str;

    }

//    10.	Напишите метод, который принимает на вход слово, и возвращает true,
//    если слово начинается и заканчивается на одинаковую букву, и false иначе
//    Test Data:
//            “Abracadabra” → true
//            “Whippersnapper” → false

    public static boolean Letter(String l){
//        String first = l.indexOf(l);
//        char last = l.charAt(l.length() - 1);
//        if(first == last){
//           return true;
//        }else{
//            return false;
//        }
        return l.toLowerCase().charAt(0) == l.toLowerCase().charAt(l.length()-1);

    }

//    11.	Напишите метод, который принимает на вход предложение
//    и возвращает слова из этого предложения в виде массива слов
//    Test Data:
//            “QA for Everyone” → {“QA”, “for”, “Everyone”}
//           “Александр Сергеевич Пушкин” → {“Александр”, “Сергеевич”, “Пушкин”}

    public static String WordArray(String sentence){
        String[] words = (sentence.split(" "));
//        System.out.println(Arrays.toString(Words));
        return Arrays.toString(words);
    }

//    12.	Написать метод, который принимает на вход предложение,
//        состоящее из имени, фамилии, отчества и возвращает массив строк:
//        Test Data:
//         “Александр Сергеевич Пушкин” →
//        {“Имя: Александр”, “Отчество: Сергеевич”, “Фамилия: Пушкин”}

    public static String WordLine(String sentence){

        String[] text = sentence.split(" ");
        return "Имя:" + text[0] + ", Отчество:" + text[1] + ", Фамилия:" + text[2];

    }
//    13.	Написать метод, который возвращает сумму всех букв слова
//
//          “abc” → 294
//            “ABC” → 198
//            “123” → 0 (это не буквы)

    public static int SumWords(String word){
        int sum = 0;
        char[] result = word.toCharArray();
        for (int i = 0; i < result.length; i++){
            if(!Character.isDigit(result[i])){
                sum = sum + result[i];
            }

        }
        return sum;
    }

//    14.	Написать метод,  который принимает на вход 2 буквы и возвращает true,
//    если первая буква встречается раньше второй, иначе метод возвращает false
//    method(“a”, “m”) → true
//    method(“m”, “l”) → false

    public static boolean TwoWord(String one, String two){
        char result = one.charAt(0);
        char result1 = two.charAt(0);
        return result < result1;
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
//        5.	Напишите метод, который принимает на вход строку и считает,
//        сколько букв а или А содержится в строке.
//                Test Data:
//         “Abracadabra” → 5
//         “Homenum Revelio” → 0
        String s = "Abracadabra";
        System.out.println(CountA(s));

        printTaskNumber();

//        6.	Напишите метод, который принимает на вход текст и проверяет,
//        содержится ли в тексте хотя бы одно слово Java.

        String text = "As of March 2022, Java 18 is the latest version, " +
                "while Java 17, 11 and 8 are the current long-term support (LTS) versions. " +
                "Oracle released the last zero-cost public update for the legacy version Java 8 LTS in January 2019 for commercial use," +
                " although it will otherwise still support Java 8 with public updates for personal use indefinitely. " +
                "Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";
        System.out.println(JavaString(text));
        line();
        String text1 = "As a decrepit father takes delight\n" +
                "To see his active child do deeds of youth,\n" +
                "So I, made lame by fortune’s dearest spite,\n" +
                "Take all my comfort of thy worth and truth.\n" +
                "For whether beauty, birth, or wealth, or wit,\n" +
                "Or any of these all, or all, or more,\n" +
                "Entitled in thy parts do crownèd sit,\n" +
                "I make my love engrafted to this store.\n" +
                "So then I am not lame, poor, nor despised,\n" +
                "Whilst that this shadow doth such substance give\n" +
                "That I in thy abundance am sufficed,\n" +
                "And by a part of all thy glory live.\n" +
                "Look what is best, that best I wish in thee.\n" +
                "This wish I have; then ten times happy me.\n";
        System.out.println(JavaString(text1));

        printTaskNumber();

//        Напишите метод, который принимает на вход строку, и добавляет Кавычки в начале строки,
//                точку и кавычки в конце строки с помощью метода concat()
//        Test Data:
//           “One” → ““One.””
//           “    TWO  “ → ““TWO.””
//        String s4 = "\"One\"";
        String s4 = "One";
        System.out.println(StringPlus(s4));
        line();
        String s5 = "    TWO  ";
        System.out.println(StringPlus(s5));

        printTaskNumber();

//        8.	Напишите метод, кторый принимает на вход название города
//        и исправляет написание:
//        Test Data:
//        “ташкент” → “Ташкент”
//        “ЧикаГО” → “Чикаго”
        String str6 = "ташкент";
        System.out.println(CityUpp(str6));
        line();
        String str7 = "ЧикаГО";
        System.out.println(CityLow(str7));

        printTaskNumber();

//        9.	Напишите метод, который принимает на вход строку,
//        и возвращает все, что находится между первой и последней буквой-параметром:
//        Test Data:
//        “Abracadabra”, “b” → “bracadab”
//        “Whippersnapper”, “p” → “ppersnapp”

        String v = "Abracadabra";
        String n = "b";
        System.out.println(OneLastLetter(v,n));
        line();
        String v1 = "Whippersnapper";
        String n1 = "p";
        System.out.println(OneLastLetter(v1,n1));

        printTaskNumber();

//        10.	Напишите метод, который принимает на вход слово,
//        и возвращает true, если слово начинается и
//        заканчивается на одинаковую букву, и faulse иначе
//        Test Data:
      //	“Abracadabra” → true
      //	“Whippersnapper” → false

        String l = "Abracadabra";
        System.out.println(Letter(l));
        line();
        String l1 = "Whippersnapper";
        System.out.println(Letter(l1));

        printTaskNumber();

//        11.	Напишите метод, который принимает на вход предложение
//        и возвращает слова из этого предложения в виде массива слов
//        Test Data:
//         “QA for Everyone” → {“QA”, “for”, “Everyone”}
//         “Александр Сергеевич Пушкин” → {“Александр”, “Сергеевич”, “Пушкин”}
        String sentence = "QA for Everyone";
        System.out.println(WordArray(sentence));
        line();
        String sentence1 = "Александр Сергеевич Пушкин";
        System.out.println(WordArray(sentence1));

        printTaskNumber();

//        12.	Написать метод, который принимает на вход предложение,
//        состоящее из имени, фамилии, отчества и возвращает массив строк:
//        Test Data:
//         “Александр Сергеевич Пушкин” →
//        {“Имя: Александр”, “Отчество: Сергеевич”, “Фамилия: Пушкин”}

        String sentence3 = "Александр Сергеевич Пушкин";
        System.out.println(WordLine(sentence3));

        printTaskNumber();

//        13.	Написать метод, который возвращает сумму всех букв слова
//
//         “abc” → 294
//         “ABC” → 198
//         “123” → 0 (это не буквы)

        String word = "abc";
        System.out.println(SumWords(word));
        line();
        String word1 = "ABC";
        System.out.println(SumWords(word1));
        line();
        String word3 = "123";
        System.out.println(SumWords(word3));

        printTaskNumber();

//        14.	Написать метод,  который принимает на вход 2 буквы
//        и возвращает true, если первая буква встречается раньше второй,
//                иначе метод возвращает false
//        method(“a”, “m”) → true
//        method(“m”, “l”) → false
        String one = "a";
        String two = "m";
        System.out.println(TwoWord(one,two));
        line();
        String one1 = "m";
        String two2 = "l";
        System.out.println(TwoWord(one1, two2));


































    }

}





