package pianoSim;

public class Button {

    private int x;
    private int y;
    private int note;

    public Button(int x, int y, int note) {
        this.x = x;
        this.y = y;
        this.note = note;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getNote() {
        return note;
    }
}
