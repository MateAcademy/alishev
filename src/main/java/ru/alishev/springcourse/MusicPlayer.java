package ru.alishev.springcourse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.alishev.springcourse.interfaces.Music;

import java.util.List;

/**
 * @author Sergey Klunniy
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MusicPlayer {

    private List<Music> music;
    private String name;
    private int volume;

    public void playMusic() {
        for (Music sing : music) {
            System.out.println(sing.getSong());
        }
    }

}
