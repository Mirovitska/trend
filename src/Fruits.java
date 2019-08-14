public enum Fruits {
    RedApples(3),
    BloodOrange(10),
    Cherries(8),
    Cranberries(12),
    RedGrapes(4),
    PinkGrapefruit(12),
    RedPears(9),
    Pomegranates(6),
    Raspberries(11),
    Strawberries(99),
    Watermelon(98),
    Apricots(88),
    CapeGooseberries(77),
    Cantaloupe(66),
    YellowFigs(55),
    Grapefruit(54),
    GoldenKiwifruit(44),
    Lemons(43),
    Mangoes(33),
    Nectarines(22),
    Oranges(21),
    Papayas(20),
    Peaches(19),
    YellowPears(18),
    Persimmons(17),
    Pineapples(16),
    Tangerines(15),
    YellowWatermelon(14),
    Avocados(13),
    Blackberries(12);

    public static Fruits getRandom() {
        var values = values();
        var i = (int) (Math.random() * values.length);
        return values[i];
    }
    int numVal;
    Fruits(int numVal) {
        this.numVal = numVal;
    }
}

