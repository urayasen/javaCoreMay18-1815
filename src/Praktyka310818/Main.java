package Praktyka310818;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Car[] cars1 = {new Car("bmw", "i6",2001, new Engine(1.6, "benzyn")),
                new Car("audi", "t8",1998, new Engine(2.0, "soliara"))};
        Car[] cars2 = {new Car("mersedes", "k7",2002, new Engine(2.1, "benzyn")),
                new Car("mazda", "m10",1998, new Engine(2.2, "soliara"))};
        Car[] cars3 = {new Car("opel", "p10",2003, new Engine(2.3, "benzyn")),
                new Car("skoda", "f4",1998, new Engine(2.4, "soliara"))};
        Car[] cars4 = {new Car("ferrary", "k14",2011, new Engine(2.5, "benzyn")),
                new Car("astonvilla", "l17",1998, new Engine(2.6, "soliara"))};
        Car[] cars5 = {new Car("jeep", "s11",2012, new Engine(2.7, "benzyn")),
                new Car("lexus", "j8",2002, new Engine(2.8, "soliara"))};
        Car[] cars6 = {new Car("acura", "r8",2008, new Engine(2.9, "benzyn")),
                new Car("ford", "g8",2009, new Engine(3.0, "soliara"))};
        Car[] cars7 = {new Car("toyota", "p7",1999, new Engine(2.5, "benzyn")),
                new Car("jaguar", "t7",1997, new Engine(2.7, "soliara"))};
        Car[] cars8 = {new Car("mitsubishi", "w8",1996, new Engine(2.4, "benzyn")),
                new Car("hummer", "q8",1995, new Engine(2.3, "soliara"))};
        Car[] cars9 = {new Car("infiniti", "e7",2011, new Engine(2.2, "benzyn")),
                new Car("bentley", "r7",2012, new Engine(2.1, "soliara"))};
        Car[] cars10 = {new Car("maserati", "y8",2001, new Engine(2.7, "benzyn")),
                new Car("bentley", "r7",2002, new Engine(2.4, "soliara"))};
        Car[] cars11 = {new Car("lincoln", "f18",2010, new Engine(3.1, "benzyn")),
                new Car("lamborghini", "l7",2001, new Engine(3.2, "soliara"))};
        Car[] cars12 = {new Car("porsche", "t12",2002, new Engine(3.3, "benzyn")),
                new Car("rolls-royce", "r15",2003, new Engine(3.4, "soliara"))};
        Car[] cars13 = {new Car("invista", "v19",2007, new Engine(3.5, "benzyn")),
                new Car("vector wiegert", "r15",2006, new Engine(3.6, "soliara"))};
        Car[] cars14 = {new Car("invista", "n18",2017, new Engine(2.4, "benzyn")),
                new Car("saleen", "m17",2018, new Engine(2.8, "soliara"))};
        Car[] cars15 = {new Car("cadillac", "s8",2015, new Engine(2.1, "benzyn")),
                new Car("chevrolet", "a1",2014, new Engine(2.3, "soliara"))};
        Car[] cars16 = {new Car("sallen", "s7",2012, new Engine(2.4, "benzyn")),
                new Car("spyker", "c8",2013, new Engine(2.7, "soliara"))};
        Car[] cars17 = {new Car("vector wiegert", "p7",2015, new Engine(2.6, "benzyn")),
                new Car("tvr tuscan", "z7",2014, new Engine(2.5, "soliara"))};
        Car[] cars18 = {new Car("mclaren", "n7",2015, new Engine(2.7, "benzyn")),
                new Car("maybach", "f8",2016, new Engine(2.9, "soliara"))};
        Car[] cars19 = {new Car("ascari", "n7",2003, new Engine(2.4, "benzyn")),
                new Car("aston martin", "kz1",2005, new Engine(2.1, "soliara"))};
        Car[] cars20 = {new Car("dauer", "l3",2007, new Engine(2.2, "benzyn")),
                new Car("dodge", "g8",2010, new Engine(2.5, "soliara"))};





        Pet[] pets1 = {new Pet("Jack"), new Pet("Lusi")};
        Pet[] pets2 = {new Pet("Sultan"), new Pet("Lika")};
        Pet[] pets3 = {new Pet("Rex"), new Pet("Mery")};
        Pet[] pets4 = {new Pet("Max"), new Pet("Jeni")};
        Pet[] pets5 = {new Pet("Bob"), new Pet("Jenifer")};
        Pet[] pets6 = {new Pet("Jef"), new Pet("Peti")};
        Pet[] pets7 = {new Pet("Sem"), new Pet("Lili")};
        Pet[] pets8 = {new Pet("Ted"), new Pet("Lara")};
        Pet[] pets9 = {new Pet("Jorge"), new Pet("Keti")};
        Pet[] pets10 = {new Pet("Sad"), new Pet("Hili")};
        Pet[] pets11 = {new Pet("Ronald"), new Pet("Enn")};
        Pet[] pets12 = {new Pet("Kein"), new Pet("Emm")};
        Pet[] pets13 = {new Pet("Avel"), new Pet("Demi")};
        Pet[] pets14 = {new Pet("Donald"), new Pet("Sara")};
        Pet[] pets15 = {new Pet("Anton"), new Pet("Klara")};
        Pet[] pets16 = {new Pet("Pit"), new Pet("Jeni")};
        Pet[] pets17 = {new Pet("Ted"), new Pet("Mery")};
        Pet[] pets18 = {new Pet("Bob"), new Pet("Lusi")};
        Pet[] pets19 = {new Pet("Rex"), new Pet("Lili")};
        Pet[] pets20 = {new Pet("Max"), new Pet("Peti")};




        User user1 = new User("John", "Makkein", true, cars1, pets1);

        user1.setUsers(new User[]{new User("Sara", "Makkein", false, cars2, pets2),
                new User("Jen", "Makkein", false, cars3, pets3)});

        User user2 = new User("George","Bush", false,  cars4, pets4);
        user2.setUsers(new User[]{new User("Lora", "Bush", true, cars5, pets5)});

        User user3 = new User("Barack", "Obama", true, cars6, pets6);
        user3.setUsers(new User[]{new User("Mishel", "Obama", false, cars7, pets7),
        new User("Malia","Obama", false, cars8, pets8),
        new User("Natasha","Obama", true, cars9, pets9)});

        User user4 = new User("Donald", "Trump", true, cars10,
            new User[]{new User("Melania", "Trump", false, cars11, pets11),
                       new User("Ivanka", "Trump", true, cars12, pets12),
                       new User("Donald", "Trump younger", true, cars13, pets13),
                       new User("Tiffani", "Trump", false, cars14, pets14),
                       new User("Erik", "Trump", true, cars15, pets15),
                       new User("Berron", "Trump", false, cars16, pets16)},pets10);

        User user5 = new User("Bill", "Clinton", true, cars17,
                new User[]{new User("Hillari", "Clinton", true, cars18, pets18),
                           new User("Chelsi", "Clinton", false, cars19, pets19),
                           new User("Tom", "Clinton", false, cars20, pets20)},pets17);

        System.out.println(user5);

        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);


//        users
//                .stream()
//                .sorted(new Comparator<User>() {
//                    @Override
//                    public int compare(User o1, User o2) {
//                        for (Car caro1 : o1.getCars()) {
//
//                        }
//
//                    }
//                });


        ArrayList<Car> userCars = new ArrayList<>();
        for (User user : users) {
            for (User newUser : user.getUsers()) {
                for (Car car : newUser.getCars()) {
                    userCars.add(car);
                }
            }
        }
        List<Car> carListSorted = userCars
                .stream()
                .sorted((o1, o2) -> o1.getYear() - o2.getYear())
                .collect(Collectors.toList());
        System.out.println(carListSorted);

        List<Car> carListFiltered = userCars
                .stream()
                .filter(car -> car.getYear() > 2000)
                .collect(Collectors.toList());

        System.out.println(carListFiltered);


        List<User> userListFiltered = users
                .stream()
                .filter(user -> user.getUsers().length < 3)
                .collect(Collectors.toList());
        System.out.println();
        System.out.println(userListFiltered);
    }
}
