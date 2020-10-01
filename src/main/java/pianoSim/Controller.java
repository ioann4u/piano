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
import java.net.URL;

public class Controller extends JPanel implements ActionListener {

    private Player player;
    private Button[] buttons = new Button[24];
    private final int width = 547;
    private final int height = 191;
    private int x = 0;
    private int y = 20;
    private Image image;

    public Controller() {
        this.i();
        this.createButtons();
    }

    private void i() {
        this.setPreferredSize(new Dimension(this.width, this.height));
        this.setBackground(Color.black);
        URL url = getClass().getResource("/" + "keyBoard.jpg");
        ImageIcon ii = new ImageIcon(url);
        this.image = ii.getImage();
        this.addKeyListener(new ReadKeyBoard());
        this.player = new Player();
    }

    public void paintComponent(Graphics g) {
        this.paintBoard(g);
    }

    private void createButtons() {
        for (int i = 0; i < 24; i++) {
            buttons[i] = new Button(i * 20, 10, i + 36);
        }
    }

    private void paintBoard(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }

    public void actionPerformed(ActionEvent actionEvent) {
        boolean[] keys = ReadKeyBoard.getKeys();

        if (keys[67]) {
//            player.playSound(1, 10, 100, 72, 74); //player.playSound(1, 1000, 69, 72);
            try {
                Synthesizer synth = MidiSystem.getSynthesizer();
                synth.open();
                MidiChannel[] channels = synth.getChannels();
                channels[0].programChange(1);
                channels[0].noteOn(65, 80);
                Thread.sleep(1000); // in milliseconds
                channels[0].noteOff(65);
                synth.close();
            }  catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
