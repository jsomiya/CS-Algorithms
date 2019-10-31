import java.util.Arrays;
import java.util.Random;

public class QuickSort {
	public static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}

	public static void quickSort(int[] arr, int left, int right) {
		if (left >= right)
			return;

		// Set pivot
		int p = right;

		// Partition
		int i = left - 1; // Smaller part ends index
		int j = left; // Next compare with pivot index

		while (j < p) { // Loop until all elements before pivot has been compared
			if (arr[j] < arr[p]) {
				++i;
				if (i != j) {
					swap(arr, i, j);
				}
			}
			++j;
		}

		++i;
		swap(arr, i, p); // Swap value at pivot index and the first larger part element
		p = i;

		// Recursion
		quickSort(arr, left, p - 1);
		quickSort(arr, p + 1, right);
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int[] testArray = new Random().ints(0, 100).limit(20).toArray();

		System.out.println("Test Array: " + Arrays.toString(testArray));

		quickSort(testArray);

		System.out.println("After Quick Sort: " + Arrays.toString(testArray));
	}
}
