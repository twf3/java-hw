package ru.mirea.lab4;

public enum Season {
    WINTER(-6.0, "Холодное время года"),
    SPRING(9.0, "Холодное время года"),
    SUMMER(18.0, "Теплое время года"),
    AUTUMN(6.0, "Холодное время года");

    // создаем поля
    private final double averageTemp;
    private String description;

    // конструктор, принимажющий среднюю температуру и описание
    Season(double averageTemp, String description) {
        this.averageTemp = averageTemp;
        this.description = description;
    }

    public String getDescription() { return description; }

    public double getAverageTemp() { return averageTemp; }

    public static void FavoriteSeason(Season fav) {
        System.out.println("Любимое время года: " + fav);
        System.out.println("Средняя температура: " + fav.getAverageTemp());
        System.out.println("Описание: " + fav.getDescription() + "\n");
    }

    public static void SeasonLove(Season season) {
        switch (season) {
            case WINTER: System.out.println("Я люблю зиму"); break;
            case SPRING: System.out.println("Я люблю весну"); break;
            case SUMMER: System.out.println("Я люблю лето"); break;
            case AUTUMN: System.out.println("Я люблю осень"); break;
        }
    }

    public static void printSeasonInfo() {
        for (Season season : Season.values()) {
            System.out.println("Время года: " + season);
            System.out.println("Средняя температура: " + season.getAverageTemp());
            System.out.println("Описание: " + season.getDescription() + "\n");

        }
    }

    public static void main(String[] args) {
        System.out.println("1) Любимое время года и информация о нем");
        FavoriteSeason(Season.SPRING);

        System.out.println("2) Сообщения о времени года с помощью switch");
        SeasonLove(Season.SPRING);
        SeasonLove(Season.SUMMER);
        SeasonLove(Season.AUTUMN);
        SeasonLove(Season.WINTER);

        System.out.println("5) Описания для времен года");
        System.out.println(Season.WINTER.getDescription());
        System.out.println(Season.SUMMER.getDescription());

        System.out.println("6) Все времена года и информация о них");
        printSeasonInfo();
    }
}
