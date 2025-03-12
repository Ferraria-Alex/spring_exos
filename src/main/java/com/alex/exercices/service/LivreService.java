package com.alex.exercices.service;

import com.alex.exercices.model.Livre;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class LivreService {

    private List<Livre> livres;

    public LivreService(){
        livres = new ArrayList<Livre>();
    }

    public List<Livre> getLivres() {
        return livres;
    }

    public void setLivres(List<Livre> livres) {
        this.livres = livres;
    }

    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the livre: ");
        String title = scanner.nextLine();
        System.out.println("Enter the description of the livre: ");
        String description = scanner.nextLine();
        System.out.println("Enter the publication date of the livre: ");
        String publicationDate = scanner.nextLine();
        System.out.println("Enter the genre of the livre: ");
        String genre = scanner.nextLine();
        this.livres.add(new Livre(title, description, publicationDate,genre));
    }

    public void remove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the livre that you want gone: ");
        String title = scanner.nextLine();
        this.livres.remove(this.findByTitle(title));
    }

    public Livre findByTitle(String title) {
        for (Livre livre : livres) {
            if (livre.getTitle().equals(title)) {
                return livre;
            }
        }
        return null;
    }

    public List<Livre> findAll() {
        for (Livre livre : livres) {
            System.out.println(livre);
        }
        return this.getLivres();
    }
}
