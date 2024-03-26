package hw2;

// 九九乘法表,課本p.87
public class TestNineNine {

	public static void main(String[] arge) {
		for (int i = 1; i <= 9; i++) {
			int j = 1;
			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + (i * j)+"\t");
				j++;
			}
			System.out.println();
		}
		
		for (int a = 1; a <= 9; a++) {
			int b = 1;
			do {
				System.out.print(a + "*" + b + "=" + (a * b) + "\t");
				b++;
			} while (b <= 9);
			System.out.println();
		}
		
		int x=1;
		while(x<=9) {
			int y=1;
			do {
				System.out.print(x + "*" + y + "=" + (x * y) + "\t");
				y++;
			}while(y<=9);
			x++;
			System.out.println();
	}
}
}
