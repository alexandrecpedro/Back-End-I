package DogList;

import DogList.model.DogList;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /** Instantiating new dogs **/
        DogList dog1 = new DogList(3, "Pluto");
        DogList dog2 = new DogList(1, "Scooby");
        DogList dog3 = new DogList(5, "Bethowen");

        /** List of dogs **/
        List<DogList> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);

        /** Serialize Section **/
        try {
            // Creating new file
            FileOutputStream fileOutputStream = new FileOutputStream("OutputDogs.txt");
            // File goes out of project (external file)
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            // Writing subject inside this file
            objectOutputStream.writeObject(dogs);
            objectOutputStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /** Deserialize Section **/
        List<DogList> dogs1 = null;
        try {
            // Search for external file
            FileInputStream fileInputStream = new FileInputStream("OutputDogs.txt");
            // Deserialize file
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            // Store the content of the read file/object
            dogs1 = (List<DogList>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        // Verify the object
        for (DogList dog: dogs1) {
            System.out.println(dog.getName() + " : " + dog.getAge() + " years old");
        }
    }
}
