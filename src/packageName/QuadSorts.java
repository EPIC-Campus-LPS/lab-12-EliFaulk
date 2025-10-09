package packageName;

public class QuadSorts {
	
	
	public static int[] bubbleSort(int[] arr) {
		for (int i = arr.length-2; i > 1; i++) {
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
		
	}
	
	public static int[] insertionSort(int[] arr) {
		
	}
	
	public static int[] mergeSort(int[] arr) {
		
	}
}
