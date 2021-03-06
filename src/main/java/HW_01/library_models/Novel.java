package HW_01.library_models;

import HW_01.library_main.Person;
import HW_01.library_main.Book;

public class Novel extends Book {
    private String type;
    // private String protagonist; //a novel HAS_A protagonist, who is a Person; but it has the same problem as the author vs Person; difficult to set it, and retrieve its name
    private Person protagonist;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Person getProtagonist() {
        return protagonist;
    }

    public void setProtagonist(Person protagonist) {
        this.protagonist = protagonist;
    }
}
