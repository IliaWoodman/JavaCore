package RegExLesson;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx2 {
    public static void main(String[] args) {
        String s1 = "abcd abce abc5abcg6abch";
        Pattern pattern1 = Pattern.compile("\\w+");
        Matcher matcher = pattern1.matcher(s1);

        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + " " + matcher.group());
        }
    }
}
/*
 * ABC - соответствует послеовательно идущим ABC
 * [ABC] - соответствует или А или В или С
 * [A-E] - соответствует одной из букв из диапазона А - Е
 * [1-6] - соответствует одной из цифр из диапазона 1 - 6
 * [^1-6] - не соответствует одной из цифр из диапазона 1 - 6
 * [B-Fd-j3-8] - соотвутствует одной из букв из обоих диапазонов или одной из цифр из диапазона 3-8
 * a|b - соответствует либо а либо b
 * . -  соответствует любому символу
 * ^abc - соотвутствет выражению в начале строки
 * vcc$ - соответствует выражению в конце строки
 * \d  - соответствует одной цифре
 * \D - соответствует одной НЕ цифре
 * \w - соответствует одной букве, цифре или "_"
 * \W - соответствует одному символу, который НЕ буква, НЕ цифра и НЕ "_"
 * \s - соответствует пробельному символу
 * \S - соответствует НЕ пробельному символу
 * выражение+ - соответствует 1 или большему количеству повторений
 * выражение? - соответствует 0 или 1 повторению
 * выражение* - соответствует 0 или большему количеству повторений
 * выражение{n} - соответствует количеству повторений n
 * выражение{m, n} - соответствует количеству повторений от m до n
 * выражение{n,} - соответствует количеству повторений n или больше
 * \A - соответствует выражению в начале Сринга
 * \Z - соответствует выражению в конце Стринга
 * \b - соответствует границе слова или числа
 * \B - соответствует границе НЕ слова и НЕ числа
 *  */