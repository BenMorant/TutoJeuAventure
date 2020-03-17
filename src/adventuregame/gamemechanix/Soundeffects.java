package adventuregame.gamemechanix;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

public class Soundeffects {

    Clip clip;

    public void setFile(String soundFileName) {

        File file = new File(soundFileName);
        AudioInputStream sound = null;
        try {
            sound = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(sound);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void play() {

        clip.setFramePosition(0);
        clip.start();
    }
}
