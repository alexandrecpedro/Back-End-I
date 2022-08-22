package DogList.model;

import java.io.Serializable;

public class DogList implements Serializable {
    /** Attributes **/
    private int age;
    private String name;

    /** Constructor **/
    public DogList(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /** Getters/Setters **/
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
