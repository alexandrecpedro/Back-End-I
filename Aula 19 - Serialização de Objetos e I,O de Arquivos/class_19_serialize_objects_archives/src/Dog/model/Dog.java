package Dog.model;

import java.io.Serializable;

public class Dog implements Serializable {
    /** Attributes **/
    private String name, breed;
    private int age;
    private String walkDirection;

    /** Constructor **/
    public Dog(String name, String breed, int age, String walkDirection) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.walkDirection = walkDirection;
    }

    /** Getters/Setters **/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWalkDirection() {
        return walkDirection;
    }

    public void setWalkDirection(String walkDirection) {
        this.walkDirection = walkDirection;
    }

    /** Method **/
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", walkDirection='" + walkDirection + '\'' +
                '}';
    }
}
