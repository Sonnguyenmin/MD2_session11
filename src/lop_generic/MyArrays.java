package lop_generic;

public class MyArrays<E> {
    E[] array;
    public void printArray(E[] arr) {
        for(E e : arr) {
            System.out.println(e);
        }
    }
}
