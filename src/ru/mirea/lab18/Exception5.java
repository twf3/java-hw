package ru.mirea.lab18;

public class Exception5 {
    public void getDetails(String key) {
        try {
            if(key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            System.out.println("data for " + key);
        } catch (NullPointerException e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}
