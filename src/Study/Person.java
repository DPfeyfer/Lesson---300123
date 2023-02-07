package Study;

public class Person {
    private String name;
    private int age;
    private int weight;
    private String profession;

    public Person(String name, int age, int weight, String profession) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.profession = profession;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getProfession() {
        return this.profession;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
