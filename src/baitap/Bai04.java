package baitap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai04 {
    public static void main(String[] args) {
        //sắp xếp số nguyên tăng dần
        List<Integer> arrInt = new ArrayList<>(Arrays.asList(10, 20, 5, 46, 25, 41, 11));

        System.out.println(arrInt);
        for (int i = 0; i < arrInt.size(); i++) {
            for (int j = i + 1; j < arrInt.size() ; j++) {
                if (arrInt.get(i) > arrInt.get(j)) {
                    int temp = arrInt.get(i);
                    arrInt.set(i, arrInt.get(j));
                    arrInt.set(j, temp);
                }
            }
        }
        System.out.println("Danh sách sau khi sắp xếp: " + arrInt);

    }

}
