package ru.alishev.springcourse.model;

import ru.alishev.springcourse.interfaces.Music;

/**
 * @author Sergey Klunniy
 */
public class PopMusic implements Music {
    @Override
    public String getSong() {
        return "Pop Music";
    }
}
