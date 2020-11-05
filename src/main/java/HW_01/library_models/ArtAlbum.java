package HW_01.library_models;

import HW_01.library_main.Book;

public class ArtAlbum extends Book {
    private String paperQuality;
    private boolean forAdultsOnly;

    //for testing the super keyword
    public double calculatePrice() {
        double price = super.calculatePrice();
        return price * 0.9;
    }

    public String getPaperQuality() {
        return paperQuality;
    }

    public void setPaperQuality(String paperQuality) {
        this.paperQuality = paperQuality;
    }

    public boolean isForAdultsOnly() {
        return forAdultsOnly;
    }

    public void setForAdultsOnly(boolean forAdultsOnly) {
        this.forAdultsOnly = forAdultsOnly;
    }
}

