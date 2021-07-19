package com.example.learnmiwok;

public class Word {
    private static final int NO_IMAGE_PROVIDED = -1;
    private String menglish;
    private String mmiwok;
    private int mresourceID = NO_IMAGE_PROVIDED;

    public Word(String menglish, String mmiwok) {
        this.menglish = menglish;
        this.mmiwok = mmiwok;
    }
    public Word(String menglish, String mmiwok, int mresourceID) {
        this.menglish = menglish;
        this.mmiwok = mmiwok;
        this.mresourceID = mresourceID;
    }
    public String getEnglishTranslation() { return menglish; }
    public String getMiwokTranslation() { return mmiwok;}
    public int getImageResourceID() {return mresourceID;}
    public boolean hasImage() {
        return mresourceID != NO_IMAGE_PROVIDED;
    }
}
