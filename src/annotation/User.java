package annotation;

public class User {
    @Validator(massage = "id is 0")
    private int id;
    private String name;

}
