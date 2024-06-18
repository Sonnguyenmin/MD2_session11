package kieu_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LopHashSet {
    public static void main(String[] args) {
        Set<Integer> listNumber = new HashSet<>();
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

        //In ra theo cách 1:  pho bien nhat
        for (Integer i : listNumber) {
            System.out.println(i + "\t");
        }
        System.out.println();

        //In ra theo cach 2: chay theo chi so

        final Iterator<Integer> it = listNumber.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + "\t");
        }
        System.out.println();
    }
}
