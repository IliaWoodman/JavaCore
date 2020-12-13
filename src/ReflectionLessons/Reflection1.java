package ReflectionLessons;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Reflection1 {
    //    Рефлексия - это механизм исследования данных о программе во время её выполнения.
    //    Рефлексия позволяет исследовать информацию о полях, методах, конструкторах и других составляющих классов
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class emp33Class = Class.forName("ReflectionLessons.Emp33");
//        //либо
//        Class emp33Class2 = Emp33.class;
//        //либо
//        Class emp33Class3 = new Emp33().getClass();
        Field field = emp33Class.getField("id");
        System.out.println("Type of id field = " + field.getType());

        Field [] fields = emp33Class.getDeclaredFields();
        for (Field f : fields){
            System.out.println(f.getName());
            System.out.println(f.getType());
            System.out.println(f.getClass());
            System.out.println();
        }

        Method method1 = emp33Class.getMethod("increaseSalary");
        System.out.println(method1.getReturnType());
        System.out.println(Arrays.toString(method1.getParameterTypes()));

        Method method2 = emp33Class.getMethod("setSalary", double.class);
        System.out.println(method2.getReturnType());
        System.out.println(Arrays.toString(method2.getParameterTypes()));


        Method [] methods = emp33Class.getDeclaredMethods();
        for (Method m : methods){
            System.out.println("Name = " + m.getName());
            System.out.println("Type = " + m.getReturnType());
            System.out.println("Type = " + Arrays.toString(m.getParameterTypes()));
            System.out.println();
        }


        Method [] methods2 = emp33Class.getDeclaredMethods();
        for (Method m : methods2){
            if (Modifier.isPrivate(m.getModifiers())) {
                System.out.println("Name = " + m.getName());
                System.out.println("Type = " + m.getReturnType());
                System.out.println("Type = " + m.getModifiers());
                System.out.println("Type = " + Arrays.toString(m.getParameterTypes()));
                System.out.println();
            }
        }

        Constructor constructor = emp33Class.getConstructor();
        System.out.println(constructor.getParameterCount());
        System.out.println(Arrays.toString(constructor.getParameterTypes()));

        Constructor constructor2 = emp33Class.getConstructor(int.class, String.class, String.class);
        System.out.println(constructor2.getParameterCount());
        System.out.println(Arrays.toString(constructor2.getParameterTypes()));

        Constructor[] constructors = emp33Class.getConstructors();
        for (Constructor c : constructors){
            System.out.println(c.getParameterTypes());
            System.out.println(c.getParameterCount());
            System.out.println(c.getName());
        }
    }
}
