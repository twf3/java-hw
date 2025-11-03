package ru.mirea.lab13;

public class Shirt {
    private String id;
    private String description;
    private String color;
    private String size;

    public Shirt(String id, String description, String color, String size) {
        this.id = id;
        this.description = description;
        this.color = color;
        this.size = size;
    }

    public Shirt(String str) {
        String[] shirtParts = str.split(",");
        if (shirtParts.length >= 4) {
            this.id = shirtParts[0];
            this.description = shirtParts[1];
            this.color = shirtParts[2];
            this.size = shirtParts[3];
        }
    }

    @Override
    public String toString() {
        return "id: " + id + "\n" +
                "description: " + description + "\n" +
                "color: " + color + "\n" +
                "size: " + size + "\n";
    }
}
