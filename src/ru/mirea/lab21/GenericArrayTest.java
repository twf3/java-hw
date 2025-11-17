package ru.mirea.lab21;

public class GenericArrayTest {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        GenericArray<Integer> intGenericArray = new GenericArray<>(intArray);
        intGenericArray.printArrayInfo();

        String[] strArray = {"hello", "world", "bpbpbpbp"};
        GenericArray<String> strGenericArray = new GenericArray<>(strArray);
        strGenericArray.printArrayInfo();

        Long[] longArray = {100L, 200L, 300L, 400L};
        GenericArray<Long> longGenericArray = new GenericArray<>(longArray);
        longGenericArray.printArrayInfo();
    }
}
