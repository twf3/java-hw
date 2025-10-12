package ru.mirea.lab7;

public interface StringOperations {
    int countCharacters(String s);
    String getOddPositionCharacters(String s);
    String reverseString(String s);
}

class ProcessStrings implements StringOperations {
    @Override
    public int countCharacters(String s) {
        return s.length();
    }

    @Override
    public String getOddPositionCharacters(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    @Override
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
