package Person;

import Location.TypeOfLocation;
import Things.Thing;
//заранее извиняюсь за написанный бред оказывается прога это интересно жестко плавится мозг
public class Dunno extends Person {
    private int similarity = 0;
    public Dunno(String name, TypeOfLocation place) {
        super(name, place);
        setSex("male");
    }

    public int getSimilarity() {
        return similarity;
    }
    public void putOn(Thing thing) {
        if (getPlace().equals(thing.getPlace())) {
            if (!thing.getOwner().equals(getName())) {
                this.similarity = this.similarity+thing.getSimilarity();
                thing.setOwner(getName());
                System.out.println(getName() + " надел " + thing.getName());
            } else {
                System.out.println(thing.getName() + " уже надета на " + getName());
            }
        }
        else {
            System.out.println("Предмета "+thing.getName()+" нет в "+this.getPlace().getName());
        }
    }
    public void take(Thing thing){
        if(thing.getOwner().equals("none")){
            System.out.println(this.getName()+" взал "+thing.getName());
            this.similarity=thing.getSimilarity()+this.similarity;
        }
        else {
            System.out.println(thing.getName()+ " не в комнате(");
        }


    }

    @Override
    public void ChangeLocation(TypeOfLocation place) {
        if ((!this.getPlace().equals(place)) & (!((getPlace().equals(TypeOfLocation.ROOM)) & (place.equals(TypeOfLocation.CHAMBER))))) {
            if ((this.getPlace().equals(TypeOfLocation.CORRIDOR))&(place.equals(TypeOfLocation.CHAMBER))){
                if (getSimilarity()==100){
                    System.out.println("Фейс контроль пройден, санитары заценили прикид)");

                }
                else {
                    System.out.println("Санитары сразу вычислили шизойда который косит под врача, но слава богу Незнайка вовремя успел достать обрез");
                    System.out.println( "пау пау пау ");
                    System.out.println("все стены в кровавом месеве");
                    System.out.println("Ну а ч вы хотели от этого малыша думаете он под дурочка косит???");
                }
            }
            System.out.println("Незнайка" + " перешел из " + this.getPlace().getName() + " в " + place.getName());

            this.setPlace(place);
        }


        else {
            System.out.println(getName()+" не может перейти из "+this.getPlace().getName() +" в "+getPlace().getName() );
        }
    }


    @Override
    public void lookAtThing(Thing thing) {
        if (getPlace().equals(thing.getPlace())) {
            System.out.println(getName() + " посмотрел на " + thing.getName());
        }
        else {
            System.out.println("Предмета "+thing.getName()+" нет в "+this.getPlace().getName());
        }

        }
    }
