package Study;

public class For_study {

    public static void main(String[] args) {
        Lesson_1();
        lesson_2();
    }
//    public static Person createPerson(String name, int age, int weight, String profession) {
//        Person person = new Person();
//        person.name = name;
//        person.age = age;
//        person.weight = weight;
//        person.profession = profession;
//        return person;
//    }

    public static void Lesson_1() {
//        Person denis = new Person();
//        denis.name = "Denis";
//        denis.age = 40;
//        denis.weight = 92;
//        denis.profession = "Pilot";
//
//        System.out.println("denis.name = " + denis.name);
//        System.out.println("denis.age = " + denis.age);
//        System.out.println("denis.weight = " + denis.weight);
//        System.out.println("denis.profession = " + denis.profession);
//
//        System.out.println();

    }

    public static void lesson_2() {
        Person denis = new Person("Denchik", 30, 95, "Programmer");
        Person ivan = new Person("Ivan", 50, 85, "Driver");
        System.out.println("denis.name = " + denis.getName());
        System.out.println("denis.age = " + denis.getAge());
        System.out.println("denis.weight = " + denis.getWeight());
        System.out.println("denis.profession = " + denis.getProfession());
        denis.setAge(35);
        System.out.println("denis.getAge() = " + denis.getAge());
        System.out.println();
        System.out.println("ivan.name = " + ivan.getName());
        System.out.println("ivan.age = " + ivan.getAge());
        System.out.println("ivan.weight = " + ivan.getWeight());
        System.out.println("ivan.profession = " + ivan.getProfession());

    }
}
