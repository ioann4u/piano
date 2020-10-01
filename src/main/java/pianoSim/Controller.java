package pianoSim;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.net.URL;

public class Controller extends JPanel implements ActionListener {

    private Button[] buttons = new Button[24];
    private final int width = 547;
    private final int height = 191;
    private int x = 0;
    private int y = 20;
    private Image image;
    private AudioInputStream stream = null;
    private Clip clip = null;
    private boolean released = false;
    private static Sound a;



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
//        this.addKeyListener(new ReadKeys());
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
//        boolean[] keys = ReadKeyBoard.getKeys();
//
//        if (keys[67] || keys[KeyEvent.VK_C]) {
//            a = new Sound("src/main/resources/39180__jobro__piano-ff-033.wav");
//            a.sound();
//        }
    }
}

