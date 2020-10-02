package pianoSim;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main extends JFrame {

    private static Sound a;


    private Main() {
        this.initUi();
    }

    private void initUi() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new Controller());
        this.setTitle("pianoSim");
        this.setResizable(false);
        this.pack();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(
                () -> {
                    Main st = new Main();
                    st.setVisible(true);
                }
        );
    }
}

