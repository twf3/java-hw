package ru.mirea.lab21;

public class GenericArray<T> {
    private T[] array;

    public GenericArray(T[] array) {
        this.array = array;
    }

    public T[] getArray() { return array; }

    public void setArray(T[] array) { this.array = array; }

    public void printArrayInfo() {
        System.out.println("Тип массива: " + (array.length > 0 ? array[0].getClass() : "empty"));
        System.out.println("Элементы: ");
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println("\n");
    }
}
