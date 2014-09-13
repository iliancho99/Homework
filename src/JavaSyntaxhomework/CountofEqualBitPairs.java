package JavaSyntaxhomework;
import java.util.Scanner;
public class CountofEqualBitPairs {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int equalbits = 0;
		String number = Integer.toBinaryString(n);
		for (int i = 0; i < number.length()-1; i++) {
			if (number.charAt(i) == number.charAt(i+1)) {
				equalbits++;
			}
		}
		System.out.println(equalbits);
		input.close();
	}
}
