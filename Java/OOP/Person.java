// Write a Java program to create a class called "Person" with a name and age attribute. Create two instatances of the "Person" class, set their attributesusing the constructor, and print their name and age.

public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Ean Craig", 11);
        Person person2 = new Person("Evan Ross", 12);
        System.out.println(person1.getName() + " is " + person1.getAge() + " years old. ");
        System.out.println(person2.getName() + " is " + person2.getAge() + " Years old.\n");
    }
}