package JavaSyntaxhomework;
import java.util.Locale;
import java.util.Scanner;
public class TheSmallestof3Numbers {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner input = new Scanner(System.in);
		
		float a = input.nextFloat();
		float b = input.nextFloat();
		float c = input.nextFloat();
		
		a = Math.min(a, b);
		float result = Math.min(a, c);
		
		System.out.println(result);
		input.close();

	}
}
