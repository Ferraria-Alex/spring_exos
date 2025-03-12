package com.alex.exercices.model;

public class Livre {
    private String title;
    private String description;
    private String publicationDate;
    private String genre;

    public Livre(){}

    public Livre(String title, String description, String publicationDate, String genre) {
        this.title = title;
        this.description = description;
        this.publicationDate = publicationDate;
        this.genre = genre;
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
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", PublicationDate='" + publicationDate + '\'' +
                '}';
    }
}
