package Dog;

import Dog.model.Dog;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /** Instantiating new dogs **/
        Dog dog = new Dog("Fido", "German Shepherd", 3, "Direction 1");
        Dog dog2 = new Dog("Toby", "Labrador", 1, "Direction 2");
        Dog dog3 = new Dog("Bobby", "Rough Collie", 7, "Direction 3");
        Dog dog4 = new Dog("Smith", "Bull", 3, "Direction 4");

        /** Array linking each day to many dogs **/
        ArrayList<Dog> monday = new ArrayList<>();
        ArrayList<Dog> tuesday = new ArrayList<>();
        ArrayList<Dog> wednesday = new ArrayList<>();
        ArrayList<Dog> thursday = new ArrayList<>();
        ArrayList<Dog> friday = new ArrayList<>();

        monday.add(dog);
        monday.add(dog2);
        monday.add(dog4);

        tuesday.add(dog2);
        tuesday.add(dog4);

        wednesday.add(dog);
        wednesday.add(dog2);
        wednesday.add(dog3);
        wednesday.add(dog4);

        thursday.add(dog2);
        thursday.add(dog3);
        thursday.add(dog4);

        friday.add(dog);
        friday.add(dog3);
        friday.add(dog4);

        /** Serialize Section **/
        try {
            // Creating new file
            FileOutputStream fileOutputStream = new FileOutputStream("dogs.dates");
            // File goes out of project (external file)
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            // Writing subject inside this file
            objectOutputStream.writeObject(monday);
            objectOutputStream.writeObject(tuesday);
            objectOutputStream.writeObject(wednesday);
            objectOutputStream.writeObject(thursday);
            objectOutputStream.writeObject(friday);

            objectOutputStream.close();

            // Search for external file
            FileInputStream fileInputStream = new FileInputStream("dogs.dates");
            // Deserialize file
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            // Store the content of the read file/object
            ArrayList<Dog> days;
            for (int i = 0; i < 5; i++) {
                System.out.println("\nDay: " + (i+1));
                System.out.println("=====================");
                days = (ArrayList<Dog>) objectInputStream.readObject();

                for (Dog d: days) {
                    System.out.println(d);
                }
            }

            objectInputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
