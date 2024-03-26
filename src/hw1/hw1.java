package hw1;

public class hw1 {
	public static void main(String[] arge) {
		// 1
		int num1 = 12;
		int num2 = 6;

		System.out.println(num1 + num2);
		System.out.println(num1 * num2);

		// 2
		int num3 = 200;
		System.out.println((num3 / 12) + "打" + (num3 % 12) + "顆");

		// 3
		int num4 = 256559, hrs = 24, mins = 60, secs = 60;
		int daysec = hrs * mins * secs;
		int hrsec = mins * secs;

		System.out.println("256599秒為" + (num4 / daysec) + "天" + (num4 % daysec / hrsec) + "時"
				+ (num4 % daysec % hrsec / secs) + "分" + (num4 % daysec % hrsec % secs) + "秒");

		// 4
		double Pi = 3.1415;
		int R = 5;
		System.out.println("圓面積 =" + (R * R * Pi));
		System.out.println("圓周長 =" + (R * 2 * Pi));

		// 5
		int x = 1_500_000;
		double y = 0.02;
		double z = x * (1 + y); // 第一年
		for (int i = 2; i <= 10; i++) {
			z *= (1 + y); // 第二年才開始複利
		}
		System.out.println(z);

		// 6
		System.out.println(5 + 5);    //10,因為是整數加整數
		System.out.println(5 + '5');  //58,因為'5'在Unicode裡是0035(十六進為),轉換為十進位為整數53
		System.out.println(5 + "5");  //55,因為"5"為字串

	}

}
