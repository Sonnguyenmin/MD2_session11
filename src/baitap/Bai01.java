package baitap;

import java.util.ArrayList;
import java.util.Collections;

public class Bai01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100));
        }
        System.out.println("//Yeu cau 1:");
        System.out.println("before"+ list);
        Integer max =  Collections.max(list);
        System.out.println(max);

        System.out.println("//yeu cau 2:");
        Collections.reverse(list);
        System.out.println("after"+ list);

        System.out.println("//Yeu cau 3:");
        Collections.sort(list);
        System.out.println("after1" +list);

        System.out.println("//yeu cau 4:");
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add((int) (Math.random() * 100));
        }
//        System.out.println("arrayList1" + list);
        System.out.println("arrayList2 =" + arrayList);
        list.addAll(arrayList);
        System.out.println("list 3" + list);
    }
}
