package pianoSim;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class Sound {

    private String track;
    private Clip m = null;

    public Sound(String track) {
        this.track = track;
    }

    public void sound() {

        File dirT = new File(new File(this.track).getAbsolutePath());
        AudioInputStream audioInputStream = null;

        try {
            audioInputStream = AudioSystem.getAudioInputStream(dirT);
        } catch (UnsupportedAudioFileException | IOException e) {
            e.printStackTrace();
        }

        try {
            m = AudioSystem.getClip();
            m.open(audioInputStream);
            m.addLineListener(event -> {
                if (event.getType() == LineEvent.Type.STOP) {
                    event.getLine().close();
                }
            });
            m.setFramePosition(0);
            m.start();
        } catch (LineUnavailableException | IOException e) {
            e.printStackTrace();
        }
    }
}

