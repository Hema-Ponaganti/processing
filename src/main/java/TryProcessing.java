import processing.core.PApplet;
public class TryProcessing extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int x=1;

    public static void main(String[] args) {
        PApplet.main("TryProcessing",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        //paintWhite();

    }

    private void drawCircle() {
        ellipse(x, HEIGHT/2, DIAMETER, DIAMETER);
        x++;
    }

    private void paintWhite() {
        background(125);
    }
}
