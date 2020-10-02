package pianoSim;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main extends JFrame implements KeyListener {

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

//    JTextField textField = new JTextField(20);
//
//    textField.addKeyListener(new KeyAdapter() {
//
//        public void keyPressed(KeyEvent e) {
//
//        }
//
//    });

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        if (keyCode == KeyEvent.VK_Q) {
            a = new Sound("src/main/resources/39180__jobro__piano-ff-033.wav");
            a.sound();
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

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

