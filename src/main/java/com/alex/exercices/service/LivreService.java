package com.alex.exercices.service;

import com.alex.exercices.model.Livre;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class LivreService {
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the livre: ");
        String title = scanner.nextLine();
        System.out.println("Enter the description of the livre: ");
        String description = scanner.nextLine();
        System.out.println("Enter the publication date of the livre: ");
        String publicationDate = scanner.nextLine();
        System.out.println(new Livre(title, description, publicationDate));
    }
    public Livre getLivre(){
        return new Livre();
    }
}
