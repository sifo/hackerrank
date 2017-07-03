import java.util.*;

class SimpleArraySum {

	public static int sum(int [] t) {
		int res = 0;
		for(int i = 0; i < t.length; i++) {
			res += t[i];
		}
		return res;
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] t = new int [size];
		for(int i = 0; i < size; i++) {
			t[i] = sc.nextInt();
		}
		System.out.println(sum(t));
	}
}
