package ru.alishev.springcourse.model;

import ru.alishev.springcourse.interfaces.Music;

/**
 * @author Sergey Klunniy
 */
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
