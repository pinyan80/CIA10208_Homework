package hw2;

public class hw2 {
	public static void main(String[] arge) {
		int j = 0;
		for (int i = 0; i <= 1000; i += 2) {
			j += i;
		}
		System.out.println(j);

		int x = 1;
		for (int y = 1; y <= 10; ++y) {
			x *= y;
		}
		System.out.println(x);

		int a = 1;
		int b = 2;
		while (b <= 10) {
			a *= b;
			b++;
		}
		System.out.println(a);

		for (int c = 1; c <= 10; c++) {
			System.out.print(c * c);
		}

		int g = 0;
		for (int d = 1; d <= 49; d++) {
			int e = d % 10;
			int f = d / 10;
			if (e != 4 && f != 4) {
				System.out.println(d);
				g++;
			}
		}
		System.out.println(g);

		for (int m = 10; m >= 1; m--) {
			for (int n = 1; n <= m; n++) {
				System.out.print(n + " ");
			}
			System.out.println();
		}

		char o = 'A';
		for (int k = 1; k <= 6; k++) {
			for (int r = 1; r <= k; r++) {
				System.out.print(o + " ");
			}
			o++;
			System.out.println();
		}
	}

}
