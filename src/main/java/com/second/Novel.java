package com.second;

import com.first.Book;
import com.first.Person;

public class Novel extends Book {
    private String type;
    private String protagonist; //a novel HAS_A protagonist, who is a Person; but it has the same problem as the author vs Person; difficult to set it, and retrieve its name

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProtagonist() {
        return protagonist;
    }

    public void setProtagonist(String protagonist) {
        this.protagonist = protagonist;
    }
}
