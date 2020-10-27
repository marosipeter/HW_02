package com.second;

import com.first.Book;

public class Album extends Book {
    private String paperQuality;
    private boolean forAdultsOnly;

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

