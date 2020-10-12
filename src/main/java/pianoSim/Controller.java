package pianoSim;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Controller extends JPanel {

    private final int width = 547;
    private final int height = 191;
    private Image image;

    public Controller() {
        this.i();
    }

    private void i() {
        this.setPreferredSize(new Dimension(this.width, this.height));
        URL url = getClass().getResource("/" + "keyBoard.jpg");
        ImageIcon ii = new ImageIcon(url);
        this.image = ii.getImage();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
            g.drawImage(image, 0, 0, this);
    }

}


