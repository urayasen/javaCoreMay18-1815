package string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String s1 = "oktenweb";
        String s2 = "oktenweb";
        String s3 = new String("oktenweb");
        System.out.println(s1 == s2);//true місцезнаходження ячеек
        System.out.println(s1 == s3);//false


        boolean empty = s1.isEmpty();
        System.out.println(empty);


        String toUpperCase = s1.toUpperCase();
        System.out.println(toUpperCase);
        String toLowerCase = s1.toLowerCase();
        System.out.println(toLowerCase);


//        int ok = s1.indexOf("e",4);
        int ok = s1.indexOf(119,4);
        System.out.println(ok);

        char c = s1.charAt(5);
        System.out.println(c);

        String replace = s1.replace("e", "!");
        System.out.println(replace);

        int length = s1.length();
        //ctrl+alt+v
        System.out.println(length);

        boolean ok1 = s1.contains("ok");
        System.out.println(ok1);

        String substring = s1.substring(3, 8);
        System.out.println(substring);

        String[] es = s1.split("e");
        System.out.println(Arrays.toString(es));

        String info = "vasya pupkin 32";
        //ctrl+p
        String[] split = info.split(" "/* тут натиснути ctrl+p*/);
        System.out.println(Arrays.toString(split));


        String email = "name.surname@host.zone";
        email.matches("[a-zA-Z]{1,12}\\.[a-z0-9A-Z]{1,12}@[a-z]{1,5}\\.[a-z]{1,5}([a-z]{1,5})?");

    }
}
