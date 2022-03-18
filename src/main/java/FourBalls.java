import processing.core.PApplet;

public class FourBalls extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 20;
    int x1=0;
    int x2=0;
    int x3=0;
    int x4=0;

    public static void main(String[] args) {
        PApplet.main("FourBalls",args);}

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);

    }

    @Override
    public void setup() {

        drawCircle(x1,HEIGHT/5,1);
        drawCircle(x2,(2*HEIGHT/5),2);
        drawCircle(x3,(3*HEIGHT/5),3);
        drawCircle(x4,(4*HEIGHT/5),4);
    }

    @Override
    public void draw() {

        x1=drawCircle(x1,HEIGHT/5,1);
        x2=drawCircle(x2,(2*HEIGHT/5),2);
        x3=drawCircle(x3,(3*HEIGHT/5),3);
        x4=drawCircle(x4,(4*HEIGHT/5),4);
    }

    private int drawCircle(int x,int height,int increment) {
        ellipse(x,height, DIAMETER,DIAMETER);
        x+=increment;
        return x;
    }

 }


