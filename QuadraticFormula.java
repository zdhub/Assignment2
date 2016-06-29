/* TODO: A program that the roots of the quadratic equation
 */
import acm.program.*;

public class QuadraticFormula extends ConsoleProgram {
	public int a,b,c;
	public Object discriminant;
	public void run() {
		getNumber();
		getRoots();
	}

	private void getNumber() {
		println("This program needs three intengers:");
		a = readInt("Enter first int a:");
		b = readInt("Enter second int b:");
		c = readInt("Enter third int c:");
	}

	private void getRoots() {
		getDiscriminant();
		showRoots();
	}

	private Object getDiscriminant() {
		
		double temp;
		temp = b*b - 4*a*c;
		if (temp < 0 ) discriminant = null;
		if (temp == 0) discriminant = Math.sqrt(b*b - 4*a*c);
		if (temp > 0) discriminant = Math.sqrt(b*b - 4*a*c);
		return discriminant;
	}

	private void showRoots() {
		
	}
}