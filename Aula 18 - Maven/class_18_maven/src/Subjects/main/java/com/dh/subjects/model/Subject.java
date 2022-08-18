package Subjects.com.dh.subjects.model;

public class Subject {
    /** Attributes **/
    private Integer id;
    private String name;

    /** Constructor **/
    public Subject() {
    }

    public Subject(String name) {
        this.name = name;
    }

    public Subject(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    /** Getters/Setters **/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
