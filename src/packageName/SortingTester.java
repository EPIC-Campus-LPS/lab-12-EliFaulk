package packageName;
import java.util.Scanner;
import java.util.Random;

public class SortingTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int length = sc.nextInt();
		sc.close();
		int[] arr = new int[length];
		
		for (int i = 0; i < arr.length; i++) {
			Random random = new Random();
			arr[i] = random.nextInt(100);
		}
		
		double start = System.currentTimeMillis();
		arr = QuadSorts.insertionSort(arr);
		double end = System.currentTimeMillis();
		
		for (int num : arr) {
			System.out.print(num + ", ");
		}
		
		double time = end - start;
		System.out.println("\n" + time);

	}

}
