package pl.sda.CodeWars;

import java.util.Arrays;
import java.util.Comparator;

public class HighestWordScore {
    public static String high(String e){
        return Arrays.stream(e.split(" "))
                .max(Comparator.comparingInt(
                        a -> a.chars().map(i -> i -96).sum()
                )).get();
    }
}
