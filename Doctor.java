package Person;
import Interfaces.ChangeLocation;
import Interfaces.ChangeLocationWithSth;
import Location.TypeOfLocation;
import Things.Thing;

public class Doctor extends Person implements ChangeLocation, ChangeLocationWithSth {

    public Doctor(String name, TypeOfLocation place, String sex) {
        super(name, place);
        this.setSex(sex);
    }
    Thing tubule = new Thing("Деревянная трубочка", 10, getPlace());
    public void leftTubule() {
        System.out.println(getName() + " оставила " + tubule.getName() + " в " + getPlace().getName());
    }

    public Thing getTubule() {
        return tubule;
    }

    @Override
    public void ChangeLocation(TypeOfLocation place) {

        if ((!this.getPlace().equals(place)) & (!((getPlace().equals(TypeOfLocation.ROOM)) & (place.equals(TypeOfLocation.CHAMBER))))) {
            leftTubule();
            System.out.println(this.getName() + " перешла из " + this.getPlace().getName() + " в " + place.getName());
            setPlace(place);
        }


        else{
            System.out.println(getName() + " не может перейти из " + this.getPlace().getName() + " в " + place.getName());
        }
    }




    @Override
    public void ChangeLocationWithSth(TypeOfLocation place, Thing thing) {
        if ((!this.getPlace().equals(place)) & (!((getPlace().equals(TypeOfLocation.ROOM)) & (place.equals(TypeOfLocation.CHAMBER))))) {
            if (this.getSex().equals("female")) {
                System.out.println(this.getName() + " перешла из " + this.getPlace().getName() + " в " + place.getName());
            }
            else {
                System.out.println(this.getName() + " перешел из " + this.getPlace().getName() + " в " + place.getName());
            }
            System.out.println("Взяв с собой " + thing.getName());
            thing.setPlace(place);
        }


        else {
            System.out.println(getName()+" не может перейти из "+this.getPlace().getName() +" в "+place.getName() );
        }


    }





}