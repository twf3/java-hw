package ru.mirea.lab28;

public class HashTableWithDoubleKey {

    private static class Entry {
        double key;
        String value;
        Entry next;

        Entry(double key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private Entry[] table;
    private int capacity;
    private int size;

    public HashTableWithDoubleKey(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        table = new Entry[capacity];
    }

    // по Sedgewick: h(k) = floor(M * (k * A mod 1)), где A = 0.6180339887 (золотое сечение)
    private int hash(double key) {
        final double A = 0.6180339887498949;
        double product = key * A;
        double fractional = product - Math.floor(product); // дробная часть
        return (int) Math.floor(capacity * fractional);
    }

    public void put(double key, String value) {
        int index = hash(key);

        // проверяем, существует ли уже такой ключ
        Entry current = table[index];
        while (current != null) {
            if (current.key == key) {
                current.value = value;
                return;
            }
            current = current.next;
        }

        // добавляем новый элемент в начало цепочки
        Entry newEntry = new Entry(key, value);
        newEntry.next = table[index];
        table[index] = newEntry;
        size++;
    }

    public String get(double key) {
        int index = hash(key);
        Entry current = table[index];

        while (current != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public void remove(double key) {
        int index = hash(key);
        Entry current = table[index];
        Entry prev = null;

        while (current != null) {
            if (current.key == key) {
                if (prev == null) {
                    table[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public boolean containsKey(double key) {
        return get(key) != null;
    }

    public int size() {
        return size;
    }

    public void printTable() {
        System.out.println("Хеш-таблица (емкость: " + capacity + ", элементов: " + size + "):");
        for (int i = 0; i < capacity; i++) {
            if (table[i] != null) {
                Entry current = table[i];
                while (current != null) {
                    System.out.print(current.key + " = " + current.value);
                    current = current.next;
                }
                System.out.println();
            }
        }
    }
}
