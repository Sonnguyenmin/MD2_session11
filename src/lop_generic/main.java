package lop_generic;

public class main {
    public static void main(String[] args) {
        MyArrays<Integer> myArr = new MyArrays<>();
        myArr.array = new Integer[] {1, 2, 3, 4};

        myArr.printArray(myArr.array);

        MyArrays<String> myStringArr = new MyArrays<>();
        myStringArr.array = new String[] {"Hung", "Cuong", "Nam"};
        myStringArr.printArray(myStringArr.array);
    }
}
