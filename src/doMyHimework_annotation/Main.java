package doMyHimework_annotation;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        String row = "!@#$%^&*()";
        User user = new User();
        Class<? extends User> uzer = user.getClass();
        Field[] declaredFields = uzer.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            if (declaredField.isAnnotationPresent(Contains.class)) {
                declaredField.setAccessible(true);
                System.out.println(declaredField.getType().toString());
                if (declaredField.getType().toString().equals("java.lang.String")) {
                    System.out.println("2222222");
                    String s = (String) declaredField.get(user);
                    if (s == null) {
                        Contains annotation = declaredField.getAnnotation(Contains.class);
                        String field = annotation.field();
                        System.out.println(field);

                    }

                }
            }

        }
    }
}
