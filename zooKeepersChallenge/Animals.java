package zooKeepersChallenge;
public class Animals {

    String sex;
    String species;
    String color;
    String weight;
    String name;
    String birthDate;
    String id;
    String habitat;
    int age;

    // Animals class
    public static int numOfAnimals = 0;

    public Animals(String id, String sex, String species, String color, String weight, String birthDate, String habitat, String color, String name) {
        this.name = name;
        numOfAnimals++;
    }

    public Animals(String name, String sex, int age, String color, String weight, String habitat, String species, String id) {
        this.name = name;
        this.color = color;
        this.habitat = habitat;
        this.sex = sex;
        this.age = age;
        this.id = id;
        this.sex = sex;
        this.weight = weight;
        numOfAnimals++;
    }

    //Accessor
    public String getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public String getWeight() {
        return weight;
    }

    public String getId() {
        return id;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void getWight(String weight) {
        this.weight = weight;
    }

}
