package Person;

import Interfaces.ChangeLocation;
import Interfaces.Look;
import Location.TypeOfLocation;
import Things.Thing;

public abstract class Person implements ChangeLocation, Look {
    private String name;
    private TypeOfLocation place;
    private Emotions face = Emotions.DEFAULT;
    private String sex;
    Person(String name, TypeOfLocation place) {
        this.name = name;
        this.place = place;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return name == person.name
                &&(sex== person.sex);
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());              result = prime * result +
                ((sex == null) ? 0 : sex.hashCode()); return result;
    }
    @Override
    public String toString(){
        return
                this.name+" находится в" + this.place.getName()+
                " по его лицу понятно что он " + this.face.getDisc();
    }
    public void setFace(Emotions face) {
        this.face = face;
    }

    public void setPlace(TypeOfLocation place) {
        this.place = place;
    }

    public TypeOfLocation getPlace() {
        return place;
    }

    public String getName() {
        return name;
    }
    public String getSex() {
        System.out.println(this.sex);
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public  void take(){

    }

    @Override
    public void ChangeLocation(TypeOfLocation place){

        if ((!this.getPlace().equals(place)) & (!((getPlace().equals(TypeOfLocation.ROOM)) & (place.equals(TypeOfLocation.CHAMBER))))){
            if (this.sex.equals("female")) {
                System.out.println(this.name + " перешла из " + this.place.getName() + " в " + place.getName());
            }
            else {
                System.out.println(this.name + " перешел из " + this.place.getName() + " в " + place.getName());
            }
            this.place=place;
            if (this.place.equals(TypeOfLocation.CHAMBER)){

            }
        }
        else {
            System.out.println(getName()+" не может перейти из "+this.place.getName() +" в "+place.getName() );
        }


    }
    @Override
    public void lookAtPerson(Person person){
        if ((this.place==person.place) & (!this.name.equals(person.name))) {
            if(this.sex.equals("male")){
                System.out.println(this.name +" посмотрел на " + person.name + "  " + this.face.getDisc());
            }
            else {
                System.out.println(this.name +" посмотрела на " + person.name + "  " + this.face.getDisc());
            }
        }
        else {System.out.println("ебаный шиизойд "+ person.name +" здесь нет"+" или ты просто гений решил посмотреть в зеркало которого здесь нет)))");}
    }
    @Override
    public void lookAtThing(Thing thing){
        System.out.println(this.name+ "посмотрел на "+thing);
    }


    }
