package zooKeepersChallenge;
public class Hyena extends zooKeepersChallenge.Animals {
    String howl;

    public Hyena( String color, String name, String birthDate, String weight, int age, String gender, String habitat, String id, String howl) {
        super(name, age, birthDate, color, habitat, id, weight, "Hyena", sex)
        this.howl = howl;
    }

    public String getHowl() {
        return howl;
    }

    public void setHowl(String howl) {
        this.howl = howl;
    }
}
