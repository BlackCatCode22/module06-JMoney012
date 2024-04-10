package zooKeepersChallenge;

public class Bear extends zooKeepersChallenge.Animals {

    String growl;

    public Bear( String color, String name, String birthDate, String weight, int age, String gender, String habitat, String id, String growl) {
        super(name, age, birthDate, color, habitat, id, weight, "Bear", sex)
        this.growl = growl;
    }
    public String getGrowl() {
        return growl;
    }

    public void getGrowl(String growl) {
        this.growl = growl;
    }
}
