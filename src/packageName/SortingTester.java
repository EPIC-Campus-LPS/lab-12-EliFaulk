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
			arr[i] = random.nextInt();
		}
		
		
		arr = QuadSorts.bubbleSort(arr);
		
		
		for (int num : arr) {
			System.out.print(num + ", ");
		}
		

	}

}
