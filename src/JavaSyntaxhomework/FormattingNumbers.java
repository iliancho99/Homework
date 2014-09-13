package JavaSyntaxhomework;

import java.util.Locale;
import java.util.Scanner;

public class FormattingNumbers {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		float b = input.nextFloat();
		float c = input.nextFloat();
		String atohex = Integer.toHexString(a);
		String atobin = Integer.toBinaryString(a);
		atobin = String.format("%10s", atobin).replace(" ", "0");
		System.out.printf("|%1$-10s|%2$s|%3$10.2f|%4$-10.3f|",atohex.toUpperCase(), atobin,b, c);
		input.close();
	}

}
