package Person;

import Location.TypeOfLocation;

public class Blueeyes extends Person   {

    public Blueeyes(String name, TypeOfLocation place) {
        super(name, place);
        setSex("female");
    }
    public void ozenitPrekid(Dunno dunno){
        if (dunno.getSimilarity()==100){
            this.setFace(Emotions.DELIGHT);
            lookAtPerson(dunno);
            System.out.println("Ч сказать, хайповый шмот,сказала "+this.getName());
        }
    }


}
