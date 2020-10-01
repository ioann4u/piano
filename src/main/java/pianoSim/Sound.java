package pianoSim;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
//

public class Sound {

    private String track; // адресс файла
    private Clip m = null;
    // Иннициализация логера
//    public static final Logger logger = Logger.getLogger(Main.class.getName());

    // конструктор
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
                if (event.getType() == LineEvent.Type.STOP)
                {
                    event.getLine().close();
                }
            });
            m.setFramePosition(0);
            m.start();
        } catch (LineUnavailableException | IOException e) {
            e.printStackTrace();
        }
    }

//    private String note;
//    private Clip clip = null;
//    private FloatControl volume = null;
//
//    public Sound(String note) {
//        this.note = note;
//    }
//
//    public void playSound() {
//        File f = new File(this.note);
//        AudioInputStream tr = null;
//        try {
//            tr = AudioSystem.getAudioInputStream(f);
//        } catch (UnsupportedAudioFileException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            clip = AudioSystem.getClip();
//            clip.open(tr);
//            volume = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
//            clip.setFramePosition(0);
//            clip.start();
//        } catch (LineUnavailableException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }



//public class Sound implements AutoCloseable {
//    private boolean released = false;
//    private AudioInputStream stream = null;
//    private Clip clip = null;
//    private FloatControl volumeControl = null;
//    private boolean playing = false;
//
//    public Sound(File f) {
//        try {
//            stream = AudioSystem.getAudioInputStream(f);
//            clip = AudioSystem.getClip();
//            clip.open(stream);
//            clip.addLineListener(new Listener());
//            volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
//            released = true;
//        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc) {
//            exc.printStackTrace();
//            released = false;
//
//            close();
//        }
//    }
//
//    // true если звук успешно загружен, false если произошла ошибка
//    public boolean isReleased() {
//        return released;
//    }
//
//    // проигрывается ли звук в данный момент
//    public boolean isPlaying() {
//        return playing;
//    }
//
//    // Запуск
//	/*
//	  breakOld определяет поведение, если звук уже играется
//	  Если breakOld==true, о звук будет прерван и запущен заново
//	  Иначе ничего не произойдёт
//	*/
//    public void play(boolean breakOld) {
//        if (released) {
//            if (breakOld) {
//                clip.stop();
//                clip.setFramePosition(0);
//                clip.start();
//                playing = true;
//            } else if (!isPlaying()) {
//                clip.setFramePosition(0);
//                clip.start();
//                playing = true;
//            }
//        }
//    }
//
//    // То же самое, что и play(true)
//    public void play() {
//        play(true);
//    }
//
//    // Останавливает воспроизведение
//    public void stop() {
//        if (playing) {
//            clip.stop();
//        }
//    }
//
//    public void close() {
//        if (clip != null)
//            clip.close();
//
//        if (stream != null)
//            try {
//                stream.close();
//            } catch (IOException exc) {
//                exc.printStackTrace();
//            }
//    }
//
//    // Установка громкости
//	/*
//	  x долже быть в пределах от 0 до 1 (от самого тихого к самому громкому)
//	*/
//    public void setVolume(float x) {
//        if (x<0) x = 0;
//        if (x>1) x = 1;
//        float min = volumeControl.getMinimum();
//        float max = volumeControl.getMaximum();
//        volumeControl.setValue((max-min)*x+min);
//    }
//
//    // Возвращает текущую громкость (число от 0 до 1)
//    public float getVolume() {
//        float v = volumeControl.getValue();
//        float min = volumeControl.getMinimum();
//        float max = volumeControl.getMaximum();
//        return (v-min)/(max-min);
//    }
//
//    // Дожидается окончания проигрывания звука
//    public void join() {
//        if (!released) return;
//        synchronized(clip) {
//            try {
//                while (playing)
//                    clip.wait();
//            } catch (InterruptedException exc) {}
//        }
//    }
//
//    // Статический метод, для удобства
//    public static Sound playSound(String path) {
//        File f = new File(path);
//        Sound snd = new Sound(f);
//        snd.play();
//        return snd;
//    }
//
//    private class Listener implements LineListener {
//        public void update(LineEvent ev) {
//            if (ev.getType() == LineEvent.Type.STOP) {
//                playing = false;
//                synchronized(clip) {
//                    clip.notify();
//                }
//            }
//        }
//    }
}

