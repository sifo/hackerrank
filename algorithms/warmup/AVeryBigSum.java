import java.util.Scanner;

class AVeryBigSum {

	public static long sum(long [] t) {
		long res = 0;
		for(int i = 0; i < t.length; i++) {
			res += t[i];
		}
		return res;
	}

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		long [] t = new long[size];
		for(int i = 0; i < size; i++) {
			t[i] = sc.nextInt();
		}
		System.out.println(sum(t));
	}
}
