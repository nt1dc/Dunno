package Person;

import Location.TypeOfLocation;

public class Grunt extends Person{
    public Grunt(String name, TypeOfLocation place) {
        super(name, place);
        setSex("male");
        this.setFace(Emotions.UNHAPPY);
    }
}
