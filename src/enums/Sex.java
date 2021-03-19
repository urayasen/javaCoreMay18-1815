package enums;

public enum Sex {
    MALE(63), FEMALE(68);

    private int life;

//    Sex(){}

    Sex(int life) {
        this.life = life;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

}
