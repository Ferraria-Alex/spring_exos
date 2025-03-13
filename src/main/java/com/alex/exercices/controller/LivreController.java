package com.alex.exercices.controller;

import com.alex.exercices.service.LivreService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Component
public class LivreController {

    @Autowired
    private LivreService livreService;

    public void router() {

        Scanner scanner = new Scanner(System.in);

        String check = "YES";
        while (check.equals("YES")) {
            System.out.println("What do you want to do?");
            String response = scanner.next();
            response = response.toUpperCase();

            switch (response) {
                case "ADD" -> livreService.add();
                case "REMOVE" -> livreService.remove();
                case "SHOW" -> livreService.findAll();
                default -> System.out.println("That is not a valid option");
            }

            System.out.println("Do you wanna continue? YES | NO");
            check = scanner.next();
            check = check.toUpperCase();
        }
    }
}
