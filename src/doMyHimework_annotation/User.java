package doMyHimework_annotation;

public class User {
    @Contains(field = "str1")
    private  String str1;
    @Contains(field = "str2")
    private String str2;



    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }

    @Override
    public String toString() {
        return "User{" +
                "str1='" + str1 + '\'' +
                ", str2='" + str2 + '\'' +
                '}';
    }
}
