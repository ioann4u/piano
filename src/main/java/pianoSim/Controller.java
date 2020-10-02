package pianoSim;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Controller extends JPanel {

    private Button[] buttons = new Button[24];
    private final int width = 547;
    private final int height = 191;
//    private int x = 0;
//    private int y = 20;
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
}


