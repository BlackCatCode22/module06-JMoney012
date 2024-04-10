package zooKeepersChallenge;
public class Tiger extends zooKeepersChallenge.Animals {
    String prowl;

    public Tiger( String color, String name, String birthDate, String weight, int age, String gender, String habitat, String id, String prowl) {
        super(name, age, birthDate, color, habitat, id, weight, "Tiger", sex)
        this.prowl = prowl;
    }

    public String getProwl() {
        return prowl;
    }

    public void setProwl(String prowl) {
        this.prowl = prowl;
    }
}
