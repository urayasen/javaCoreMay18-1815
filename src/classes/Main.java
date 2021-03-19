package classes;

import enums.Sex;

public class Main {
    public static void main(String[] args) {

//        class LocalUser{
//            private int id;
//            private String name;
//
//            public LocalUser(int id, String name) {
//                this.id = id;
//                this.name = name;
//            }
//
//            LocalUser localUser = new LocalUser(1, "hhgg");
//
//        }


//        A.B b = new A().new B();
//        A.B b = new A.B();

        User kokos = User
                        .builder()
                        .id(100)
                        .sex(Sex.MALE)
                        .name("kokos")
                        .build();

    }
}
