package FavoritePage;

import FavoritePage.model.WebPage;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /** Instantiating favorite pages **/
        WebPage webPage1 = new WebPage("www.google.com", "Google");
        WebPage webPage2 = new WebPage("www.youtube.com", "Youtube");
        WebPage webPage3 = new WebPage("www.instagram.com", "Instagram");


        /** Add favorite pages to a List **/
        List<WebPage> favoritePages = Arrays.asList(webPage1, webPage2, webPage3);

        /** Serialize Section **/
        try {
            // Creating new file
            FileOutputStream fileOutputStream = new FileOutputStream("webpagesList.txt");
            // File goes out of project (external file)
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            // Writing subject inside this file
            objectOutputStream.writeObject(favoritePages);

            objectOutputStream.close();

            // Search for external file
            FileInputStream fileInputStream = new FileInputStream("webpagesList.txt");
            // Desserialize file (Recover object from a file)
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            // Store the content of the read file/object
            List<WebPage> webPages = (List<WebPage>) objectInputStream.readObject();
            System.out.println(webPages);

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
