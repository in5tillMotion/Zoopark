package Food;

//Супер класс еды
public enum Food {
    BULL("Говядина", false),
    PORK("Свинина", false),
    GRASS("Трава", false),
    WHEAT("Пшено", false);

    private final String title;
    private final boolean isVegetable;

    Food(String title, boolean isVegetable) {
        this.title = title;
        this.isVegetable = isVegetable;
    }

    public String getTitle() {
        return title;
    }

    public boolean isVegetable() {
        return isVegetable;
    }
}
