package JavaSyntaxhomework;
import java.util.Locale;
import java.util.Scanner;
public class PointsinsidetheHouse {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		double y = input.nextDouble();
		 
		double x1 = 12.5, y1 = 8.5;
		double x2 = 22.5, y2 = 8.5;
		double x3 = 17.5, y3 = 3.5;
		double ABC = Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
		double ABP = Math.abs(x1 * (y2 - y) + x2 * (y - y1) + x * (y1 - y2));
		double APC = Math.abs(x1 * (y - y3) + x * (y3 - y1) + x3 * (y1 - y));
		double PBC = Math.abs(x * (y2 - y3) + x2 * (y3 - y) + x3 * (y - y2));
		boolean isInTriangle = ABP + APC + PBC == ABC;
		if (isInTriangle||
			((x>=12.5 && x <= 17.5) && (y>=8.5 && y<=13.5)) ||
			((x>=20.0 && x <= 22.5) && (y>=8.5 && y<=13.5))) {
			System.out.println("Inside");
		}else {
			System.out.println("Outside");
		}
		input.close();
	}
}
