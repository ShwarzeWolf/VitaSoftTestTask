package sharaeva.restservices;

public enum Month {
    JANUARY("ЯНВАРЬ"),
    FEBRUARY("ФЕВРАЛЬ"),
    MARCH("МАРТ"),
    APRIL("АПРЕЛЬ"),
    MAY("МАЙ"),
    JUNE("ИЮНЬ"),
    JULI("ИЮЛЬ"),
    AUGUST("АВГУСТ"),
    SEPTEMBER("СЕНТЯБРЬ"),
    OCTOBER("ОКТЯБРЬ"),
    NOVEMBER("НОЯБРЬ"),
    DECEMBER("ДЕКАБРЬ");

    private final String russianName;

    Month(String name) {
        this.russianName = name;
    }

    public String getRussianName(){
        return russianName;
    }
}


