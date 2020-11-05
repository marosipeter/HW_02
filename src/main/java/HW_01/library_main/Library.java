package HW_01.library_main;

import HW_01.library_models.ArtAlbum;
import HW_01.library_models.Novel;

import java.util.ArrayList;
import java.util.List;

public class Library {

    public static void main(String... args) {

        Person firstPerson = new Person("Dan", "Brown"); //no middle name; how to avoid printing out 'null' at line 22?
        Person secondPerson = new Person("Robert", "Langdon");
        Novel firstNovel = new Novel();
        firstNovel.setAuthor(firstPerson);
        firstNovel.setTitle("The Da Vinci Code");
        firstNovel.setEBookAvailable(true);
        firstNovel.setIsbn("0-385-50420-9");
        firstNovel.setNumberOfPages(489);
        firstNovel.setType("Mystery");
        firstNovel.setProtagonist(secondPerson);

        System.out.println("*** firstNovel created ***");
        System.out.println("The author of \"" + firstNovel.getTitle() + "\" is " + firstNovel.getAuthor().getFirstName() + " " + firstNovel.getAuthor().getMiddleName() + " " + firstNovel.getAuthor().getLastName() + ".");
        System.out.println("This novel has " + firstNovel.getNumberOfPages() + " pages. Its protagonist is " + firstNovel.getProtagonist().getFirstName() + " " + firstNovel.getProtagonist().getMiddleName() + " " + firstNovel.getProtagonist().getLastName() + " " + ".");
        System.out.println("This " + firstNovel.getType().toLowerCase() + " novel is identified by the ISBN code " + firstNovel.getIsbn() + " .");
        if (firstNovel.isEBookAvailable()) {
            System.out.println("This novel is available in electronic format.");
        }

        Person thirdPerson = new Person("Salvador", "Felipe", "Dali", 1904, false);
        ArtAlbum firstArtAlbum = new ArtAlbum();
        firstArtAlbum.setPaperQuality("the best");
        firstArtAlbum.setForAdultsOnly(true);
        firstArtAlbum.setAuthor(thirdPerson);
        firstArtAlbum.setEBookAvailable(false);
        firstArtAlbum.setNumberOfPages(123);
        firstArtAlbum.setTitle("Fictional Surreality");
        firstArtAlbum.setIsbn("123ABC");

        System.out.println("\n*** firstAlbum created ***");
        System.out.println("The author of \"" + firstArtAlbum.getTitle() + "\" is " + firstArtAlbum.getAuthor().getFirstName() + " " + firstArtAlbum.getAuthor().getMiddleName() + " " + firstArtAlbum.getAuthor().getLastName() + "; who was born in " + thirdPerson.getBirthYear() + ".");
        System.out.println("This album has " + firstArtAlbum.getNumberOfPages() + " pages, printed on " + firstArtAlbum.getPaperQuality() + " paper.");
        if (firstArtAlbum.isEBookAvailable()) {
            System.out.println("This album is available in electronic format.");
        }
        if (firstArtAlbum.isForAdultsOnly()) {
            System.out.println("This album is recommended only for adults.");
        }

        System.out.println("\nThe End Of Line");

        System.out.println("\n*** Testing the List ***");


                List<Book> books = new ArrayList<>();
        List<Novel> novels = new ArrayList<>();
        Book firstBook = new Book();
        Novel secondNovel = new Novel();
        Novel thirdNovel = new Novel();
        ArtAlbum secondArtAlbum = new ArtAlbum();

        books.add(firstBook); //Book can be added to a Book object list
        books.add(firstNovel); // a Novel object can be added to a Book object list, as it is its Child object
        books.add(secondNovel);
        books.add(thirdNovel);
        books.add(firstArtAlbum); // an ArtAlbum can be added to a Book object List, as ArtAlbum it extends the Book object
        books.add(secondArtAlbum);
        //books.add(firstPerson); //a Person object can not be added to the List of Book objects

        for (Book book : books){
            System.out.print(book.toString()+", ");
        }
        System.out.println("\n");

        novels.add(firstNovel);
        novels.add(thirdNovel);
        //novels.add(firstNovel, secondNovel, thirdNovel); //why cannot we mass add elements to the list?
        //novels.add(firstArtAlbum); //an ArtAlbum object cannot be added to a List of Novel objects

        //testing the effect of the super keyword, used in the ArtAlbum
        System.out.println("\n*** Testing the super keyword just for fun, not related to the homework ***");
        System.out.println("Price of the "+ firstArtAlbum.getTitle() +" is " + firstArtAlbum.calculatePrice() + " $"); //is it still possible to call the parent's method, from a child, if we have overridden it? NO!
                                                            // unless we create a ArtAlbum thirdArtAlbum = new Book();
        System.out.println("Price of the "+ firstNovel.getTitle() +" is " + firstNovel.calculatePrice() + " $");


    }

}
