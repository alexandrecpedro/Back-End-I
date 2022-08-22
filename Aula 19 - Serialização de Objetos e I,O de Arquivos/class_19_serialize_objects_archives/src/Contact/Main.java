package Contact;

import Contact.model.Contact;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /** Instantiating new contacts **/
        Contact contact1 = new Contact("Teresa", "teresa@gmail.com", "5555555");
        Contact contact2 = new Contact("Cristina", "cristina@gmail.com", "222222");
        Contact contact3 = new Contact("Antonio", "antonio@gmail.com", "333333");
        Contact contact4 = new Contact("Matias", "matias@gmail.com", "999999");

        /** List of dogs **/
        List<Contact> contacts = new ArrayList<>();
        contacts.add(contact1);
        contacts.add(contact2);
        contacts.add(contact3);
        contacts.add(contact4);

        /** Serialize Section **/
        try {
            // Creating new file
            FileOutputStream fileOutputStream = new FileOutputStream("OutputContacts.txt");
            // File goes out of project (external file)
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            // Writing subject inside this file
            objectOutputStream.writeObject(contacts);
            objectOutputStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /** Deserialize Section **/
        List<Contact> contactList = null;
        try {
            // Search for external file
            FileInputStream fileInputStream = new FileInputStream("OutputContacts.txt");
            // Deserialize file
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            // Store the content of the read file/object
            contactList = (List<Contact>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        // Verify the object
        for (Contact contact: contactList) {
            System.out.println("\nName: " + contact.getName() + "\nEmail: " + contact.getEmail() +
                    "\nTelephone: " + contact.getTelephone());
        }
    }
}
