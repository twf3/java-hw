package ru.mirea.lab21;

import java.util.ArrayList;
import java.util.List;

public class ArrayConverter {
    public static <T> List<T> convertArrayToList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }
}