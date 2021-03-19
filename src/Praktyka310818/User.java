package Praktyka310818;

import java.util.Arrays;
import java.util.Objects;

public class User {
    private String name;
    private String surname;
    private boolean status;
    private Car[] cars;
    private User[] users;
    private Pet[] pets;

    public User(String name, String surname, boolean status, Car[] cars, User[] users, Pet[] pets) {
        this.name = name;
        this.surname = surname;
        this.status = status;
        this.cars = cars;
        this.users = users;
        this.pets = pets;
    }

    public User(String name, String surname, boolean status, Car[] cars, Pet[] pets) {
        this.name = name;
        this.surname = surname;
        this.status = status;
        this.cars = cars;
        this.pets = pets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public Pet[] getPets() {
        return pets;
    }

    public void setPets(Pet[] pets) {
        this.pets = pets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return isStatus() == user.isStatus() &&
                Objects.equals(getName(), user.getName()) &&
                Objects.equals(getSurname(), user.getSurname()) &&
                Arrays.equals(getCars(), user.getCars()) &&
                Arrays.equals(getUsers(), user.getUsers()) &&
                Arrays.equals(getPets(), user.getPets());
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(getName(), getSurname(), isStatus());
        result = 31 * result + Arrays.hashCode(getCars());
        result = 31 * result + Arrays.hashCode(getUsers());
        result = 31 * result + Arrays.hashCode(getPets());
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", status=" + status +
                ",\n cars=" + Arrays.toString(cars) +
                ",\n pets=" + Arrays.toString(pets) +
                ",\n users=" + Arrays.toString(users) +
                '}';
    }


}
