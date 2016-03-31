package com.example.haungsn.finalprojectapi15;

/**
 * Created by User on 2/28/2016.
 */
public class TimelineItem {
    private int id;
    private int year;
    private String name;
    private String description;
    private String referenceLink;

    public TimelineItem(int id, int year, String name, String description, String referenceLink){
        this.id = id;
        this.year = year;
        this.name = name;
        this.description = description;
        this.referenceLink = referenceLink;
    }

    public TimelineItem(int year, String name, String description, String referenceLink){
        this.year = year;
        this.name = name;
        this.description = description;
        this.referenceLink = referenceLink;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReferenceLink() {
        return referenceLink;
    }

    public void setReferenceLink(String referenceLink) {
        this.referenceLink = referenceLink;
    }
}
