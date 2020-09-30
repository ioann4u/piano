package pianoSim;

import javax.swing.JFrame;
import java.awt.*;

public class Main extends JFrame {

    private Main() {
        this.initUi();
    }

    private void initUi() {
        this.add(new Controller());
        this.setTitle("pianoSim");
        this.setVisible(true);
//        Toolkit toolkit = Toolkit.getDefaultToolkit();
        this.setResizable(false);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
//        EventQueue.invokeLater(
//                () -> {
//                    Main st = new Main();
//                    st.setVisible(true);
//                }
//        );
        new Main();
    }
}
