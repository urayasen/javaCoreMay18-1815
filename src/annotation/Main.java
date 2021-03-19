package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        User user = new User();
//ctrl+alt+v
        Class<? extends User> uzer = user.getClass();
        //Handler - обробник
        Field[] declaredFields = uzer.getDeclaredFields();
        for (Field field : declaredFields)
            if (field.isAnnotationPresent(Validator.class)) {
                System.out.println("111111");
                field.setAccessible(true);
                if (field.getType().toString().equals("int")) {

                    int i = (int) field.get(user);

                    if (i == 0) {

                        Validator annotation = field.getAnnotation(Validator.class);
                        String massage = annotation.massage();
                        System.out.println(massage);
                    }

                }
            }
    }
}

