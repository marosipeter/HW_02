package HW_01.library_main;

public class Book {

    private String title; //instead of name
    //private String author; //tried to link it with the name components from Person; errors; requesting that e.g. firstName to be static, but that would mean that ALL person objects would have the same first name
    private Person author; //weak composition
    private int numberOfPages;
    private boolean eBookAvailable;
    private String isbn; //The International Standard Book Number (ISBN) is a 13-digit number that uniquely identifies books and book-like products published internationally

    //for testing the super keyword, referenced in ArtAlbum
    public double calculatePrice() {
        return 11.99;
    }


    // *** for add, delete, list.. we should know some methods to actually add, remove and list them; e.g from keyboard input the attributes; or even better from a GUI
    public void add() {

    }

    public void delete() {

    }

    public void list() {

    }

    //recreated default constructor
    public Book() {

    }

    //full constructor created automatically with the Alt+Insert method
    public Book(String title, Person author, int numberOfPages, boolean eBookAvailable, String isbn) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.eBookAvailable = eBookAvailable;
        this.isbn = isbn;
    }

    //third constructor excluding non-mandatory fields like pageNumber and eBookAvailable
    public Book(String title, Person author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }


    /*
     * Below the Getters and Setters were created using the Alt+Insert then Generate method
     * as it was described on the page
     * https://www.jetbrains.com/help/idea/generating-code.html#generate-getters-setters
     */

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public boolean isEBookAvailable() {
        return eBookAvailable;
    }

    public void setEBookAvailable(boolean eBookAvailable) {
        this.eBookAvailable = eBookAvailable;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
