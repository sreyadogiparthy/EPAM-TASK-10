package EPAM.Task_10;
import java.util.ArrayList;
import java.util.Scanner;

public class AvgOfIntegerList {
	private static int sum;
	private static void avg(int sum, int num) {
		final double avg = sum / num;
		System.out.println(avg);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>(num);
		for(int i = 0; i < num; i++) {
			int z = sc.nextInt();
			arr.add(z);
			sum += z;
		}
		avg(sum, num);
		sc.close();
	}

}