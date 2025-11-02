package ru.mirea.lab13;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    // а)
    public void parseAddressWithSplit(String address) {
        String[] parts = address.split(",");
        if (parts.length >= 7) {
            this.country = parts[0].trim();
            this.region = parts[1].trim();
            this.city = parts[2].trim();
            this.street = parts[3].trim();
            this.house = parts[4].trim();
            this.building = parts[5].trim();
            this.apartment = parts[6].trim();
        }
    }

    // б)
    public void parseAddressWithTokenizer(String address) {
        StringTokenizer tokenizer = new StringTokenizer(address, ",.;-");
        if (tokenizer.countTokens() >= 7) {
            this.country = tokenizer.nextToken().trim();
            this.region = tokenizer.nextToken().trim();
            this.city = tokenizer.nextToken().trim();
            this.street = tokenizer.nextToken().trim();
            this.house = tokenizer.nextToken().trim();
            this.building = tokenizer.nextToken().trim();
            this.apartment = tokenizer.nextToken().trim();
        }
    }

    @Override
    public String toString() {
        return String.format("Страна: %s, регион: %s, город: %s, улица: %s, дом: %s, корпус: %s, квартира: %s",
                country, region, city, street, house, building, apartment);
    }
}