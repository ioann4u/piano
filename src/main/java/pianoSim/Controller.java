package pianoSim;

import javax.net.ssl.KeyManager;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controller extends JPanel implements ActionListener {

    private Player player;
    private Button[] buttons = new Button[24];
    private final int width = 900;
    private final int height = 600;
    private int x = 0;
    private int y = 20;
//    private Graphics g;

    public Controller() {
        this.i();
        this.createButtons();
    }

    private void i() {
        this.setPreferredSize(new Dimension(this.width, this.height));
    }

    private void createButtons() {
        Player player = new Player();
        for (int i = 0; i < 24; i++) {
            buttons[i] = new Button(i * 20, 10, i + 36);
        }
    }

    private void paintBoard(Graphics g) {
        super.paint(g);
        for (int i = 0; i < 24; i++) {
            g.drawRect(buttons[i].getX(), buttons[i].getY(), 20, 50);
            g.setColor(Color.black);
        }
    }

    public void actionPerformed(ActionEvent actionEvent) {
        Player player = new Player();
        boolean[] keys = new ReadKeyBoard().getKeys();
        if (keys[32]) {
            this.player.playSound(1, 100, 72); //player.playSound(1, 1000, 69, 72);
            this.player.close();
        }
    }
}
