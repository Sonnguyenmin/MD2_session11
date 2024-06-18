package baitap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai05 {
    public static void main(String[] args) {
//        List<Integer> arrInt = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//        for (int i = 0; i <= arrInt.size() ; i++) {
//            if (arrInt.get(i) % 2 == 0) {
//                System.out.println(arrInt.get(i));
//                arrInt.remove(i);
//            }
//        }
//        System.out.println(arrInt);



        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 15, 8, 9, 10, 13, 12, 16));

        List<Integer> evenNumbers = new ArrayList<>();

        for (Integer n : numbers) {
            if (n % 2 != 0) {
                evenNumbers.add(n);
            }
        }
        System.out.println(evenNumbers);
    }

//    public static int findIndex (List<Integer> numbers, Integer number) {
//        numbers.indexOf(number);
//    }
}
