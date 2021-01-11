package AnnotationsLessons;

import java.lang.annotation.*;

public class Test2 {
    public static void main(String[] args) {
        Class xiaomiClass = Xiaomi.class;
        Class iphoneClass = Iphone.class;
        SmartPhone a1 = (SmartPhone) xiaomiClass.getAnnotation(SmartPhone.class);
        SmartPhone a2 = (SmartPhone) iphoneClass.getAnnotation(SmartPhone.class);
        System.out.println(a1);
        System.out.println(a2);
    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {
    String OS() default "Android";

    int yearOfCompanyCreation() default 2000;
}

@SmartPhone
class Xiaomi {
    String name;
    double price;
}

@SmartPhone(OS = "IOS", yearOfCompanyCreation = 1976)
class Iphone {
    String name;
    double price;
}
