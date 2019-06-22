package pl.sda.AdditionalTasks.Zoo;

import java.util.Objects;

public class Bear extends Animal {
    private int furLenght;

    public Bear(String name, float weight, int furLenght) {
        super(name, weight);
        this.furLenght = furLenght;
    }

    public int getFurLenght() {
        return furLenght;
    }
}
