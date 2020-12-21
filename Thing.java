package Things;

import Location.TypeOfLocation;

public  class Thing  {
    private String name;
    private int similarity;
    private TypeOfLocation place;
    private String owner="none";
    public Thing(String name, int similarity, TypeOfLocation place){
        this.name=name;
        this.similarity=similarity;
        this.place=place;
    }

    public void setPlace(TypeOfLocation place) {
        this.place = place;
    }

    public TypeOfLocation getPlace() {
        return place;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }

    public int getSimilarity() {
        return similarity;
    }
}
