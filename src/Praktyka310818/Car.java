package Praktyka310818;

import java.util.Objects;

public class Car {
    private String marka;
    private String model;
    private int year ;
    private Engine engine;

    public Car(String marka, String model, int year, Engine engine) {
        this.marka = marka;
        this.model = model;
        this.year = year;
        this.engine = engine;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getYear() == car.getYear() &&
                Objects.equals(getMarka(), car.getMarka()) &&
                Objects.equals(getModel(), car.getModel()) &&
                Objects.equals(getEngine(), car.getEngine());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getMarka(), getModel(), getYear(), getEngine());
    }

    @Override
    public String toString() {
        return "\n  Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                '}';
    }
}
