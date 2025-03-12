package com.alex.exercices.model;

import com.alex.exercices.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorld {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "value='" + value + '\'' +
                '}';
    }
}
