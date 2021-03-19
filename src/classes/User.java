package classes;

import enums.Sex;

public class User {
    private int id;
    private String name;
    private Sex sex;


    public static UserBuilder builder(){
        return new UserBuilder();
    }

    static class UserBuilder{

        private User user = new User();

        public UserBuilder id(int id){
            user.id = id;
            return this;
        }

        public UserBuilder name(String name){
            user.name = name;
            return this;
        }

        public UserBuilder sex(Sex sex){
            user.sex = sex;
            return this;
        }

        public User build(){
            return user;
        }

    }

}
