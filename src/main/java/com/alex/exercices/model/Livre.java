package com.alex.exercices.model;

public class Livre {
    private String title;
    private String description;
    private String PublicationDate;

    public Livre(){}

    public Livre(String title, String description, String publicationDate) {
        this.title = title;
        this.description = description;
        this.PublicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublicationDate() {
        return PublicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        PublicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", PublicationDate='" + PublicationDate + '\'' +
                '}';
    }
}
