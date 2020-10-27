package com.first;

import com.second.Album;
import com.second.Novel;

public class Library {

    public static void main(String... args) {

        Person firstPerson = new Person("Dan", "Brown");
        Person secondPerson = new Person("Robert", "Langdon");
        Novel firstNovel = new Novel();
        firstNovel.setAuthor(firstPerson.getFirstName()+" "+firstPerson.getMiddleName()+" "+firstPerson.getLastName()); //the empty middle name returns null; needs to be handled somehow elegantly, rather than removed
        firstNovel.setTitle("The Da Vinci Code");
        firstNovel.seteBookAvailable(true);
        firstNovel.setIsbn("0-385-50420-9");
        firstNovel.setPageNumber(489);
        firstNovel.setType("Mystery");
        firstNovel.setProtagonist(secondPerson.getFirstName()+" "+secondPerson.getMiddleName()+" "+secondPerson.getLastName());

        System.out.println("*** firstNovel created ***");
        System.out.println("The author of \"" +firstNovel.getTitle()+ "\" is "  + firstNovel.getAuthor() + ".");
        System.out.println("This novel has " + firstNovel.getPageNumber() + " pages. Its protagonist is " + firstNovel.getProtagonist() + ".");
        System.out.println("This " + firstNovel.getType().toLowerCase() + " novel is identified by the ISBN code " + firstNovel.getIsbn() + " .");
        if(firstNovel.iseBookAvailable()){
            System.out.println("This novel is available in electronic format.");
        }

        Person thirdPerson = new Person("Salvador", "Felipe", "Dali", 1904,false);
        Album firstAlbum = new Album();
        firstAlbum.setPaperQuality("the best");
        firstAlbum.setForAdultsOnly(true);
        firstAlbum.setAuthor(thirdPerson.getFirstName()+" "+thirdPerson.getMiddleName()+" "+thirdPerson.getLastName());
        firstAlbum.seteBookAvailable(false);
        firstAlbum.setPageNumber(123);
        firstAlbum.setTitle("Fictional Surreality");
        firstAlbum.setIsbn("123ABC");

        System.out.println("\n*** firstAlbum created ***");
        System.out.println("The author of \"" +firstAlbum.getTitle()+ "\" is "  + firstAlbum.getAuthor() + "; who was born in " + thirdPerson.getBirthYear() + ".");
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
