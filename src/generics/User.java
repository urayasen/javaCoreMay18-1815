package generics;

import java.util.Collection;

public class User <T> {
    private T id;
    private String name;

    public User(T id, String name) {
        this.id = id;
        this.name = name;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public <X extends Collection<?>> void asdqwe(X x){
        System.out.println(x);
    }
}
