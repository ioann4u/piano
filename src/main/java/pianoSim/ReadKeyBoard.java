package pianoSim;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ReadKeyBoard extends KeyAdapter {
    private static boolean[] keys;
    private boolean[] pressed;

    public ReadKeyBoard() {
        keys = new boolean[256];
        pressed = new boolean[keys.length];
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
        pressed[e.getKeyCode()] = false;
    }

    public static boolean[] getKeys() {
        return keys;
    }
}
