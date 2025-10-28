package packageName;
import java.util.Arrays;

public class QuadSorts {
	
	
	public static int[] bubbleSort(int[] arr) {
		for (int i = arr.length-1; i > 1; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	
	public static int[] selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			
			for (int j = i+1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
	
	public static int[] insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		return arr;
	}
	
	public static int[] mergeSort(int[] arr) {
		if ((arr.length > 2) && (arr.length % 2 == 1)) {
			int[] arr1 = Arrays.copyOfRange(arr, 0, 1 + arr.length/2);
			int[] arr2 = Arrays.copyOfRange(arr, 1 + arr.length/2, arr.length);
			arr1 = mergeSort(arr1);
			arr2 = mergeSort(arr2);
			for (int i = 0; i < 1 + arr.length/2; i++) {
				arr[i] = arr1[i];
			}
			for (int i = 1 + arr.length/2; i < arr.length; i++) {
				arr[i] = arr2[i - 1 - arr.length/2];
			}
		} else if (arr.length > 2) {
			int[] arr1 = Arrays.copyOfRange(arr, 0, arr.length/2);
			int[] arr2 = Arrays.copyOfRange(arr, arr.length/2, arr.length);
			arr1 = mergeSort(arr1);
			arr2 = mergeSort(arr2);
			for (int i = )
		} else if (arr.length == 2) //BASE CASE (array is 2 numbers, sort them) {
			if (arr[0] > arr[1]) {
				int temp = arr[0];
				arr[0] = arr[1];
				arr[1] = temp;
			}
			return arr;
		} else {		//BASE CASE (array is a single number)
			return arr;
		}
	}
}
