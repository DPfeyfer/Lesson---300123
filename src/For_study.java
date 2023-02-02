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
        Person ivan = new Person("Ivann", 50, 85, "Driver");
        System.out.println("denis.name = " + denis.name);
        System.out.println("denis.age = " + denis.age);
        System.out.println("denis.weight = " + denis.weight);
        System.out.println("denis.profession = " + denis.profession);
        System.out.println();
        System.out.println("ivan.name = " + ivan.name);
        System.out.println("ivan.age = " + ivan.age);
        System.out.println("ivan.weight = " + ivan.weight);
        System.out.println("ivan.profession = " + ivan.profession);

    }
}
