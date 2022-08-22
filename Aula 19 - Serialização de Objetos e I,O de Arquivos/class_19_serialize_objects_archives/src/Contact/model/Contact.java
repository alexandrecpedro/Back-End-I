package Contact.model;

import java.io.Serializable;

public class Contact implements Serializable {
    /** Attributes **/
    private String name, email, telephone;

    /** Constructor **/
    public Contact() {
    }
    public Contact(String name, String email, String telephone) {
        this.name = name;
        this.email = email;
        this.telephone = telephone;
    }

    /** Getters/Setters **/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
