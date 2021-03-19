package Praktyka310818;

import java.util.Objects;

public class Engine {
    private double volume;
    private String type;

    public Engine(double volume, String type) {
        this.volume = volume;
        this.type = type;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Engine)) return false;
        Engine engine = (Engine) o;
        return Double.compare(engine.getVolume(), getVolume()) == 0 &&
                Objects.equals(getType(), engine.getType());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getVolume(), getType());
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", type='" + type + '\'' +
                '}';
    }
}
