package JavaSyntaxhomework;
import java.util.Scanner;
public class DecimaltoHexadecimal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		String hexnumber = Integer.toHexString(number).toUpperCase();
		System.out.println(hexnumber);
		input.close();
	}
}
