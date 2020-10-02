package pianoSim;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ReadKeys implements KeyListener {
    private static Sound a;

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        int e = keyEvent.getKeyCode();


        if (e == KeyEvent.VK_C ) {
            a = new Sound("src/main/resources/39180__jobro__piano-ff-033.wav");
            a.sound();
        }

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }

    //import java.awt.event.KeyAdapter;
//import java.awt.event.KeyEvent;
//
//public class ReadKeyBoard extends KeyAdapter {
//    private static boolean[] keys;
//
//    public ReadKeyBoard() {
//        keys = new boolean[256];
//    }
//
//    @Override
//    public void keyPressed(KeyEvent e) {
//        keys[e.getKeyCode()] = true;
//    }
//
//    @Override
//    public void keyReleased(KeyEvent e) {
//        keys[e.getKeyCode()] = false;
//    }
//
//    public static boolean[] getKeys() {
//        return keys;
//    }
//}


}
