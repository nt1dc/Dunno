package Person;

public enum Emotions {
    UNHAPPY("Ворча"),
    DELIGHT("восхищаясь"),
    DEFAULT("Калассикчески, я бы даже сказал pleasantly");
    private String disc;
    Emotions(String disc){
        this.disc=disc;
    }

    public String getDisc() {
        return disc;
    }
}

