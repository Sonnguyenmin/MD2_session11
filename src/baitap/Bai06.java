package baitap;

import java.util.*;

public class Bai06 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6, 4, 5, 6, 15, 8, 9, 10, 13, 12, 16));

        System.out.println("Before = " + numbers);

        Set<Integer> set = new HashSet<>(numbers);
        System.out.println("After = " + set);
    }
}
