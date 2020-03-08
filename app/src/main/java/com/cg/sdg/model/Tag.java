package com.cg.sdg.model;

public class Tag {
    private String tagID;
    private String tag;
    private boolean isSDG;
    private String description;

    public Tag() {
        //for Firebase
    }

    public Tag(String tagID, String tag, boolean isSDG, String description) {
        this.tagID = tagID;
        this.tag = tag;
        this.isSDG = isSDG;
        this.description = description;
    }

    public String getTagID() {
        return tagID;
    }

    public void setTagID(String tagID) {
        this.tagID = tagID;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public boolean isSDG() {
        return isSDG;
    }

    public void setSDG(boolean SDG) {
        isSDG = SDG;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
