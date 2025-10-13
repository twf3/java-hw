package ru.mirea.lab7;

interface Printable {
    void print();
}

class Magazine implements Printable {
    private String name;
    private int number;
    private String month;

    public Magazine(String name, int number, String month) {
        this.name = name;
        this.number = number;
        this.month = month;
    }

    @Override
    public void print() {
        System.out.println("Название журнала: " + name + ", номер: " + number + ", месяц: " + month);
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getMonth() {
        return month;
    }

    public static void printMagazines(Printable[] printable) {
        System.out.println("Список журналов: ");
        for (Printable item : printable) {
            item.print();
        }
    }
}

