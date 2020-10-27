package com.first;

import com.second.Album;
import com.second.Novel;

public class Library {

    public static void main(String... args) {

        Person firstPerson = new Person("Dan", "Brown"); //no middle name; how to avoid printing out 'null' at line 22?
        Person secondPerson = new Person("Robert", "Langdon");
        Novel firstNovel = new Novel();
        firstNovel.setAuthor(firstPerson);
        firstNovel.setTitle("The Da Vinci Code");
        firstNovel.seteBookAvailable(true);
        firstNovel.setIsbn("0-385-50420-9");
        firstNovel.setPageNumber(489);
        firstNovel.setType("Mystery");
        firstNovel.setProtagonist(secondPerson);

        System.out.println("*** firstNovel created ***");
        System.out.println("The author of \"" +firstNovel.getTitle()+ "\" is "  + firstNovel.getAuthor().getFirstName() +" " + firstNovel.getAuthor().getMiddleName()+ " " + firstNovel.getAuthor().getLastName()+ ".");
        System.out.println("This novel has " + firstNovel.getPageNumber() + " pages. Its protagonist is " + firstNovel.getProtagonist().getFirstName()+" "+ firstNovel.getProtagonist().getMiddleName()+" "+ firstNovel.getProtagonist().getLastName()+" " + ".");
        System.out.println("This " + firstNovel.getType().toLowerCase() + " novel is identified by the ISBN code " + firstNovel.getIsbn() + " .");
        if(firstNovel.iseBookAvailable()){
            System.out.println("This novel is available in electronic format.");
        }

        Person thirdPerson = new Person("Salvador", "Felipe", "Dali", 1904,false);
        Album firstAlbum = new Album();
        firstAlbum.setPaperQuality("the best");
        firstAlbum.setForAdultsOnly(true);
        firstAlbum.setAuthor(thirdPerson);
        firstAlbum.seteBookAvailable(false);
        firstAlbum.setPageNumber(123);
        firstAlbum.setTitle("Fictional Surreality");
        firstAlbum.setIsbn("123ABC");

        System.out.println("\n*** firstAlbum created ***");
        System.out.println("The author of \"" +firstAlbum.getTitle()+ "\" is "  + firstAlbum.getAuthor().getFirstName()+" " + firstAlbum.getAuthor().getMiddleName()+" " +firstAlbum.getAuthor().getLastName() +"; who was born in " + thirdPerson.getBirthYear() + ".");
        System.out.println("This album has " + firstAlbum.getPageNumber() + " pages, printed on " + firstAlbum.getPaperQuality() + " paper.");
        if(firstAlbum.iseBookAvailable()){
            System.out.println("This album is available in electronic format.");
        }
        if(firstAlbum.isForAdultsOnly()){
            System.out.println("This album is recommended only for adults.");
        }

        System.out.println("\nThe End Of Line");

    }

}
