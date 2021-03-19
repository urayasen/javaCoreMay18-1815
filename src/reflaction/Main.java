package reflaction;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        System.out.println(Person.class);
        Person person = new Person("alibaba");
        Class<? extends Person> personReflect = person.getClass();
        System.out.println(personReflect);

        Field[] fields = personReflect.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println(field.getType() + "  " + field.getName() + " " + field.get(person));
        }

        System.out.println(person);

        Field name = personReflect.getDeclaredField("name");
        name.setAccessible(true);
        name.set(person, "gghgfmhbhghgj");

        System.out.println(person);

        Method[] methods = personReflect.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName()
            + "  " +
            method.getParameterCount());

            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println(parameter.getType() + " " + parameter.getName());
            }
        }

        Class<?>[] interfaces = personReflect.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface.getName());
        }

    }
}
