package ru.alishev.springcourse.model;

import ru.alishev.springcourse.interfaces.Music;

/**
 * @author Sergey Klunniy
 */
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
