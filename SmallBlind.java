package Person;

import Location.TypeOfLocation;

public class SmallBlind extends Person{
    public SmallBlind(String name, TypeOfLocation place){
        super(name,place);
    }
    public void CreateSmallBling(){
        SmallBlind[] blinds = new SmallBlind[5];
        blinds[1]= new SmallBlind("Никита",TypeOfLocation.CHAMBER);
        blinds[2]  = new SmallBlind("Стас",TypeOfLocation.CHAMBER);
        blinds[3] = new SmallBlind("Гена",TypeOfLocation.CHAMBER);
        blinds[4] = new SmallBlind("Турбо ",TypeOfLocation.CHAMBER);
        blinds[5]  = new SmallBlind("Дюша Метёлкин",TypeOfLocation.CHAMBER);
    }

}
