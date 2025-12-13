package ru.mirea.lab27;

public class HashTab {
    private String[] keys;
    private String[] values;
    private int capacity;

    public HashTab(int capacity) {
        this.capacity = capacity;
        keys = new String[capacity];
        values = new String[capacity];
    }

    private int hashtabHash(String key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    public void hashtabInit(int capacity) {
        this.capacity = capacity;
        keys = new String[capacity];
        values = new String[capacity];
    }

    public void hashtabAdd(String key, String value) {
        int index = hashtabHash(key);
        keys[index] = key;
        values[index] = value;
    }

    public String hashtabLookup(String key) {
        int index = hashtabHash(key);
        if (keys[index] != null && keys[index].equals(key)) {
            return values[index];
        }
        return null;
    }

    public void hashtabDelete(String key) {
        int index = hashtabHash(key);
        if (keys[index] != null && keys[index].equals(key)) {
            keys[index] = null;
            values[index] = null;
        }
    }
}