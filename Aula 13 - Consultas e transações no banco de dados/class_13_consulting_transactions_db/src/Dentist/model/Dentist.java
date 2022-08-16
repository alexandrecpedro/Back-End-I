package Dentist.model;

public class Dentist {
    /** Attributes **/
    private Long id;
    private String firstName, lastName;
    private Long enrollment;

    /** Constructor **/
    public Dentist(String firstName, String lastName, Long enrollment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.enrollment = enrollment;
    }

    /** Getters/Setters **/
    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(Long enrollment) {
        this.enrollment = enrollment;
    }
}
