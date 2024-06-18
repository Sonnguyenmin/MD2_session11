package baitap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Bai02 {
    public static void main(String[] args) {
        String str = "Rikkei Academy để nông dân biết code";
        String[] arrString = str.split(" ");
         List<String> arr = new ArrayList<>(Arrays.asList(arrString));
        System.out.println(arr);

        for (String a : arr) {
            if(a.length() > 3) {
                System.out.println(a);
            }
        }
    }
}
