package Location;

public enum TypeOfLocation {
    ROOM("Комната"),
    CHAMBER("Палата"),
    CORRIDOR("Коридор");
    private final String name;

    TypeOfLocation(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
}
