package ru.mirea.lab21;

public class ElementAccess {
    public static <T> T getElementByIndex(T[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Индекс " + index + " выходит за границы массива");
        }
        return array[index];
    }
}
