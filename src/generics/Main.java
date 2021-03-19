package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        User<Integer> integerUser = new User<>(123, "asd");
        User<String> stringUser = new User<>("dfdkj123", "kokos");
        User<UUID> uuidUser = new User<>(new UUID(123,35), "yyggfgh");


        integerUser.asdqwe(strings);

    }
}
