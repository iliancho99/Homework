package JavaSyntaxhomework;
import java.util.Scanner;
public class CountofBitsOne {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int count = 0;
		for (int i = 0; i < 32; i++) {
			int bit = (num>>i) & 1;
			if (bit == 1) {
				count++;
			}
		}
		System.out.println(count);
		input.close();
	}
}
