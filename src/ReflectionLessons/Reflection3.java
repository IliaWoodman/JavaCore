package ReflectionLessons;

import java.lang.reflect.Field;

public class Reflection3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Emp33 emp33 = new Emp33(3, "Dima", "It");
        Class emp = emp33.getClass();
        Field field = emp.getDeclaredField("salary");
        field.setAccessible(true);
        double salaryV = (Double) field.get(emp33);
        System.out.println(salaryV);
        field.set(emp33, 1500);
        System.out.println(emp33);
    }
}
