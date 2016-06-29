/* TODO: A program that show the illusory contour
 * does.
 */
import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class IllusoryContours extends GraphicsProgram {
	/* The default width and height of the window. These constants will tell Java to
	 * create a window whose size is *approximately* given by these dimensions. You should
	 * not directly use these constants in your program; instead, use getWidth() and
	 * getHeight(), which return the *exact* width and height of the window.
	 */
	public static final int APPLICATION_WIDTH = 300;
	public static final int APPLICATION_HEIGHT = 300;
	public static final int CIRCLE_DIAMETER = 50;
	public static double x1=0,y1=0,x2=0,y2=0,x3=0,y3=0,x4=0,y4=0;
	public void run() {
		getCenter();
		showCircle();
		showRect();
	}

	private void getCenter() {
		// TODO Auto-generated method stub
		x1 = getWidth() - CIRCLE_DIAMETER;
		y1 = getHeight() - CIRCLE_DIAMETER;
		x2 = CIRCLE_DIAMETER;
		y2 = CIRCLE_DIAMETER;
		x3 = getWidth() - CIRCLE_DIAMETER;
		y3 = CIRCLE_DIAMETER;
		x4 = CIRCLE_DIAMETER;
		y4 = getHeight() - CIRCLE_DIAMETER;
		
	}
	
	private void showCircle(){
		GOval circle1 = new GOval(x1,y1,CIRCLE_DIAMETER,CIRCLE_DIAMETER);
		GOval circle2 = new GOval(x2,y2,CIRCLE_DIAMETER,CIRCLE_DIAMETER);
		GOval circle3 = new GOval(x3,y3,CIRCLE_DIAMETER,CIRCLE_DIAMETER);
		GOval circle4 = new GOval(x4,y4,CIRCLE_DIAMETER,CIRCLE_DIAMETER);
		System.out.println(x1+"+"+y1);
		System.out.println(x2+"+"+y2);
		System.out.println(x3+"+"+y3);
		System.out.println(x4+"+"+y4);
		circle1.setFilled(true);
		circle1.setFillColor(Color.red);
		add(circle1);
		circle2.setFilled(true);
		circle2.setFillColor(Color.blue);
		add(circle2);
		circle3.setFilled(true);
		circle3.setFillColor(Color.orange);
		add(circle3);
		circle4.setFilled(true);
		circle4.setFillColor(Color.BLACK);		
		add(circle4);
	}

	private void showRect() {
		// TODO Auto-generated method stub
		
	}
}
