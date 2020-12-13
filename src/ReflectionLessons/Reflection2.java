package ReflectionLessons;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class empClass = Class.forName("ReflectionLessons.Emp33");

        Constructor<Emp33> constructor = empClass.getConstructor();
        Emp33 e1 = constructor.newInstance();

        Constructor constructor2 = empClass.getConstructor(int.class, String.class, String.class);
        Object o1 = constructor2.newInstance(5,"Vasya", "IT");

        System.out.println(o1);

        Method m1 = empClass.getDeclaredMethod("setSalary", double.class);
        m1.invoke(o1, 888.80);
        System.out.println(o1);
    }
}
