import Location.TypeOfLocation;
import Person.*;
import Things.Thing;

import java.util.Arrays;

//311581Она вышла вместе с Синеглазкой из комнаты. Незнайка увидел на вешалке белый халат и колпак. Недолго думая, он надел этот халат
// , напялил колпак на голову, потом нацепил на нос очки, которые Медуница оставила на столе, и, захватив со стола деревянную трубочку,
// вышел из комнаты. Снежинка с восторгом смотрела на Незнайку, удивляясь его смелости и находчивости. Пройдя по коридору, он открыл дверь
// и очутился в больничной палате, где лежали его друзья коротышки. Подойдя к первой койке, он увидел, что на ней лежит Ворчун.
// Лицо у Ворчуна было угрюмое и недовольное.
public class Story   {
    public static void main(String[] args) {

        Thing[] things= new Thing[3];
        things[0]=new Thing("Халат",50, TypeOfLocation.ROOM);
        things[1]=new Thing("Колпак",20,TypeOfLocation.ROOM);
        things[2]=new Thing("Очки",20,TypeOfLocation.CHAMBER);
        Doctor medunica= new Doctor("Медуница",TypeOfLocation.ROOM,"female");
        things[2].setOwner(medunica.getName());
        Blueeyes sineglazka= new Blueeyes("Синеглазка",TypeOfLocation.ROOM );
        sineglazka.ChangeLocation(TypeOfLocation.CORRIDOR);
        medunica.ChangeLocation(TypeOfLocation.CORRIDOR);

        Dunno neznayka = new Dunno("Незнайка",TypeOfLocation.ROOM);
        for (Thing thing : things) {
            neznayka.lookAtThing(thing);
            neznayka.putOn(thing);
        }
        neznayka.take(medunica.getTubule());
        neznayka.ChangeLocation(TypeOfLocation.CORRIDOR);
        Snowflake snezhinka = new Snowflake("Снежинка",TypeOfLocation.CORRIDOR);

        snezhinka.ozenitPrekid(neznayka);
        neznayka.ChangeLocation(TypeOfLocation.CHAMBER);
        Grunt vorchun = new Grunt("Ворчун",TypeOfLocation.CHAMBER);
        SmallBlind[] blinds = new SmallBlind[5];
        blinds[0]= new SmallBlind("Никита",TypeOfLocation.CHAMBER);
        blinds[1]  = new SmallBlind("Стас",TypeOfLocation.CHAMBER);
        blinds[2] = new SmallBlind("Гена",TypeOfLocation.CHAMBER);
        blinds[3] = new SmallBlind("Турбо ",TypeOfLocation.CHAMBER);
        blinds[4]  = new SmallBlind("Дюша Метёлкин",TypeOfLocation.CHAMBER);
        Arrays.stream(blinds, 1, blinds.length).forEach(neznayka::lookAtPerson);
        vorchun.lookAtPerson(neznayka);
    }
}


