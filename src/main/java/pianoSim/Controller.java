package pianoSim;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Controller extends JPanel {

    private final int width = 547;
    private final int height = 191;
    private Image image;
    AddKeyAdapter men = new AddKeyAdapter();
    private boolean menu;


    public Controller() {
        this.i();
    }

    private void i() {
        this.setPreferredSize(new Dimension(this.width, this.height));
        URL url = getClass().getResource("/" + "keyBoard.jpg");
        ImageIcon ii = new ImageIcon(url);
        this.image = ii.getImage();
        this.menu = men.isMenu();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (men.isMenu())
            this.drawMenu(g);
        else if (!men.isMenu())
//            this.paintBoard(g);
            g.drawImage(image, 0, 0, this);
        Toolkit.getDefaultToolkit().sync();
    }

    private void paintBoard(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }

//    private void inMenu() {
//        this.menu = men.isMenu();
//    }

    private void drawMenu(Graphics g) {
        super.paintComponent(g);
        String start = "Press Enter to play";

        Font font = new Font("Helvetica", 1, 18);
        FontMetrics fm = this.getFontMetrics(font);

        g.setColor(Color.BLACK);
        g.setFont(font);
        g.drawString(start, (width - fm.stringWidth(start)) / 2, this.height / 2);
    }
}


