package kieu_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LopArrayList {
    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>();
        listNumber.add(20);
        listNumber.add(20);
        listNumber.add(20);
        listNumber.add(20);
        listNumber.add(20);
        listNumber.add(20);
        listNumber.add(20);
        listNumber.add(20);
        listNumber.add(20);
        listNumber.add(20);
        listNumber.add(20);
        listNumber.add(20);

        for (Integer so: listNumber) {
            System.out.println(so + "\t");
        }
        System.out.println();

        //in ra theo cach 2:
        final Iterator<Integer> Itr = listNumber.iterator();
        while (Itr.hasNext()) {
            System.out.println(Itr.next()+ "\t");
        }
        System.out.println();

        //In theo cach 3:
        for (int i = 0; i < listNumber.toArray().length; i++) {


        }
    }
}
