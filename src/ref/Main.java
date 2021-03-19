package ref;

public class Main {
    public static void main(String[] args) {

        User user = new User(1, "vasia");
        Class<? extends User> userReflection = user.getClass();


    }
}
