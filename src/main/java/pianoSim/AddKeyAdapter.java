package pianoSim;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AddKeyAdapter extends KeyAdapter {

    private static Sound a;
    private boolean menu = true;
    private boolean game = false;


    @Override
    public void keyPressed(KeyEvent e) {

        System.out.println(e.getKeyChar());
        System.out.println(e.getKeyCode());

        if (e.getKeyCode() == 10) {
            this.menu = false;
            this.game = true;
        }
        System.out.println(isMenu());
        if (e.getKeyChar() == 'c') {
            a = new Sound("src/main/resources/39175__jobro__piano-ff-028.wav");
            a.sound();
        }
        if (e.getKeyChar() == 'f') {
            a = new Sound("src/main/resources/39176__jobro__piano-ff-029.wav");
            a.sound();
        }
        if (e.getKeyChar() == 'v') {
            a = new Sound("src/main/resources/39177__jobro__piano-ff-030.wav");
            a.sound();
        }
        if (e.getKeyChar() == 'g') {
            a = new Sound("src/main/resources/39178__jobro__piano-ff-031.wav");
            a.sound();
        }
        if (e.getKeyChar() == 'b') {
            a = new Sound("src/main/resources/39179__jobro__piano-ff-032.wav");
            a.sound();
        }
        if (e.getKeyChar() == 'q') {
            a = new Sound("src/main/resources/39180__jobro__piano-ff-033.wav");
            a.sound();
        }
        if (e.getKeyChar() == '2') {
            a = new Sound("src/main/resources/39181__jobro__piano-ff-034.wav");
            a.sound();
        }
        if (e.getKeyChar() == 'w') {
            a = new Sound("src/main/resources/39182__jobro__piano-ff-035.wav");
            a.sound();
        }
        if (e.getKeyChar() == '3') {
            a = new Sound("src/main/resources/39183__jobro__piano-ff-036.wav");
            a.sound();
        }
        if (e.getKeyChar() == 'e') {
            a = new Sound("src/main/resources/39184__jobro__piano-ff-037.wav");
            a.sound();
        }
        if (e.getKeyChar() == '4') {
            a = new Sound("src/main/resources/39185__jobro__piano-ff-038.wav");
            a.sound();
        }
        if (e.getKeyChar() == 'r') {
            a = new Sound("src/main/resources/39186__jobro__piano-ff-039.wav");
            a.sound();
        }
        if (e.getKeyChar() == 't') {
            a = new Sound("src/main/resources/39187__jobro__piano-ff-040.wav");
            a.sound();
        }
        if (e.getKeyChar() == '6') {
            a = new Sound("src/main/resources/39188__jobro__piano-ff-041.wav");
            a.sound();
        }
        if (e.getKeyChar() == 'y') {
            a = new Sound("src/main/resources/39189__jobro__piano-ff-042.wav");
            a.sound();
        }
        if (e.getKeyChar() == '7') {
            a = new Sound("src/main/resources/39190__jobro__piano-ff-043.wav");
            a.sound();
        }
        if (e.getKeyChar() == 'u') {
            a = new Sound("src/main/resources/39191__jobro__piano-ff-044.wav");
            a.sound();
        }
        if (e.getKeyChar() == 'i') {
            a = new Sound("src/main/resources/39193__jobro__piano-ff-045.wav");
            a.sound();
        }
        if (e.getKeyChar() == '9') {
            a = new Sound("src/main/resources/39194__jobro__piano-ff-046.wav");
            a.sound();
        }
        if (e.getKeyChar() == 'o') {
            a = new Sound("src/main/resources/39195__jobro__piano-ff-047.wav");
            a.sound();
        }
        if (e.getKeyChar() == '0') {
            a = new Sound("src/main/resources/39196__jobro__piano-ff-048.wav");
            a.sound();
        }
        if (e.getKeyChar() == 'p') {
            a = new Sound("src/main/resources/39197__jobro__piano-ff-049.wav");
            a.sound();
        }
        if (e.getKeyChar() == '-') {
            a = new Sound("src/main/resources/39198__jobro__piano-ff-050.wav");
            a.sound();
        }
        if (e.getKeyChar() == '[') {
            a = new Sound("src/main/resources/39199__jobro__piano-ff-051.wav");
            a.sound();
        }
        if (e.getKeyChar() == ']') {
            a = new Sound("src/main/resources/39200__jobro__piano-ff-052.wav");
            a.sound();
        }
        if (e.getKeyChar() == 'h') {
            a = new Sound("src/main/resources/39201__jobro__piano-ff-053.wav");
            a.sound();
        }
        if (e.getKeyChar() == 'n') {
            a = new Sound("src/main/resources/39202__jobro__piano-ff-054.wav");
            a.sound();
        }
        if (e.getKeyChar() == 'm') {
            a = new Sound("src/main/resources/39203__jobro__piano-ff-055.wav");
            a.sound();
        }
        if (e.getKeyChar() == 'j') {
            a = new Sound("src/main/resources/39204__jobro__piano-ff-056.wav");
            a.sound();
        }
    }

    public boolean isMenu() {
        return menu;
    }

    public boolean isGame() {
        return game;
    }
}
