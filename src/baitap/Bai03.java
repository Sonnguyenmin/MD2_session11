package baitap;

import java.util.*;

public class Bai03 {

    public static void main(String[] args) {
        // tìm chuỗi ngắn nhất trong đoạn văn bản.
        String str = "Rikkei Academy để nông dân biết code";
        String[] arrString = str.split(" ");
        List<String> arrList = new ArrayList<>(Arrays.asList(arrString));

        String min = arrList.get(0);

        for (String m : arrList) {
            if (m.length() < min.length()) {
                min = m;
            }
        }

        System.out.println("Chuỗi ngắn nhất là: " + min);

//        String min = Collections.min(arrList, Comparator.comparing(String::length));
//        System.out.println(min);
    }
}
