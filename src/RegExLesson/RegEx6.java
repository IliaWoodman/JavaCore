package RegExLesson;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx6 {
    public static void main(String[] args) {
        String s = "12347836398373640325987"+"98765748290983121224765"+"54637281983746571122543";
        Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(s);
//        String newStr = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7); "); //$n - это группа, на 9 строке г руппой является то что в скобках
//        System.out.println(newStr);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
