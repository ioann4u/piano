package pianoSim;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ReadKeyBoard extends KeyAdapter {
    private static boolean[] keys;

    public ReadKeyBoard() {
        keys = new boolean[256];
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
    }

    public static boolean[] getKeys() {
        return keys;
    }
}
