import processing.core.PApplet;
class Circle {
    public int count,x_axis,y_axis, diameter;

    public Circle(int left, int count,int height, int diameter) {
        this.x_axis = left;
        this.count=count;
        this.y_axis = height * count / 5;
        this.diameter = diameter;
    }
    public void changeBallPosition(){
        this.x_axis += this.count;
    }
}
public class OOPsFourBallsChallenge extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    public static final int LEFT = 0;
    public static Circle[] circleNo;

    public static void main(String[] args) {
        PApplet.main("ProceduralFourBallsChallenge",args);
        circleNo =new Circle[4];
        for (int i = 1; i <= 4; i++)
            circleNo[i] = new Circle(LEFT,i,HEIGHT,DIAMETER);

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
        for (int i = 1; i <=4 ; i++) {
            drawCircle(circleNo[i]);
            circleNo[i].changeBallPosition();
        }
    }

    private void drawCircle(Circle n) {
        ellipse(n.x_axis, n.y_axis, n.diameter, n.diameter);
    }
}
