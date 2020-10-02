package pianoSim;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ReadKeys implements KeyListener {

    private boolean[] keys;
    public boolean w;

    public ReadKeys() {
        keys = new boolean[256];
        w = keys[KeyEvent.VK_W];
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    public boolean[] getKeys() {
        return keys;
    }
}

