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

    public static void main(String[] args) {
        String[] shirts = {
                "S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL",
                "S007,White T-Shirt,White,XL",
                "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S"
        };

        // преобразование стр в класс Shirt
        Shirt[] shirtObj = new Shirt[shirts.length];
        for (int i = 0; i < shirts.length; i++) {
            shirtObj[i] = new Shirt(shirts[i]);
        }

        for (int i = 0; i < shirtObj.length; i++) {
            System.out.println("Shirt " + (i + 1));
            System.out.println(shirtObj[i]);
        }
    }
}
