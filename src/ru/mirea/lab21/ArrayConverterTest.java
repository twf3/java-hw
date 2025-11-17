package ru.mirea.lab21;

import java.util.List;

public class ArrayConverterTest {
    public static void main(String[] args) {
        String[] stringArray = {"first", "second", "third"};
        List<String> stringList = ArrayConverter.convertArrayToList(stringArray);
        System.out.println(stringList);

        Integer[] numberArray = {1, 2, 3, 4, 5};
        List<Integer> numberList = ArrayConverter.convertArrayToList(numberArray);
        System.out.println(numberList);
    }
}
