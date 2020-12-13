package RegExLesson;

import java.util.regex.Pattern;

public class RegEx4 {
    void checkIp(String ip){
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";
        System.out.println(ip + " is OK? " + Pattern.matches(regex, ip));
    }
    public static void main(String[] args) {
        //0-255.0-255.0-255.0-255
        String ip1 = "255.38.192.99";
        String ip2 = "182.262.91.04";
        RegEx4 regEx4 = new RegEx4();
        regEx4.checkIp(ip1);
        regEx4.checkIp(ip2);

    }
}
